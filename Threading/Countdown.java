package Threading;

public class Countdown implements Runnable{

    static boolean isRunning=true;
    @Override
    public void run(){
        int count=10;
        while(count>0) {
            try {
                if (isRunning) {
                    Thread.sleep(1000);
                    count--;
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        close();
        }

        public void close(){
        isRunning=false;
        }
}
