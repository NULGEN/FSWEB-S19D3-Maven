package com.workintech.s19d2.controller;

import com.workintech.s19d2.entity.Account;
import com.workintech.s19d2.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/account")
public class AccountController {

    private  final AccountService accountService;

    @GetMapping
    public List<Account> findAlL(){
        return accountService.findAll();
    }


    @PostMapping
    public Account save(@RequestBody Account account){
            return accountService. save(account);
    }
}
