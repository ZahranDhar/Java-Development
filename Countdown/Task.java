package Countdown;

import java.util.Timer;
import java.util.TimerTask;

public class Task extends TimerTask {
    int count=10;
    Timer timer;

    public Task(Timer timer) {
        this.timer=timer;
    }

    @Override
    public void run(){
        System.out.println(count);
        if(count==0){
            System.out.println("Happy New Yearrrr!!!!");
            timer.cancel();
        }
        count--;
    }
}
