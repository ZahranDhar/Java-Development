import java.util.Scanner;

public class ThreeNumsSum {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First number: ");
        int x= sc.nextInt();

        System.out.println("Enter Second number: ");
        int y= sc.nextInt();

        System.out.println("Enter Third number: ");
        int z= sc.nextInt();

        if((x==y)&&(y==z)){
            System.out.println("The numbers are equal");
        }
        else{
            if((x>=y)&&(x>z)){
                if(x==y){
                    System.out.println("x and y are equal and grestest");
                }
                else{
                    System.out.println("x is the greatest");
                }
            }
            else if((y>=z)){
                if(y==z){
                    System.out.println("y and z are equal and greatest");
                }
                else{
                    System.out.println("y is the greates");
                }
            }
            else{
                if(z==x){
                    System.out.println("z and x are equal and grestest");
                }
                else{
                    System.out.println("z is the greatest");
                }
            }
        }
    }
}
