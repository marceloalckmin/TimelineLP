package com.timelinelp.api.user.dto;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class UserRequest {
    @NonNull private String name;
    @NonNull private String password;
    @NonNull private String email;

}
