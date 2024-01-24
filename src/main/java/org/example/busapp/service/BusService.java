package org.example.busapp.service;

import org.example.busapp.model.jour.JourResponse;
import org.example.busapp.model.stop.StopResponse;
import reactor.core.publisher.Flux;

import java.util.List;

public interface BusService {
    Flux<StopResponse> getStop();
    Flux<JourResponse> getJour();

    List<String> getTopTenBusRoutes();
}
