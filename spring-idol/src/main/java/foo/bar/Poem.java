package foo.bar;

public class Poem {

    public Poem(String textPoem) {
        this.textPoem = textPoem;
    }

    private String textPoem;

    public void recite() {
        System.out.println(textPoem);
    }

}