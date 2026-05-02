package com.travel.repository;

import com.travel.entity.CabRoute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CabRouteRepository extends JpaRepository<CabRoute, Long> {

    List<CabRoute> findBySourceAndDestination(String source, String destination);
}