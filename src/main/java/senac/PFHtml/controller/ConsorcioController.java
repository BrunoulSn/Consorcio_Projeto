package senac.PFHtml.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senac.PFHtml.Model.Consorcio;
import senac.PFHtml.repository.ConsorcioRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consorcios")
@CrossOrigin("*")
public class ConsorcioController {

    @Autowired
    private ConsorcioRepository repository;
    // Listar todos os consórcios
    @GetMapping
    ResponseEntity<List<Consorcio>> getAll() {
        List<Consorcio> consorcios = repository.findAll();
        if (consorcios.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(consorcios);
        }
        return ResponseEntity.ok(consorcios);
    }

    // Buscar consórcio por ID
    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {
        Optional<Consorcio> consorcio = repository.findById(id);
        if (consorcio.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Consórcio não encontrado");
        }
        return ResponseEntity.ok(consorcio.get());
    }

    // Criar novo consórcio
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Consorcio consorcio) {
        consorcio.setDataCriacao(LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(consorcio));
    }

    // Atualizar consórcio
    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody Consorcio novoConsorcio) {
        Optional<Consorcio> consorcioOptional = repository.findById(id);
        if (consorcioOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Consórcio não encontrado");
        }

        Consorcio consorcio = consorcioOptional.get();
        BeanUtils.copyProperties(novoConsorcio, consorcio, "id", "dataCriacao");

        return ResponseEntity.ok(repository.save(consorcio));
    }

    // Deletar consórcio
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        Optional<Consorcio> consorcio = repository.findById(id);
        if (consorcio.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Consórcio não encontrado");
        }
        repository.delete(consorcio.get());
        return ResponseEntity.ok("Consórcio deletado com sucesso");
    }
}
