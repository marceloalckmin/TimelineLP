package com.timelinelp.api.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.timelinelp.api.user.dto.*;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public UserResponse registerUser(UserRequest userDTO) throws Exception{
        User existingUser = repository.findByEmail(userDTO.getEmail());
        if(existingUser != null){
            throw new Exception("Email already in use");
        }

        User registeringUser = new User(
            userDTO.getName(),
            userDTO.getEmail(),
            userDTO.getPassword()
        );

        repository.save(registeringUser);

        UserResponse response = new UserResponse(registeringUser);

        return response;
    }

    public List<UserResponse> getUsers(){
        List<User> registeredUsers = repository.findAll();
        List<UserResponse> users = new ArrayList<>();

        for(User user : registeredUsers){
            users.add(new UserResponse(user));
        }

        return users;
    }
    
}
