import java.util.Scanner;

public class EnterString implements Runnable{

    Scanner sc= new Scanner(System.in);
    static String name;
    static boolean inputSuccess=false;

    @Override public void run(){
        name=sc.nextLine();
        inputSuccess=true;
    }

    public static String getName(){
        return name;
    }

    }

