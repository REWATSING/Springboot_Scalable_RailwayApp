package com.ticketxpress.controller;

import com.ticketxpress.model.Booking;
import com.ticketxpress.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking")
@CrossOrigin(origins = "*") // Allow frontend (Angular) to access
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Submit a booking
    @PostMapping("/submit")
    public String submitBooking(@RequestBody Booking booking) {
        try {
            bookingService.createBooking(booking);
            return "Booking confirmed for " + booking.getName() + "!";
        } catch (Exception e) {
            return "Booking failed: " + e.getMessage();
        }
    }
}
