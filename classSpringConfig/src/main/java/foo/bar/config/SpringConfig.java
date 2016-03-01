package foo.bar.config;

import foo.bar.etc.Song;
import foo.bar.instruments.Bass;
import foo.bar.instruments.Drums;
import foo.bar.instruments.Guitar;
import foo.bar.instruments.Keyboard;
import foo.bar.performers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class SpringConfig {
    ArrayList <Song> listSongs1 = new ArrayList<>();
    ArrayList <Song> listSongs2 = new ArrayList<>();
    ArrayList <Performer> members1 = new ArrayList<>();
    ArrayList <Performer> members2 = new ArrayList<>();
    ArrayList <MusicBand> bands = new ArrayList<>();

    @Bean
    public Song riot() {
        return new Song("Riot", "Let's start a riot, a riot, Let's start a riot");
    }

    @Bean
    public Song animal() {
        return new Song("Animal I Have Become", "So what if you can see the darkest side of me? No one would ever change this animal I have become");
    }

    @Bean
    public Song sorry() {
        return new Song("I'm So Sorry", "You gotta face up, you gotta get yours, You never know the top till you get too low");
    }

    @Bean
    public Song life() {
        return new Song("I Bet My Life", "Now remember when I told you that's the last you'll see of me? Remember when I broke you down to tears?");
    }

    @Bean
    public Song summer() {
        return new Song("Summer", "Show me all your colors, Show me all.");
    }

    @Bean
    public Bass bass() {
        return new Bass();
    }

    @Bean
    public Drums drums() {
        return new Drums();
    }

    @Bean
    public Guitar guitar() {
        return new Guitar();
    }

    @Bean
    public Keyboard keyboard() {
        return new Keyboard();
    }

    @Bean
    public Bassist bassist() {
        Bassist bassist = new Bassist();
        bassist.setInstrument(bass());
        return bassist;
    }

    @Bean
    public Drummer drummer() {
        Drummer drummer = new Drummer();
        drummer.setInstrument(drums());
        return drummer;
    }

    @Bean
    public Guitarist guitarist(){
        Guitarist guitarist = new Guitarist();
        guitarist.setInstrument(guitar());
        return guitarist;
    }

    @Bean
    public Keyboardist keyboardist() {
        Keyboardist keyboardist = new Keyboardist();
        keyboardist.setInstrument(keyboard());
        return keyboardist;
    }

    @Bean
    public Vocalist vocalist() {
        return new Vocalist();
    }

    @Bean
    public GuitaristAndVocalist gAndV() {
        GuitaristAndVocalist gAndV = new GuitaristAndVocalist();
        gAndV.setInstrument(guitar());
        return gAndV;
    }

    @Bean
    public MusicBand band1(){
        MusicBand band1 = new MusicBand();
        listSongs1.add(riot());
        listSongs1.add(animal());
        band1.setSongs(listSongs1);
        members1.add(gAndV());
        members1.add(bassist());
        members1.add(keyboardist());
        band1.setMembers(members1);
        band1.setName("Three Days Grace");
        return band1;
    }

    @Bean
    public MusicBand band2(){
        MusicBand band2 = new MusicBand();
        listSongs2.add(sorry());
        listSongs2.add(life());
        listSongs2.add(summer());
        band2.setSongs(listSongs2);
        members2.add(vocalist());
        members2.add(bassist());
        members2.add(drummer());
        members2.add(guitarist());
        band2.setMembers(members2);
        band2.setName("Imagine Dragons");
        return band2;
    }

    @Bean
    public MusicBandList bandList() {
        bands.add(band1());
        bands.add(band2());
        return new MusicBandList(bands);
    }
}