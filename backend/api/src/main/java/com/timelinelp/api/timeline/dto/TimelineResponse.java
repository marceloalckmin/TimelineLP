package com.timelinelp.api.timeline.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.timelinelp.api.timeline.Timeline;

import lombok.Getter;

@Getter
public class TimelineResponse {
    private UUID id;
    private String name;
    private String username;
    private LocalDateTime createdAt;

    public TimelineResponse(Timeline timeline){
        this.id = timeline.getId();
        this.name = timeline.getName();
        this.username = timeline.getUser().getName();
        this.createdAt = LocalDateTime.now();
    }
}
