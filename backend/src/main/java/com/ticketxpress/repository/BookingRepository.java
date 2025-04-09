package main.java.com.ticketxpress.repository;

import com.ticketxpress.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Additional methods if needed (e.g., find by email or date)
}
