package com.timelinelp.api.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timelinelp.api.user.dto.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public UserResponse postUser(@RequestBody UserRequest userDTO) throws Exception{
        UserResponse response = service.registerUser(userDTO);
        return response;
    }

    @GetMapping
    public List<UserResponse> getUsers(){
        List<UserResponse> users = service.getUsers();
        return users;
    }
}
