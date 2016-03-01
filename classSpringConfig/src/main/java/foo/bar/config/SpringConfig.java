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
        ArrayList <Song> listSongs = new ArrayList<>();
        ArrayList <Performer> members = new ArrayList<>();
        MusicBand band = new MusicBand();
        listSongs.add(riot());
        listSongs.add(animal());
        band.setSongs(listSongs);
        members.add(gAndV());
        members.add(bassist());
        members.add(keyboardist());
        band.setMembers(members);
        band.setName("Three Days Grace");
        return band;
    }

    @Bean
    public MusicBand band2(){
        ArrayList <Song> listSongs = new ArrayList<>();
        ArrayList <Performer> members = new ArrayList<>();
        MusicBand band = new MusicBand();
        listSongs.add(sorry());
        listSongs.add(life());
        listSongs.add(summer());
        band.setSongs(listSongs);
        members.add(vocalist());
        members.add(bassist());
        members.add(drummer());
        members.add(guitarist());
        band.setMembers(members);
        band.setName("Imagine Dragons");
        return band;
    }

    @Bean
    public MusicBandList bandList() {
        ArrayList <MusicBand> bands = new ArrayList<>();
        bands.add(band1());
        bands.add(band2());
        return new MusicBandList(bands);
    }
}