package org.example.busapp.service;

import org.example.busapp.model.jour.JourResponse;
import org.example.busapp.model.stop.StopResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private WebService webService;

    @Override
    public Flux<StopResponse> getStop() {
        return webService.stopApiCall();
    }

    @Override
    public Flux<JourResponse> getJour() {
        return webService.jourApiCall();
    }

    @Override
    public List<String> getTopTenBusRoutes() {
        return List.of("Here will the magic happen");
    }
}
