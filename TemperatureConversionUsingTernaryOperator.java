import java.util.Scanner;

public class TemperatureConversionUsingTernaryOperator {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        double temp,newTemp;
        boolean isCelcius=true;

        System.out.println("Enter the temperature");
        temp=sc.nextDouble();
        System.out.println("Is the temperature in Celcius? (true/false)");
        isCelcius=sc.nextBoolean();

        newTemp=isCelcius?temp*9/5+32:(temp-32)*5/9;

        System.out.print(newTemp);
        if(isCelcius){
            System.out.println("F");
        }
        else{
            System.out.println("C");
        }

    }
}
