package com.example.service;

import com.example.dto.request.SignUpRequestDTO;
import com.example.entity.Account;
import com.example.entity.ERole;
import com.example.entity.Role;
import com.example.entity.User;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final AccountService accountService;

    @Override
    public boolean addUser(SignUpRequestDTO signUpRequestDTO) {
        Account account = accountService.add(signUpRequestDTO);
        User user = User.builder()
                .email(signUpRequestDTO.getEmail())
                .phone(signUpRequestDTO.getPhone())
                .firstname(signUpRequestDTO.getFirstname())
                .surname(signUpRequestDTO.getSurname())
                .account(account).
                build();
        userRepository.save(user);
        return true;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
