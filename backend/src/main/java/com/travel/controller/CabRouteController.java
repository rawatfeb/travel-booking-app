package com.travel.controller;
import com.travel.entity.CabRoute;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/routes")
@CrossOrigin("*")
public class CabRouteController {

 private List<CabRoute> data = new ArrayList<>();

 @GetMapping
 public List<CabRoute> all(){ return data; }

 @PostMapping
 public CabRoute add(@RequestBody CabRoute r){
  r.setSlug((r.getSource()+"-to-"+r.getDestination()+"-cab").toLowerCase());
  data.add(r);
  return r;
 }
}
