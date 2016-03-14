package hello.dao;

import hello.Song;
import org.springframework.jdbc.core.JdbcTemplate;

public class SongDAO {
    private JdbcTemplate jdbcTemplate;

    public SongDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addSong(Song song){
        String sql = "insert into songs values (?, ?, ?)";
        jdbcTemplate.update(sql, song.getName(), song.getText(), song.getAlbumID());
    }
}