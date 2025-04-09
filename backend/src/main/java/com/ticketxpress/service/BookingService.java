package main.java.com.ticketxpress.service;

import com.ticketxpress.model.Booking;
import com.ticketxpress.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Save a new booking
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    // Optional: retrieve all bookings (e.g., for admin)
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
