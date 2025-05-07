import java.util.Scanner;

import java.lang.Thread;

public class Threading {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name in 10 seconds.");
        Thread countdown= new Thread(new Countdown());
        Thread enterString= new Thread(new EnterString());
        countdown.start();
        enterString.start();

        while(Countdown.isRunning){
            if(EnterString.inputSuccess){
                Countdown.isRunning=false;
            }
            Thread.sleep(1000);
        }

        if(EnterString.inputSuccess) System.out.println(EnterString.getName());
        else System.out.println("The user has failed to enter a name");


    }

}
