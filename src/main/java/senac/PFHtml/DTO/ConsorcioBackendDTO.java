package senac.PFHtml.DTO;

import java.time.LocalDateTime;

public record ConsorcioBackendDTO(
        Long id,
        String nome,
        double valor,
        Integer parcelas,
        LocalDateTime dataCriacao
) {}
