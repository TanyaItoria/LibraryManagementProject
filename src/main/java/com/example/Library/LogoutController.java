package com.example.Library;

import org.springframework.stereotype.Component;

@Component
public class LogoutController {
    public void logout() {
        System.out.println("You are successfully Logged out.");
        System.out.println("Thank you!");
    }
}
