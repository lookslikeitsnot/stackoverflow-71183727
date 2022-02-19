package com.stackoverflow.questions.services;

import java.util.List;
import com.stackoverflow.questions.dtos.SongDTO;
import com.stackoverflow.questions.repositories.SongRepository;
import org.springframework.stereotype.Service;

@Service
public class SongService {
  private final SongRepository songRepository;

  public SongService(SongRepository songRepository) {
    this.songRepository = songRepository;
  }

  public List<SongDTO> listAll(){
    return songRepository.findBy();
  }
}
