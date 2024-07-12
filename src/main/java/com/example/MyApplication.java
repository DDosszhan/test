package com.example;

import com.example.Services.MessageService;

public class MyApplication {

    private MessageService messageService;

    // Constructor-based Dependency Injection
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessages(String message, String receiver) {
        // Some business logic
        this.messageService.sendMessage(message, receiver);
    }
}