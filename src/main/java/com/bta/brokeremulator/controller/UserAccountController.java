package com.bta.brokeremulator.controller;

import com.bta.brokeremulator.model.UserAccount;
import com.bta.brokeremulator.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;

    @GetMapping("/")
    public String getIndexView(){
        return "home";
    }

    @GetMapping("registration")
    public  String getRegistrationView(){
        //return "templates/registration.ftl";
        return "user/registration";
    }

    @PostMapping("registration")
    public ResponseEntity<UserAccount> registrateUser(@ModelAttribute UserAccount userAccount){
        UserAccount registratedUserAccount = userAccountService.save(userAccount);
        return  new ResponseEntity<>(registratedUserAccount, HttpStatus.OK);
    }


    @GetMapping("login")
    public String getLoginView(){
        return "user/login";
    }



   /* @PostMapping("/login")
    public ResponseEntity<UserAccount> loginUser(@RequestParam(name="username") String login,
                                                 @RequestParam String password){
        final UserAccount registratedUserAccount =userAccountService.login(login,password);

        if (registratedUserAccount == null) {
            return  new ResponseEntity<>(registratedUserAccount, HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(registratedUserAccount, HttpStatus.OK);
    }*/
}
