package com.timelinelp.api.timeline;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timelinelp.api.user.User;

public interface TimelineRepository extends JpaRepository<Timeline, UUID>{
    List<Timeline> findByUser(User user);
    Timeline findByName(String name);
}
