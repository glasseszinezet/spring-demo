package com.devproxy.instaant.services.security;

public class PasswordHashService implements HashService{
    @Override
    public String getHash() {
        return "Password Hash From PasswordHashService";
    }
}
