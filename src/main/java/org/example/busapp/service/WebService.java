package org.example.busapp.service;

import org.example.busapp.model.jour.JourResponse;
import org.example.busapp.model.stop.StopResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class WebService {

    @Autowired
    private WebClient webClient;

    @Value("${api.api_key}")
    private String API_KEY;

    @Value("${api.base_url}")
    private String BASE_URL;

    public Flux<JourResponse> jourApiCall() {
        return webClient
                .get()
                .uri(BASE_URL + "model=jour&key=" + API_KEY + "&DefaultTransportModeCode=BUS")
                .retrieve()
                .bodyToFlux(JourResponse.class);
    }

    public Flux<StopResponse> stopApiCall() {
        return webClient
                .get()
                .uri(BASE_URL + "model=stop&key=" + API_KEY + "&DefaultTransportModeCode=BUS")
                .retrieve()
                .bodyToFlux(StopResponse.class);
    }
}
