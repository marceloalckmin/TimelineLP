package com.timelinelp.api.timeline;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timelinelp.api.timeline.dto.*;

@RestController
@RequestMapping("/timeline")
public class TimelineController {
    private TimelineService service;

    public TimelineController(TimelineService service){
        this.service = service;
    }

    @PostMapping
    public TimelineResponse registerTimeline(@RequestBody TimelineRequest timelineDto) throws Exception{
        TimelineResponse response = service.registerTimeline(timelineDto);
        return response;
    }

    @GetMapping
    public List<TimelineResponse> getUserTimelinesByEmail(@RequestBody String userEmail) throws Exception{
        List<TimelineResponse> userTimelines = service.getTimelinesFromUser(userEmail);
        return userTimelines;
    }
}
