package Games;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine implements Games{

    static Scanner sc= new Scanner(System.in);
    static Random rand= new Random();
    static int balance;
    static int bet;

    public void play() {

        System.out.println("""
                🍒 🍓 🍅 🍉 🍎 🍇 🥝Y
                Welcome to Java Slots
                 🍎 🍇 🍒 🥝🍓 🍅 🍉 
                """);
        System.out.println("Do you want to play the game? (Y/N) 😄");
        String option=sc.next().toLowerCase();

        if(option.equals("y")){
            System.out.println("How much do you wanna cash in? 💸");
            balance=sc.nextInt();
            System.out.println();
            displayInterface();
        }
    }

    private static void displayInterface() {

        String isPlaying;

        do{

            do {
                System.out.println("Your Balance: 💲" + balance);
                System.out.println("Enter your bet 💸");
                bet = sc.nextInt();

                if(bet>balance) System.out.println("Low balance 😵‍💫");
            }while(bet>balance);

            displaySlots();
            System.out.println("Your Balance: 💲"+balance);
            System.out.println();

            if(balance<=0) {
                System.out.println("Loser!! 😵‍💫");
                break;
            }
            System.out.println("Do you want to play again? (Y/N) 😄" );
            isPlaying= sc.next().toLowerCase();

            if(isPlaying.equals("n")) System.out.println("Cashout: 💲"+balance);

        }while(isPlaying.equals("y"));

    }

    private static void displaySlots() {

        String[] slots= {"🍇","🍍","🍉","🍎","🍊","🍋","🥭","🍐","🍅","🍓","🍒","🍑","🥝","🥑"};
        int i,j,slotIndex;
        int[] slotIndices= new int[3];

        for(i=0;i<3;i++)
        {
            slotIndex=rand.nextInt(0,13);
            slotIndices[i]=slotIndex;

            for(j=0;j<slots.length;j++)
            {
                if(j==slotIndex){
                    System.out.println("\r"+slots[j]+" "+slots[j]+" "+slots[j]);
                    break;
                }
                else {
                    System.out.print("\r" + slots[j]);
                    try {
                        Thread.sleep(400);
                    }
                    catch(InterruptedException e){
                        System.out.println("Session Interrupted");
                    }
                    System.out.print("\b");
                    System.out.flush();
                }
            }

            try {
                Thread.sleep(700);
            }
            catch(InterruptedException e){
                System.out.println("Session Interrupted");
            }
        }
        updateScore(slotIndices);
    }

    private static void updateScore(int[] slotIndices) {

        if((slotIndices[0]==slotIndices[1])&&(slotIndices[0]==slotIndices[2])) {
            System.out.println("You Won! 😀");
            balance+=(bet*2);
        }
        else if((slotIndices[0]==slotIndices[1])||(slotIndices[0]==slotIndices[2])||(slotIndices[1]==slotIndices[2])) {
            System.out.println("You Won! 😀");
            balance+=(bet);
        }
        else{
            System.out.println("You Lost! 😔");
            balance-=bet;
        }
    }
}