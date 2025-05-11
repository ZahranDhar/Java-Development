import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        double oph1,oph2,result=0;
        char op;

        System.out.println("Enter the first operand");
        oph1=sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/,^)");
        op=sc.next().charAt(0);
        System.out.println("Enter the second operand");
        oph2=sc.nextDouble();

        switch(op){

            case '+' -> result=oph1+oph2;
            case '-' -> result=oph1-oph2;
            case '*' -> result=oph1*oph2;
            case '/' -> {
                if(oph2==0){
                    System.out.println("Invalid input");
                }}
            case '^' -> result=Math.pow(oph1,oph2);
            default -> System.out.println("Invalid operator");
        }

        System.out.println("The result is: "+result);

    }
}
