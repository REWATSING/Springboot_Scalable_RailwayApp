package main.java.com.ticketxpress.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String date;
    private String time;

    private String source;       // 🧭 Starting point of journey
    private String destination;  // 📍 Destination of journey
}
