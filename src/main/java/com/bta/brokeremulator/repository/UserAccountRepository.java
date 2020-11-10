package com.bta.brokeremulator.repository;

import com.bta.brokeremulator.model.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

    UserAccount findByUsername(String username);
    UserAccount findByEmail(String email);
    UserAccount findByPhone(String phone);
}
