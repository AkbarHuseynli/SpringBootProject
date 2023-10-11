package com.example.service;

import com.example.dto.request.SignUpRequestDTO;
import com.example.entity.User;

import java.util.List;

public interface UserService {
   boolean addUser(SignUpRequestDTO signUpRequestDTO);

   User getUserById(Long id);

   List<User> getAllUser();
}
