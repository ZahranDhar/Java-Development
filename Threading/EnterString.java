package Threading;

import java.util.Scanner;

public class EnterString implements Runnable{

    static Scanner sc= new Scanner(System.in);
    static String name;
    static boolean inputSuccess=false;

    @Override public void run(){
        name=sc.nextLine();
        inputSuccess=true;
    }

    public static void close(){
        sc.close();
    }

    public static String getName(){

        if(inputSuccess)return name;
        else return "Name not Entered";
    }

    }

