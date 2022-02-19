package com.stackoverflow.questions.repositories;

import java.util.List;
import com.stackoverflow.questions.dtos.SongDTO;
import com.stackoverflow.questions.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
  List<SongDTO> findBy();
}
