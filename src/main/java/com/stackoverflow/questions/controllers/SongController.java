package com.stackoverflow.questions.controllers;

import java.util.List;
import com.stackoverflow.questions.dtos.SongDTO;
import com.stackoverflow.questions.services.SongService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
  private final SongService songService;

  public SongController(SongService songService) {
    this.songService = songService;
  }

  @GetMapping
  public List<SongDTO> listAllSongs() {
    return songService.listAll();
  }
}
