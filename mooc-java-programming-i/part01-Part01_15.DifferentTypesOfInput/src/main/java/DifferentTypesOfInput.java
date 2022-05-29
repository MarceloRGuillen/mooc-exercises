
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String response1 = scan.nextLine();
        
        System.out.println("Give an integer:");
        int response2 = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double response3 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean response4 = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string "+response1);
        System.out.println("You gave the integer "+response2);
        System.out.println("You gave the double "+response3);
        System.out.println("You gave the boolean "+response4);

    }
}
