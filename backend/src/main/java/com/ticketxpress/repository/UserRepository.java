package com.ticketxpress.repository;

import com.ticketxpress.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Used for login check
    User findByEmail(String email);
}
