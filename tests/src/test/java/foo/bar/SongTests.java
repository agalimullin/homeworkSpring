package foo.bar;
import foo.bar.etc.Song;
import foo.bar.etc.SongSelector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SongTests {

    //проверяем песню
    @Test
    public void testInitSong() {
        Song song = new Song("Fake Blood - I think I like", "I think I like");
        Assert.assertTrue(song.getName().equals("Fake Blood - I think I like") && song.getText().equals("I think I like"));
    }

    //проверяем, ломается ли тест при выборе несуществующей песни (если не ломается, то всё ок)
    @Test(expected = IndexOutOfBoundsException.class)
    public void testNullSong() {
        SongSelector songSelector = new SongSelector();
        ArrayList list = new ArrayList<Song>();
        list.add(new Song("Riot", "Let's start Riot!"));
        list.add(new Song("Java Jive", "I love the java jive and it loves me"));
        list.add(new Song("Ты неси меня река", "Ты неси меня река, За крутые берега (где поля)"));
        songSelector.setSongs(list);
        songSelector.selectSong(10);
    }
}