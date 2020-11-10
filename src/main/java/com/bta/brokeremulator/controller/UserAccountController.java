package com.bta.brokeremulator.controller;


import com.bta.brokeremulator.model.UserAccount;
import com.bta.brokeremulator.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;


    @GetMapping("/hello")
    public String index(){
        return "hello";
    }

    @PostMapping("/register")
    public ResponseEntity<UserAccount> registrateUser(@RequestBody UserAccount userAccount){

        UserAccount registratedUserAccount = userAccountService.save(userAccount);
        return  new ResponseEntity<>(registratedUserAccount, HttpStatus.OK);
    }




}
