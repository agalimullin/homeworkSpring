package foo.bar;

import foo.bar.config.SpringConfig;
import foo.bar.performers.MusicBandList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicBandList bands = ctx.getBean(MusicBandList.class);
        bands.perform();
    }
}