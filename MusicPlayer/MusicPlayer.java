package MusicPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void playMusic(int choice) {

        try(AudioInputStream inputStream= InputStreams.getInputStream((choice-1)); Clip music= AudioSystem.getClip()){

            music.open(inputStream);
            char response;
            Scanner sc= new Scanner(System.in);

            do{
                System.out.println("""
                        Press P to Play
                        Press S to Stop
                        Press R to Reset
                        Press B to Back
                        """);
                response= sc.next().charAt(0);

                switch(response){
                    case 'P' -> music.start();
                    case 'S' -> music.stop();
                    case 'R' -> music.setMicrosecondPosition(0);
                    case 'B' -> {
                        music.close();
                        return;
                    }
                    default -> System.out.println("Invalid Input");
                }

            }while(true);

        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        catch(LineUnavailableException e){
            System.out.println("Line Unavailable Exception");
        }

    }
}
