package foo.bar.performers;

import foo.bar.instruments.Instrument;

public class Bassist implements Performer {
    Instrument instrument;

    @Override
    public void perform() {
        instrument.play();
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}