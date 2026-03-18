package com.timelinelp.api.album;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, UUID>{
        Album findByName(String name);
        Album findByArtist(String artist);
        Album findByNameAndArtist(String name, String artist);
        List<Album> findByReleaseYear(int releaseYear);
}
