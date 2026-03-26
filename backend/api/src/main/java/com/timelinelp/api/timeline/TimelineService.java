package com.timelinelp.api.timeline;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.timelinelp.api.timeline.dto.*;
import com.timelinelp.api.user.UserRepository;

@Service
public class TimelineService {
    private TimelineRepository repository;
    private UserRepository userRepository;

    public TimelineService(TimelineRepository repository, UserRepository userRepository){
        this.repository = repository;
        this.userRepository = userRepository;

    }

    public TimelineResponse registerTimeline(TimelineRequest timelineDto) throws Exception{
        Timeline existing = repository.findByName(timelineDto.getName());

        if(existing != null){
            throw new Exception("There's already a timeline with that name"); //tbh this is a crappy way to check existing timeline
            //TODO: Think of a new way to check for each user's timeline for that timeline name, if there's already a timeline with that name, just change it to thatname+(1,2) etc;
        }

        Timeline registeringTimeline = new Timeline(timelineDto.getName(), timelineDto.getUser());
        repository.save(registeringTimeline);

        TimelineResponse response = new TimelineResponse(registeringTimeline);
        return response;
    }

    public List<TimelineResponse> getTimelinesFromUser(String email){
        List<Timeline> userList = repository.findByUser(userRepository.findByEmail(email));
        List<TimelineResponse> timelines = new ArrayList<>();

        for(Timeline timeline : userList){
            timelines.add(new TimelineResponse(timeline));
        }

        return timelines;
    }
}
