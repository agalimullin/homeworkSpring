# ALTER TABLE tracks ADD FOREIGN KEY (album_id) REFERENCES albums (id) ON DELETE CASCADE ON UPDATE CASCADE;
# ALTER TABLE albums ADD FOREIGN KEY (group_id) REFERENCES groups (id) ON DELETE CASCADE ON UPDATE CASCADE;
# INSERT INTO groups values (1, 'Three Days Grace', 'Cool men');
# INSERT INTO albums values ('The best album', 1, 1);
# INSERT INTO tracks values ('Riot', 'Lets start Riot! Riot!', 1);

# SELECT tracks.name, tracks.text FROM tracks, albums, groups 
# WHERE tracks.album_id = albums.id 
#       AND albums.group_id = groups.id;