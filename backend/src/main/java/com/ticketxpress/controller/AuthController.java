package main.java.com.ticketxpress.controller;

import com.ticketxpress.model.User;
import com.ticketxpress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // Allow frontend (Angular) to access
public class AuthController {

    @Autowired
    private UserService userService;

    // Register endpoint
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        try {
            userService.registerUser(user);
            return "Registration successful!";
        } catch (RuntimeException e) {
            return "Registration failed: " + e.getMessage();
        }
    }

    // Login endpoint
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        try {
            User loggedInUser = userService.login(user.getEmail(), user.getPassword());
            return "Login successful. Welcome, " + loggedInUser.getFullname() + "!";
        } catch (RuntimeException e) {
            return "Login failed: " + e.getMessage();
        }
    }
}
