package com.timelinelp.api.timeline.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class TimelineResponse {
    private String name;
    private String username;
    private LocalDateTime createdAt;

    public TimelineResponse(String name, String username, LocalDateTime createdAt){
        this.name = name;
        this.username = username;
        this.createdAt = createdAt;
    }
}
