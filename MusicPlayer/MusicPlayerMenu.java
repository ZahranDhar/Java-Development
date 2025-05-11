package MusicPlayer;

import javax.sound.sampled.AudioInputStream;
import java.util.Scanner;

public class MusicPlayerMenu {


    public static void main(String[] args){

        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.println();

        do{
            System.out.println("""
                    Select a song:
                    
                    1)Still D.R.E.
                    2)The Next Episode
                    3)Big Poppa - 2005 Remaster
                    4)Exit
                    """);
            choice=sc.nextInt();

            if(choice!=4) MusicPlayer.playMusic(choice);

        }while(choice!=4);


    }


}
