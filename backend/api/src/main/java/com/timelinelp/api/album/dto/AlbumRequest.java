package com.timelinelp.api.album.dto;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class AlbumRequest {
    @NonNull private String name;
    @NonNull private String artist;
    @NonNull private Integer releaseYear;

    private String[] genres;
}
