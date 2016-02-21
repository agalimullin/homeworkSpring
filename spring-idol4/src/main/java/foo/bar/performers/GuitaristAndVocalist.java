package foo.bar.performers;

import foo.bar.etc.Song;
import foo.bar.instruments.Guitar;

public class GuitaristAndVocalist extends Guitar implements Vocal, Performer {
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
        play();
        sing();
    }
}