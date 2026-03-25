package com.timelinelp.api.user.dto;

import java.util.UUID;
//import com.timelinelp.api.timeline.Timeline;
import com.timelinelp.api.user.User;

import lombok.Getter;

@Getter
public class UserResponse {
    private UUID id;
    private String name;
    private String email;

    public UserResponse(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }
}