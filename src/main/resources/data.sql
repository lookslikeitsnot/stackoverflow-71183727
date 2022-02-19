insert into albums(
    album_id,
    album_name,
    released_by,
    total_duration
  )
values (1, 'Album 1', 'Releaser A', 600),
  (2, 'Album 2', 'Releaser B', 700),
  (3, 'Album 3', 'Releaser A', 500);

  insert INTO songs(song_id, song_name, album_id, song_duration)
  values 
  (1, 'Song 1', 1, '12:23'),
  (2, 'Song 2', 1, '12:23'),
  (3, 'Song 3', 1, '12:23'),
  (4, 'Song 4', 1, '12:23'),
  (5, 'Song 5', 1, '12:23'),
  (6, 'Song 1', 2, '12:23'),
  (7, 'Song 2', 2, '12:23'),
  (8, 'Song 3', 2, '12:23'),
  (9, 'Song 4', 2, '12:23'),
  (10, 'Song 1', 3, '12:23'),
  (11, 'Song 2', 3, '12:23'),
  (12, 'Song 3', 3, '12:23'),
  (13, 'Song 4', 3, '12:23'),
  (14, 'Song 5', 3, '12:23');