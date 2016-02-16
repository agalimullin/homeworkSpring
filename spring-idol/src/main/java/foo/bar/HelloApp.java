package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class HelloApp {
    public static void main(String[] args) {

        // todo запустить приложение, не внося изменений, для проверки общей работоспособности

        // todo в класс Poem добавить атрибут "текст поэмы"
        // todo в xml-конфигурацию добавить инициализацию атрибута "текст поэмы"
        // todo запустить приложение

        // todo добавить класс "конферансье", который вызывает на сцену исполнителя
        // todo изменить xml-конфигурацию и код HelloApp так, чтобы жонглер (Juggler) вызывался посредством конферансье
        // todo запустить приложение

        // todo добавить произвольного нового исполнителя по аналогии с жонглером
        // todo создать вторую xml-конфигурацию, в которой конферансье вызывает вашего нового исполнителя
        // todo запустить приложение с новой конфигурацией

        ArrayList<Performer> list = new ArrayList<Performer>();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Performer performer = (Performer) context.getBean("vasya");
        list.add(performer);
        Entertainer entertainer = new Entertainer();
        entertainer.callPerformers(list);
        //performer = (Performer) context.getBean("alex");
        //list.add(performer);
        // performer.perform();
        //entertainer.callPerformers(list);
    }
}