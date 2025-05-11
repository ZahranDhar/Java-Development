//import java.io.OutputStream;
//import java.io.PrintStream;
//import java.io.FileOutputStream;
//import java.io.FileDescriptor;
//import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;


public class Main {

//    public static void main(String[] args)
//        {
//        //This is my first JAVA program
//
//        System.out.println("Hello World!");
//        System.out.println("I am Zahran");
//    }



//    public static void main(String[] args)
//    {
//        int age=21;
//        double price=99.9999;
//        char grade='A';
//        boolean isStudent=true;
//        String name="Zahran";
//
//        System.out.println("My age is "+ age);
//        System.out.println("The price of the product is "+ price);
//        System.out.println("The grade is "+ grade);
//
//        if(isStudent)
//        {
//            System.out.println("Is student "+ isStudent);
//        }
//        else {
//            System.out.println("Is student "+ isStudent);
//
//        }
//
//        System.out.println("My name is "+ name);
//
//    };



//    public static void main (String[] args) throws FileNotFoundException
//    {
//        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
//
//        System.out.println("Hello My name is Zahran");
//        System.out.println("Hello My name is Safwan");
//        System.out.println("Hello My name is Rakia");
//    };



//    public static void main(String[] args) throws FileNotFoundException
//    {
//
//
//        System.setIn(new BufferedInputStream(new FileInputStream("input.txt")));
//
//        Scanner sc=new Scanner(System.in);
//
//        int x= sc.nextInt();
//        System.out.println(x);
//    };



//    public static void main(String[] args) throws FileNotFoundException
//    {
//        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
//        System.setIn(new BufferedInputStream(new FileInputStream(FileDescriptor.in)));
//
//        Scanner sc=new Scanner(System.in);
//        int x= sc.nextInt();
//        System.out.println(x);
//    };


//    public static void main(String[] args)
//    {
//        Random rand = new Random();
//
//        int num= rand.nextInt(1,7);
//
//        System.out.println(num);
//    };



//    public static void main(String[] args)
//    {
//        double number;
//
//        number= Math.PI;
//        number= Math.E;
//        number= Math.pow(2,9);
//        number= Math.sqrt(9);
//        number= Math.round(5.34);
//        number= Math.ceil(3.1);
//        number= Math.floor(3.8);
//        number= Math.max(5,11);
//        number= Math.min(4,2);
//        number= Math.abs(-98);
//
//    };



//    public static void main(String[] args) throws InterruptedException {
//        int i;
//
//        for(i=10;i>0;i--)
//        {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("Happy New Year!!!");
//
//
//    }



//    public static void main(String[] args)
//    {
//        String[] fruits= {"apple","mango","orange","banana"};
//        int n=fruits.length;
//        Arrays.sort(fruits);
//
//        for(String fruit: fruits)
//        {
//            System.out.println(fruit);
//        }
//        Scanner sc= new Scanner(System.in);
//        int[] rollNos= new int[5];
//        int i;
//        for(i=0;i<5;i++)
//        {
//            rollNos[i]=sc.nextInt();
//        }
//        for(int rollNo: rollNos) System.out.println(rollNo);
//
//    }



//    public static void main(String[] args)
//    {
//        int[] numbers={1,2,3,4,5};
//        int sum= add(numbers,"apple","banana");
//        System.out.println(sum);
//    }
//
//    private static int add(int[] numbers, String... fruits) {
//        int sum=0;
//        for(int num: numbers)
//        {
//            sum+=num;
//        }
//        for(String fruit: fruits) System.out.println(fruit);
//        return sum;
//    }

//
//    public static void main(String[] args) throws InterruptedException {
//
//        Console console= System.console();
//        String[] slots= {"🍇","🍍","🍉","🍎","🍊"};
//        System.out.print("🍍");
//        for(int i=0;i<5;i++) {
//            System.out.print("\r"+slots[i]);
//            Thread.sleep(500);
//
//            if(i!=4) {
//                System.out.printf("\b");System.out.flush();
//            }
//
//
//        }
//
//    }
//
//

//    public static void main(String[] args){
//
//        ArrayList<Integer> rollNos= new ArrayList<Integer>();
//        rollNos.add(11);
//        rollNos.add(21);
//        rollNos.add(31);
//
//        for(int rollNo: rollNos){
//            System.out.println(rollNo);
//        }
//
//        int m=rollNos.get(2);
//        System.out.println(m);
//        rollNos.add(41);
//        for(int rollNo: rollNos){
//            System.out.println(rollNo);
//        }
//        System.out.println();
//
//        rollNos.remove(3);
//
//        for(int rollNo: rollNos){
//            System.out.println(rollNo);
//        }
//        String[] fruits={"apple","orange","pineapple"};
//        Collections.sort(rollNos);
//
//    }


//    public static void main(String[] args){
//
//
//    }
}
