package MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class InputStreams {

    static String[] filePaths={"src/MusicPlayer/Songs/SpotiDownloader.com - Still D.R.E. - Dr. Dre.wav","src/MusicPlayer/Songs/SpotiDownloader.com - The Next Episode - Dr. Dre.wav","src/MusicPlayer/Songs/SpotiDownloader.com - Big Poppa - 2007 Remaster - The Notorious B.I.G.wav"};

    public static AudioInputStream getInputStream(int songIndex){

        File audioFile= new File(filePaths[songIndex]);

        try{
            return AudioSystem.getAudioInputStream(audioFile);
        }
        catch(IOException e){
            System.out.println("IO Exception Occurred");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported Audio Format");
        }
        return null;
    }
}