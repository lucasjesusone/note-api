package com.ms.crud.services;

import com.ms.crud.entities.UserModel;
import com.ms.crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

        @Autowired
        UserRepository userRepository;

        PasswordEncoder passwordEncoder;

        public UserModel create(UserModel userModel) {
                this.passwordEncoder = new BCryptPasswordEncoder();
                String encodedPassword = this.passwordEncoder.encode(userModel.getPassword());
                userModel.setPassword(encodedPassword);
                return userRepository.save(userModel);
        }

        public List<UserModel> findAll() {
                return userRepository.findAll();

        }


        public Optional<UserModel> getById(Integer id) {
                return userRepository.findById(id);
        }

        public UserModel updateUser(UserModel userModel) {
                return userRepository.save(userModel);
        }

        public void deleteUser(Integer id) {
                userRepository.deleteById(id);
        ;}


}
