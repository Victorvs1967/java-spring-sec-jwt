package com.vvs.javaspringjwt.rest;

import java.util.List;

import com.vvs.javaspringjwt.model.User;
import com.vvs.javaspringjwt.service.UserService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    private UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }

    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> getAll() {
        return this.userService.getAll();
    }
}
