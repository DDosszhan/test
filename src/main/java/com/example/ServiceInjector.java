package com.example;

import com.example.Services.EmailService;

public class ServiceInjector {

    public static MyApplication getApplication() {
        // Inject EmailService dependency to MyApplication
        return new MyApplication(new EmailService());
    }
}