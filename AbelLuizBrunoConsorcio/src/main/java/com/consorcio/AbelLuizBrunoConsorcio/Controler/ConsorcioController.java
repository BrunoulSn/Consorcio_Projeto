package com.consorcio.AbelLuizBrunoConsorcio.Controler;

import com.consorcio.AbelLuizBrunoConsorcio.DTOS.ConsorcioDTO;
import com.consorcio.AbelLuizBrunoConsorcio.WebClientMocky.WebClientMocky;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ConsorcioController {

    private final WebClientMocky webClientMocky;

    public ConsorcioController(WebClientMocky webClientMocky) {
        this.webClientMocky = webClientMocky;
    }

    // Novo endpoint para dados do backend
    @GetMapping("/consorciosalan")
    public Flux<ConsorcioDTO> listarConsorciosDoBackend() {
        return webClientMocky.getConsorciosDoBackend();
    }
}


