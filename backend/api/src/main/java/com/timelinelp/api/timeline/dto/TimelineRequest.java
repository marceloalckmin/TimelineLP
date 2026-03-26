package com.timelinelp.api.timeline.dto;

import com.timelinelp.api.user.User;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class TimelineRequest {
    @NonNull private String name;
    private User user;
}
