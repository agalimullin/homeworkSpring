package foo.bar;

import foo.bar.instruments.Bass;
import foo.bar.instruments.Guitar;
import foo.bar.performers.Bassist;
import foo.bar.performers.MusicBandList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        MusicBandList bandList = (MusicBandList) context.getBean("bandList");
        bandList.perform();
    }
}