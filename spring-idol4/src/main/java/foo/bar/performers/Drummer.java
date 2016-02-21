package foo.bar.performers;

import foo.bar.instruments.Drums;

public class Drummer extends Drums implements Performer {
    @Override
    public void perform() {
        play();
    }
}