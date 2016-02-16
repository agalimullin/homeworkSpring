package foo.bar;

import java.util.Collection;

public class Entertainer {

    public void callPerformer(Performer performer) {
        performer.perform();
    }

    public void callPerformers(Collection<Performer> executors) {
        for (Performer performer : executors) {
            performer.perform();
        }
    }
}