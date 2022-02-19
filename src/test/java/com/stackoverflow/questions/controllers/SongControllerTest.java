package com.stackoverflow.questions.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class SongControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void getAllSongs__completeSongDTOS() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/")).andDo(MockMvcResultHandlers.print())
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(
            MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.jsonPath("$[0].albumId").isNotEmpty())
        .andExpect(MockMvcResultMatchers.jsonPath("$[0].albumName").isNotEmpty())
        .andExpect(MockMvcResultMatchers.jsonPath("$[0].duration").isNotEmpty())
        .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").isNotEmpty())
        .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").isNotEmpty());
  }
}
