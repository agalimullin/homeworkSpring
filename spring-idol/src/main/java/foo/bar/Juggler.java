package foo.bar;

public class Juggler implements Performer {

    int countOfBeanbags;

    Poem poem = null;

    public Juggler() {
    }

    public Juggler(int countOfBeanbags) {
        this.countOfBeanbags = countOfBeanbags;
    }

    public Juggler(int countOfBeanbags, Poem poem) {
        this.countOfBeanbags = countOfBeanbags;
        this.poem = poem;
    }

    public void perform() {
        System.out.println("juggling with " + countOfBeanbags + " beanbags");
        poem.recite();
    }

}