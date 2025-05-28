package com.consorcio.AbelLuizBrunoConsorcio.DTOS;

import java.time.LocalDateTime;

public record ConsorcioDTO(
        Long id,
        String nome,
        double valor,
        Integer parcelas,
        LocalDateTime dataCriacao
) {}
