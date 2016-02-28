package foo.bar.performers;

import foo.bar.instruments.Instrument;
import foo.bar.instruments.Keyboard;

public class Keyboardist extends Keyboard implements Performer {
    Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        instrument.play();
    }
}