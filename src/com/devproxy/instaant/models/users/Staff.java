package com.devproxy.instaant.models.users;

import com.devproxy.instaant.services.security.PasswordHashService;

public class Staff implements User{

    private final PasswordHashService  passwordHashService;

    public Staff(PasswordHashService passwordHashService){
        this.passwordHashService = passwordHashService;
    }


    @Override
    public String getGreetingMessage() {
        return "Hello From the Staff Class";
    }

    @Override
    public String getPasswordHash() {
        return "staff hasher: "+this.passwordHashService.getHash();
    }


}
