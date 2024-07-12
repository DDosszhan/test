package com.example;

public class Main {

    public static void main(String[] args) {
        MyApplication app = ServiceInjector.getApplication();
        app.processMessages("Hello, World!", "example@example.com");
    }
}