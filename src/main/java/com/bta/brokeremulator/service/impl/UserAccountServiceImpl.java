package com.bta.brokeremulator.service.impl;

import com.bta.brokeremulator.model.UserAccount;
import com.bta.brokeremulator.repository.UserAccountRepository;
import com.bta.brokeremulator.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository repository;


    @Override
    public UserAccount save(UserAccount userAccount) {
        checkUsername(userAccount.getUsername());
        checkEmail(userAccount.getEmail());
        checkPhone(userAccount.getPhone());
        return repository.save(userAccount);

    }



    @Override
    public UserAccount login(String username, String password) {
        final UserAccount userAccountFromDb  = repository.findByUsername(username);
        if(userAccountFromDb != null){
            if(userAccountFromDb.getPassword().equals(password))return userAccountFromDb;


        }
        throw  new  RuntimeException();

    }





    private void checkEmail(String email) {
        final UserAccount userAccountFromDb  = repository.findByEmail(email);
        if(userAccountFromDb != null){
            throw  new RuntimeException("User with email: " + email + "already exists");
        }
    }

    private void checkUsername(String username) {
       final UserAccount userAccountFromDb  = repository.findByUsername(username);
       if(userAccountFromDb != null){
           throw  new RuntimeException("User with username:" + username + "already exists");
       }
    }

    private void checkPhone(String phone) {
        final UserAccount userAccountFromDb = repository.findByPhone(phone);
        if(userAccountFromDb != null){
            throw  new RuntimeException("User with phone:" + phone +"already exists");
        }
    }
}
