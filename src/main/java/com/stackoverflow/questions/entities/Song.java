package com.stackoverflow.questions.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue
    @Column(name = "song_id")
    private Integer id;

    @Column(name = "song_name")
    private String name;
    
    @Column(name = "album_id")
    private Integer albumId;
    
    @Column(name = "song_duration")
    private String duration;
    
    @ManyToOne
    @JoinColumn(name = "album_id", insertable = false, updatable = false)
    private Album album;

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Integer getAlbumId() {
      return albumId;
    }

    public void setAlbumId(Integer albumId) {
      this.albumId = albumId;
    }

    public String getDuration() {
      return duration;
    }

    public void setDuration(String duration) {
      this.duration = duration;
    }

    public Album getAlbum() {
      return album;
    }

    public void setAlbum(Album album) {
      this.album = album;
    }
}