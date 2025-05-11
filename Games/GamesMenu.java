package Games;

import java.util.Scanner;

public class GamesMenu {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        do {
            Games game = null;
            System.out.println("""
                    
                    Enter 1 for Slot Ma1
                    chine
                    Enter 2 for Number Game
                    Enter 3 for Dice Game
                    Enter 4 for Exit
                 
                    """);
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> game = new SlotMachine();
                case 2 -> game = new GuessTheNumberGame();
                case 3 -> game = new DiceGame();
                case 4 -> System.out.println("Exited Successfully");
                default -> System.out.println("Invalid Input");
            }

            if(game != null) game.play();
        }while(choice!=4);
    }
}
