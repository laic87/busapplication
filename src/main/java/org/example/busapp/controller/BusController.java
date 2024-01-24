package org.example.busapp.controller;

import org.example.busapp.model.jour.JourResponse;
import org.example.busapp.model.stop.StopResponse;
import org.example.busapp.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class BusController {

    @Autowired
    private BusService busService;

    // just for testing
    @GetMapping(value = "/stop")
    public Flux<StopResponse> stop() {
        return busService.getStop();
    }

    // just for testing
    @GetMapping(value = "/jour")
    public Flux<JourResponse> jour() {
        return busService.getJour();
    }

    @GetMapping(value = "/busroutes")
    public List<String> getRoutes() {
        return busService.getTopTenBusRoutes();
    }
}