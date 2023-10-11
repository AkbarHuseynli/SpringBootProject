package com.example.service;

import com.example.dto.request.AccountRequestDTO;
import com.example.dto.request.SignUpRequestDTO;
import com.example.entity.Account;
import com.example.entity.ERole;
import com.example.entity.Role;
import com.example.repository.AccountRepository;
import com.example.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    private final RoleRepository roleRepository;

    @Override
    public void add(AccountRequestDTO accountRequestDTO) {

        if (!accountRepository.existsByUsername(accountRequestDTO.getUsername())) {
            Role role = roleRepository.findByRoleName(ERole.USER);
            Account account = Account.builder()
                    .username(accountRequestDTO.getUsername())
                    .password(accountRequestDTO.getPassword())
                    .roles(List.of(role))
                    .build();
            accountRepository.save(account);
        } else {
            System.out.println("USERNAME EXISTS");
        }
    }

    @Override
    public Account add(SignUpRequestDTO signUpRequestDTO) {
            Role role = roleRepository.findByRoleName(ERole.USER);
            Account account = Account.builder()
                    .username(signUpRequestDTO.getUsername())
                    .password(signUpRequestDTO.getPassword())
                    .roles(List.of(role))
                    .isActive(true)
                    .build();
            return accountRepository.save(account);
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

}
