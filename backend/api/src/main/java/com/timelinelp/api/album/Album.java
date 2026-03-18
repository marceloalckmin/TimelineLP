package com.timelinelp.api.album;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "albums")
@NoArgsConstructor
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String artist;
    
    private int releaseYear;

    @Column(columnDefinition = "text[]")
    private String[] genres;


    public Album(String name, String artist, int releaseYear, String[] genres){
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genres = genres;
    }

    public Album(String name, String artist, int releaseYear){
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }    
    
}