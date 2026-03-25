package com.timelinelp.api.user;

import com.timelinelp.api.user.dto.*;


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

        User registeringUser = new User(userDTO.getName(),
            userDTO.getEmail(),
            userDTO.getPassword()
        );

        repository.save(registeringUser);

        UserResponse response = new UserResponse(registeringUser);

        return response;
    }
    
}
