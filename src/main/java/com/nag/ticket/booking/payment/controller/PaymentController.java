package com.nag.ticket.booking.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/payments")
public class PaymentController {

//    @PostMapping("/create_booking")
//    public ResponseEntity<ResponseDto> createBooking(@Valid @RequestBody BookingDtos booking){
//        log.info("Entered into payment controller to create a new payment "+booking);
//        return new ResponseEntity<>(bookingService.createBooking(booking), HttpStatus.CREATED);
//    }

    @GetMapping ("/get")
    public String createPayment(){
        return "Hey your Payment was success";
    }

}
