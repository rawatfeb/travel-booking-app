package com.travel.controller;

import com.travel.entity.CabRoute;
import com.travel.service.CabRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private CabRouteService service;

    @GetMapping
    public List<CabRoute> search(
            @RequestParam String source,
            @RequestParam String destination) {

        return service.findRoutes(source, destination);
    }
}