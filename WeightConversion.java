import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        double weight,convertedWeight;
        boolean isPound=true;

        System.out.println("Enter the weight");
        weight=sc.nextDouble();

        System.out.println("Is the weight in pound? (true/false)");
        isPound=sc.nextBoolean();

        if(isPound){
            convertedWeight=weight*0.453592;
        }
        else{
            convertedWeight=weight*2.20462;
        }

        System.out.println(convertedWeight);

    }
}
