package foo.bar.performers;

import foo.bar.etc.Song;
import foo.bar.instruments.Guitar;
import foo.bar.instruments.Instrument;

public class GuitaristAndVocalist implements Vocal, Performer {
    Instrument instrument;
    Song song;

    @Override
    public void sing() {
        System.out.println("Declaiming song: " + song.getText());
    }

    @Override
    public void setSong(Song song){
        this.song = song;
    }

    @Override
    public void perform() {
        instrument.play();
        sing();
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}