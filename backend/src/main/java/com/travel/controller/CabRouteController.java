package com.travel.controller;
import com.travel.TravelApplication;
import com.travel.entity.CabRoute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/routes")
@CrossOrigin("*")
public class CabRouteController {

 private static final Logger logger = LoggerFactory.getLogger(CabRouteController.class);


 private List<CabRoute> data = new ArrayList<CabRoute>(Arrays.asList(
         new CabRoute().withSource("Agra"),new CabRoute().withSource("Delhi")));

 @GetMapping
 public List<CabRoute> all(){ return data; }

 @PostMapping
 public CabRoute add(@RequestBody CabRoute r){
  r.setSlug((r.getSource()+"-to-"+r.getDestination()+"-cab").toLowerCase());
  data.add(r);
  return r;
 }
}
