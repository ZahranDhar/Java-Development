package Threading;

import java.util.Scanner;

import java.lang.Thread;

public class Threading {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Enter your name in 10 seconds.");

        Thread countdown= new Thread(new Countdown());
        Thread enterString= new Thread(new EnterString());

        countdown.setDaemon(true);
        enterString.setDaemon(true);

        countdown.start();
        enterString.start();

        while(Countdown.isRunning){
            if(EnterString.inputSuccess){
                Countdown.isRunning=false;
            }
            Thread.sleep(1000);
        }
        if(!EnterString.inputSuccess) EnterString.close();

        System.out.println(EnterString.getName());

    }

}
