package com.example.first.controller;

import com.example.first.dto.LoginRequest;
import com.example.first.dto.UserRequest;
import com.example.first.security.tokenUtils.TokenTool;
import com.example.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/public")
@CrossOrigin
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private TokenTool tokenTool;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public String getToken(){
        return "SUCCESS";
    }


    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginRequest loginRequest){
        return userService.login(loginRequest);
    }


    @PostMapping("/create")
    public void create(@RequestBody UserRequest userRequest) throws IOException {
        userService.create(userRequest);

    }
}
