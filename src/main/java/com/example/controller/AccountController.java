package com.example.controller;

import com.example.entity.Account;
import com.example.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

//    private final AccountRepository accountRepository;
//    public AccountController(AccountRepository accountRepository){
//        this.accountRepository = accountRepository;

    public List<Account> getAccountList() {
        return accountService.getAccountList();
    }


}
