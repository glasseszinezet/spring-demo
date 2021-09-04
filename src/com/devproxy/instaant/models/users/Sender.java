package com.devproxy.instaant.models.users;

public class Sender implements User{
    @Override
    public String getGreetingMessage() {
        return "Hello From The Sender Class";
    }

    @Override
    public String getPasswordHash() {
        return "Sender Hash";
    }
}
