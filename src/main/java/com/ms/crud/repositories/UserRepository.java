package com.ms.crud.repositories;

import com.ms.crud.entities.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository  extends JpaRepository<UserModel, Integer> {

    UserModel findByEmail(String username);
    UserModel findByUserId(Integer userId);
}
