package foo.bar.performers;

import foo.bar.instruments.Bass;

public class Bassist extends Bass implements Performer {
    @Override
    public void perform() {
        play();
    }
}