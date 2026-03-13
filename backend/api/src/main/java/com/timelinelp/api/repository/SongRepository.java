package com.timelinelp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.timelinelp.api.model.Song;

public interface SongRepository extends JpaRepository<Song,Long>{

}