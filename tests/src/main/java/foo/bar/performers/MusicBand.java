package foo.bar.performers;

import foo.bar.etc.Song;
import foo.bar.instruments.Guitar;

import java.util.List;

public class MusicBand implements Performer {
    String name;
    private List<Performer> members;
    private List<Song> songs;

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(List<Performer> members) {
        this.members = members;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public void perform() {
        System.out.println("At the scene invited: " + name);
        for (Song song : songs) {
            System.out.println("The song: " + song.getName());
            for (Performer performer : members) {
                if (performer instanceof Vocal) {
                    ((Vocal) performer).setSong(song);
                }
                performer.perform();
            }
        }
    }
}