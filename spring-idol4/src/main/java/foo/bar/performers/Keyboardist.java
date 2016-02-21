package foo.bar.performers;

import foo.bar.instruments.Keyboard;

public class Keyboardist extends Keyboard implements Performer {
    @Override
    public void perform() {
        play();
    }
}