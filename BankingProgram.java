import java.util.Scanner;

public class BankingProgram {

    static Scanner sc= new Scanner(System.in);
    static double balance=0;
    static boolean isRunning=true;

    public static void main(String[] args){

        int choice;

        do{
            System.out.println("Enter 1 to check balance");
            System.out.println("Enter 2 to deposit");
            System.out.println("Enter 3 to withdraw");
            System.out.println("Enter 4 to exit");
            choice= sc.nextInt();
            System.out.println();

            switch(choice){
                case 1 -> displayBalance();
                case 2 -> depositAmount();
                case 3 -> withdrawAmount();
                case 4 -> isRunning=false;
                default -> System.out.println("Invalid Input");
            }
        } while(isRunning);

    }

    private static void withdrawAmount() {
        double amount;
        System.out.println("Enter the amount to withdraw");
        amount= sc.nextDouble();
        if(amount<=0) System.out.println("Enter amount > 0");
        if(amount>balance) System.out.println("Low Balance");
        else{
            balance-=amount;
            System.out.println("Withdrawal Success");
        }
        System.out.println();
    }

    private static void depositAmount() {
        double amount;
        System.out.println("Enter the amount to deposit");
        amount= sc.nextDouble();
        if(amount<=0) System.out.println("Enter amount > 0");
        balance+=amount;
        System.out.println();
    }

    private static void displayBalance() {
        System.out.println("Your Balance: "+balance);
        System.out.println();
    }
}