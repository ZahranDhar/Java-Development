package Games;

import java.util.Random;
import java.util.Scanner;

public class DiceGame implements Games{

    public void play(){

        Random rand= new Random();
        Scanner sc= new Scanner(System.in);

        int humanScore=0,computerScore=0,die1,die2,i;

        System.out.println("Do you want to play? (Y/N)");
        char ans=sc.next().charAt(0);
        if(ans=='N') return;
        System.out.println();

        for(i=1;i<=3;i++)
        {
            System.out.println("Round: "+i);
            System.out.println("Your Score: "+humanScore);
            System.out.println("Computer Score: "+computerScore);

            System.out.println("Do you want to roll the Dice?");
            ans=sc.next().charAt(0);
            if(ans=='N') return;

            die1=rand.nextInt(1,7);
            die2=rand.nextInt(1,7);


            System.out.println("You rolled a "+die1);
            drawDie(die1);
            System.out.println("Computer rolled a "+die2);
            drawDie(die2);

            if(die1>die2){
                System.out.println("You won round "+i);
                humanScore+=10;
            }
            else if(die1<die2){
                System.out.println("Computer won round "+i);
                computerScore+=10;
            }
            else{
                System.out.println("Draw Match");
                humanScore+=10;
                computerScore+=10;
            }
            System.out.println();

        }


        System.out.println("Your Final Score: "+humanScore);
        System.out.println("Computer Final Score: "+computerScore);

        if(humanScore>computerScore){
            System.out.println("You won the game");
        }
        else{
            System.out.println("You lost the game");
        }

    }

    private static void drawDie(int x) {

        String die="";
        switch(x){

            case 1 -> die= """
                     ---------
                    |         |
                    |    ●    |
                    |         |
                     ---------
                    """;
            case 2 -> die= """
                     ---------
                    |  ●      | 
                    |         |
                    |      ●  |
                     ---------
                    """;
            case 3 -> die= """
                     ---------
                    | ●       |
                    |    ●    |
                    |       ● |
                     ---------
                    """;
            case 4 -> die= """
                     ---------
                    |  ●   ●  | 
                    |         |
                    |  ●   ●  |
                     ---------
                    """;
            case 5 -> die= """
                     ---------
                    |  ●   ●  | 
                    |    ●    |
                    |  ●   ●  |
                     ---------
                    """;
            case 6 -> die= """
                     ---------
                    |  ●   ●  | 
                    |  ●   ●  |
                    |  ●   ●  |
                     ---------
                    """;
        }

        System.out.println(die);
    }

    ;
}
