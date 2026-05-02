package com.travel.controller;

import com.travel.entity.Booking;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin("*")
public class PaymentController {


    @PostMapping("/create")
    public String createOrder(@RequestBody Booking booking) {
        return razorpayService.createOrder(booking.getPrice());
    }

}
