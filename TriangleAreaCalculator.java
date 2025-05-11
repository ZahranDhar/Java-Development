import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        double base, height, area;

        System.out.print("Enter the value of Base: ");
        base=sc.nextDouble();

        System.out.print("Enter the value of Height: ");
        height=sc.nextDouble();

        area=(base/2)*height;

        System.out.print("The Area of the Triangle is: "+area);
    };
}
