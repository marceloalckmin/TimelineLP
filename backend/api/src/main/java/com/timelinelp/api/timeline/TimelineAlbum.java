package com.timelinelp.api.timeline;

import java.time.LocalDateTime;

import com.timelinelp.api.album.Album;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "timeline_albums")
public class TimelineAlbum {

    @EmbeddedId
    private TimelineAlbumId id;
    
    @ManyToOne @MapsId("timelineId")
    private Timeline timeline;

    @ManyToOne @MapsId("albumId")
    private Album album;

    private LocalDateTime addedAt;
}
