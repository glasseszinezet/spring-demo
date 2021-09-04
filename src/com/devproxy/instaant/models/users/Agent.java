package com.devproxy.instaant.models.users;

public class Agent implements User{
    @Override
    public String getGreetingMessage() {
        return "Hello From The Agent Class";
    }

    @Override
    public String getPasswordHash() {
        return "agent hasher: ";
    }
}
