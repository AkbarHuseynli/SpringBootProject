package com.example.controller;

import com.example.dto.request.AccountRequestDTO;
import com.example.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public void addAccount(@RequestBody AccountRequestDTO accountRequestDTO) {
        accountService.add(accountRequestDTO);
    }


}
