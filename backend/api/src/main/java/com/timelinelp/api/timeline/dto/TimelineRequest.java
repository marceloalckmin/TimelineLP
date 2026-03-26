package com.timelinelp.api.timeline.dto;

import java.util.UUID;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class TimelineRequest {
    @NonNull private String name;
    @NonNull private UUID userId;
}
