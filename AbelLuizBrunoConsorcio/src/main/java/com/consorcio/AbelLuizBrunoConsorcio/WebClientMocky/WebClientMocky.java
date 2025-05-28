package com.consorcio.AbelLuizBrunoConsorcio.WebClientMocky;

import com.consorcio.AbelLuizBrunoConsorcio.DTOS.ConsorcioDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class WebClientMocky {

    private final WebClient backendClient;

    public WebClientMocky(WebClient.Builder builder) {
        this.backendClient = builder.baseUrl("http://localhost:8080").build();
    }


    public Flux<ConsorcioDTO> getConsorciosDoBackend() {
        return backendClient.get()
                .uri("/consorcios")
                .retrieve()
                .bodyToFlux(ConsorcioDTO.class);
    }

}
