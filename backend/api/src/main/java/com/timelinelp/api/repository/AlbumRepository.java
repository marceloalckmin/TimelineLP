package com.timelinelp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.timelinelp.api.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}