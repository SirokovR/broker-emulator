package com.bta.brokeremulator.controller;


import com.bta.brokeremulator.model.UserAccount;
import com.bta.brokeremulator.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/login")
    public ResponseEntity<UserAccount> loginUser(@RequestParam(name="username") String login,
                                                 @RequestParam String password){
        UserAccount registratedUserAccount =userAccountService.login(login,password);

        if (registratedUserAccount == null) {
            return  new ResponseEntity<>(registratedUserAccount, HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(registratedUserAccount, HttpStatus.OK);
    }

}
