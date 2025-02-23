package com.grouplearning.start.controller;

import com.grouplearning.start.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*") // Allows frontend requests
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Dummy authentication (replace with DB check later)
        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";
        }
    }
}
