package com.example.controller;

import com.example.dto.request.SignUpRequestDTO;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    private final UserRepository userRepository;
    @PostMapping
    public boolean addUser(@RequestBody SignUpRequestDTO signUpRequestDTO){
        return userService.addUser(signUpRequestDTO);
    }

    @GetMapping
    public User getUserById(@RequestParam Long userId){
        return userRepository.getReferenceById(userId);
    }

}
