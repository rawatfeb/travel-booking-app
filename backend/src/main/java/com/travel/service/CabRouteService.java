package com.travel.service;

import com.travel.entity.CabRoute;
import com.travel.repository.CabRouteRepository;

import java.util.List;

public class CabRouteService {
    private CabRouteRepository repository;

    public List<CabRoute> findRoutes(String source, String destination) {
        return repository.findBySourceAndDestination(source, destination);
    }

    public double calculatePrice(String vehicleType, double distanceKm) {

        double base = switch (vehicleType) {
            case "SEDAN" -> 10;
            case "SUV" -> 15;
            case "PREMIUM" -> 25;
            default -> 10;
        };

        return base * distanceKm;
    }
}
