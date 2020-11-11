package com.bta.brokeremulator.service;


import com.bta.brokeremulator.model.UserAccount;
import org.springframework.stereotype.Service;


public interface UserAccountService {
    UserAccount save(UserAccount userAccount);

    UserAccount login(String username, String password);

}
