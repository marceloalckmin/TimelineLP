package com.timelinelp.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timelinelp.api.model.Album;
import com.timelinelp.api.model.Song;
import com.timelinelp.api.repository.AlbumRepository;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }

    @PostMapping
    public Album createAlbum(@RequestBody Album album){
        if(album.getSongs() != null){
            for(Song song: album.getSongs()){
                song.setAlbum(album);
            }
        }

        return albumRepository.save(album);
    }

    @GetMapping
    public List<Album> getAlbums(){
        return albumRepository.findAll();
    }

}
