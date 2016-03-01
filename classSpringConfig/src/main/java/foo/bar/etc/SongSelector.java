package foo.bar.etc;

import java.util.List;

public class SongSelector {

    public List<Song> songs;

    public Song selectSong(int songIndex){
        return songs.get(songIndex);
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

}