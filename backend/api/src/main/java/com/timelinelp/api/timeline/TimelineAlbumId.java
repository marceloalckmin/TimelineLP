package com.timelinelp.api.timeline;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Embeddable;

@Embeddable
public class TimelineAlbumId implements Serializable{
    private UUID timelineId;
    private UUID albumId;

    public UUID getAlbumId(){
        return this.albumId;
    }

    public UUID getTimelineId(){
        return this.timelineId;
    }
}
