package Countdown;

import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    public static void main(String[] args){
        Timer timer= new Timer();
        TimerTask task= new Task(timer);

        timer.schedule(task,0,1000);
    }
}
