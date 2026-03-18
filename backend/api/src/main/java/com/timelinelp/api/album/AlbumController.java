package com.timelinelp.api.album;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timelinelp.api.album.dto.AlbumRequest;
import com.timelinelp.api.album.dto.AlbumResponse;

@RestController
@RequestMapping("/album")
public class AlbumController {
    private AlbumService service;

    public AlbumController(AlbumService service){
        this.service = service;
    }

    @PostMapping("/reg-album")
    public AlbumResponse registerAlbum(@RequestBody AlbumRequest albumDTO) throws Exception{
        AlbumResponse response = service.registerAlbum(albumDTO);
        return response;
    }

    @GetMapping
    public List<AlbumResponse> getAlbums(){
        return service.findAll();
    }
}
