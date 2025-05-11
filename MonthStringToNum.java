import java.util.Scanner;

public class MonthStringToNum {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String month=sc.nextLine().toLowerCase();

        switch(month){
            case "january" -> System.out.println("1");
            case "february" -> System.out.println("2");
            case "march" -> System.out.println("3");
            case "april" -> System.out.println("4");
            case "may" -> System.out.println("5");
            case "june" -> System.out.println("6");
            case "july" -> System.out.println("7");
            case "august" -> System.out.println("8");
            case "september" -> System.out.println("9");
            case "october" -> System.out.println("10");
            case "november" -> System.out.println("11");
            case "december" -> System.out.println("12");

            default -> System.out.println(month+ " is not a valid month");

        }
    }

};
