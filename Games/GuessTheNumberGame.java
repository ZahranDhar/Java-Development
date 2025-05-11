package Games;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame implements Games{

    public void play(){
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();

        int ranNum=rand.nextInt(0,101);
        int num,attempts=0;

        System.out.println("Guess a number between 1 and 100");
        System.out.println("Attempts: 10");
        System.out.println();
        do{
            num=sc.nextInt();
            if(num<1 || num>100) continue;

            if(num==ranNum) break;
            else if(num<ranNum) System.out.println("Go higher!");
            else System.out.println("Go Lower!");

            attempts++;
            System.out.println("Attempts left: "+(10-attempts));
            System.out.println();

        }while(attempts<10);

        if(num==ranNum)
        {
            System.out.println("You won!");
            System.out.println("Your Score: "+((10-attempts)*10)+"%");
        }
        else System.out.println("You lost!");;

    }
}
