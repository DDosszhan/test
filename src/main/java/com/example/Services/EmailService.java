package com.example.Services;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        // Logic to send email
        System.out.println("Email sent to " + receiver + " with message: " + message);
    }
}
