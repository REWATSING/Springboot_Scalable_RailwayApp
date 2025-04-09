package com.ticketxpress.model; // JPA and Lombok imports
import jakarta.persistence.*;
import lombok.*;

// Marks this class as a JPA entity mapped to a database table
@Entity

// Lombok annotations to generate boilerplate code like getters, setters, constructors, etc.
@Data                   // Generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor      // Generates a no-args constructor
@AllArgsConstructor     // Generates a constructor with all fields

// Specifies the table name in the database as "users"
@Table(name = "users")
public class User {

    // Primary key with auto-increment strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // User's full name
    private String fullname;

    // User's email address
    private String email;

    // User's hashed password
    private String password;
}
