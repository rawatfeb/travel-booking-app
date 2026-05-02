package com.travel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelApplication {

 private static final Logger logger = LoggerFactory.getLogger(TravelApplication.class);

 public static void main(String[] args){
  logger.info("starting TravelApplication... .");

  SpringApplication.run(TravelApplication.class,args);
 }
}
