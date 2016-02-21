package foo.bar.performers;

import foo.bar.instruments.Guitar;

public class Guitarist extends Guitar implements Performer {
    @Override
    public void perform() {
        play();
    }
}