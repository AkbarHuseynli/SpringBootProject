package com.example.service;

import com.example.dto.request.AccountRequestDTO;
import com.example.dto.request.SignUpRequestDTO;
import com.example.entity.Account;

public interface AccountService {

     void add(AccountRequestDTO accountRequestDTO);
     Account add(SignUpRequestDTO signUpRequestDTO);

     Account save(Account account);




     
}
