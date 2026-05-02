package com.travel.entity;

import jakarta.persistence.*;

@Entity
public class CabRoute {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String source;
 private String destination;
 private String vehicleType;
 private Double price;
 private String slug;

 // ======================
 // Constructors
 // ======================

 public CabRoute() {
 }

 public CabRoute(Long id, String source, String destination,
                 String vehicleType, Double price, String slug) {
  this.id = id;
  this.source = source;
  this.destination = destination;
  this.vehicleType = vehicleType;
  this.price = price;
  this.slug = slug;
 }

 // ======================
 // Getters
 // ======================

 public Long getId() {
  return id;
 }

 public String getSource() {
  return source;
 }

 public String getDestination() {
  return destination;
 }

 public String getVehicleType() {
  return vehicleType;
 }

 public Double getPrice() {
  return price;
 }

 public String getSlug() {
  return slug;
 }

 // ======================
 // Setters (JPA friendly)
 // ======================

 public void setId(Long id) {
  this.id = id;
 }

 public void setSource(String source) {
  this.source = source;
 }

 public void setDestination(String destination) {
  this.destination = destination;
 }

 public void setVehicleType(String vehicleType) {
  this.vehicleType = vehicleType;
 }

 public void setPrice(Double price) {
  this.price = price;
 }

 public void setSlug(String slug) {
  this.slug = slug;
 }

 // ======================
 // Fluent "with" methods (immutable-style chaining)
 // ======================

 public CabRoute withId(Long id) {
  this.id = id;
  return this;
 }

 public CabRoute withSource(String source) {
  this.source = source;
  return this;
 }

 public CabRoute withDestination(String destination) {
  this.destination = destination;
  return this;
 }

 public CabRoute withVehicleType(String vehicleType) {
  this.vehicleType = vehicleType;
  return this;
 }

 public CabRoute withPrice(Double price) {
  this.price = price;
  return this;
 }

 public CabRoute withSlug(String slug) {
  this.slug = slug;
  return this;
 }
}