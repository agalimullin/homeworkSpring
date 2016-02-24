package foo.bar.performers;

import foo.bar.instruments.Instrument;

public class Guitarist implements Performer {
    Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override

    public void perform() {
        instrument.play();
    }
}