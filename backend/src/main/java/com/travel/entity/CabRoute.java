package com.travel.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class CabRoute {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String source;
 private String destination;
 private String vehicleType;
 private Double price;
 private String slug;
}
