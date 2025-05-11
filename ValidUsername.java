import java.util.Scanner;

public class ValidUsername {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a Username: ");
        String username=sc.nextLine();

        boolean containsSpaceOrUnderscore= username.contains(" ") || username.contains("_");
        boolean lengthAsRequired=username.length()>=4 && username.length()<=12;

        if(containsSpaceOrUnderscore) System.out.println("Username must not contain spaces or underscores");
        else if(!lengthAsRequired) System.out.println("Username must be between 4 and 12");
        else System.out.println("The username is valid");

    };
}
