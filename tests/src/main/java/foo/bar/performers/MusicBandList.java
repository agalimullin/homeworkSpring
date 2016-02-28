package foo.bar.performers;

import java.util.List;

public class MusicBandList {
    List<MusicBand> bands;

    public MusicBandList(List<MusicBand> bands){
        this.bands = bands;
    }

    public void perform(){
        for (MusicBand musicBand : bands){
            musicBand.perform();
            System.out.println();
        }
    }
}