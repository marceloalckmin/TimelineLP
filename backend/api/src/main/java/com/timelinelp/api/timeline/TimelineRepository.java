package com.timelinelp.api.timeline;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimelineRepository extends JpaRepository<Timeline, UUID>{
    Timeline findByUser(String userName);
}
