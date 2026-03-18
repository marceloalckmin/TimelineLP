package com.timelinelp.api.album;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.timelinelp.api.album.dto.AlbumRequest;
import com.timelinelp.api.album.dto.AlbumResponse;

@Service
public class AlbumService {
    private AlbumRepository repository;

    public AlbumService(AlbumRepository repository){
        this.repository = repository;
    }

    public AlbumResponse registerAlbum(AlbumRequest albumDTO) throws Exception{
        Album existing = repository.findByNameAndArtist(albumDTO.getName(), albumDTO.getArtist());

        if(existing != null){
            throw new Exception("Album is already registered!");
        }

        Album registeredAlbum = new Album(
            albumDTO.getName(),
            albumDTO.getArtist(),
            albumDTO.getReleaseYear(),
            albumDTO.getGenres()
        );

        Album saved = repository.save(registeredAlbum);

        AlbumResponse response = new AlbumResponse(saved);
        return response;
    }

    public List<AlbumResponse> findAll(){
        List<Album> albums = repository.findAll();
        List<AlbumResponse> responses = new ArrayList<>();

        for(Album album : albums){
            responses.add(new AlbumResponse(album));
        }
        return responses;
    }
}
