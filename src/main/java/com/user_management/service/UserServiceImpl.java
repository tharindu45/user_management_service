package com.user_management.service;

import com.user_management.model.Role;
import com.user_management.model.User;
import com.user_management.repository.UserRepository;
import com.user_management.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {



    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
       User user =new User(registrationDto.getFirstName(),registrationDto.getLastName(),
               registrationDto.getEmail(),registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));

       return userRepository.save(user);
    }
}
