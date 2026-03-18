package com.timelinelp.api.album.dto;

import java.util.UUID;

import com.timelinelp.api.album.Album;

import lombok.Getter;

@Getter
public class AlbumResponse {
    private UUID id;
    private String name;
    private String artist;
    private int releaseYear;

    private String[] genres;

    public AlbumResponse(Album album){
        this.id = album.getId();
        this.name = album.getName();
        this.artist = album.getArtist();
        this.releaseYear = album.getReleaseYear();
        this.genres = album.getGenres();
    }
}
