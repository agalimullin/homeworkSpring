package foo.bar.performers;

import foo.bar.etc.Song;

public class Vocalist implements Vocal, Performer {
    Song song;

    @Override
    public void sing() {
        System.out.println("Declaiming song - " + song.getName() + ": " + song.getText());
    }

    @Override
    public void setSong(Song song){
        this.song = song;
    }

    @Override
    public void perform() {
        sing();
    }
}