package com.ms.crud.authentication.service;

import com.ms.crud.models.UserModel;
import com.ms.crud.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service(value = "UserDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel optionalUser = userRepository.findByEmail(email);
        if(optionalUser == null) {
            throw new UsernameNotFoundException("User related to ["+ email + "] not found");
        }

        return new UserDataDetails(optionalUser) {
        };

    }
}