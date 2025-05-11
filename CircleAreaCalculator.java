import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        double radius, area;

        System.out.print("Enter the radius of the Circle: ");
        radius= sc.nextDouble();

        area=Math.PI*Math.pow(radius,2);

        System.out.print("The Area of the Circle is: "+area);
    };
}
