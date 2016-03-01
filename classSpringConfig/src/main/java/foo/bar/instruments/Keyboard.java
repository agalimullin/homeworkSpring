package foo.bar.instruments;

public class Keyboard implements Instrument {
    @Override
    public void play() {
        System.out.println("not bad acoustic sound");
    }
}