package com.user_management.service;

import com.user_management.model.User;
import com.user_management.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
