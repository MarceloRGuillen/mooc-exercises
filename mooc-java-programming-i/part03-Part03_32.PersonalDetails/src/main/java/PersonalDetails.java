
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pieces;
        int longest = 0;
        double avg = 0.0;
        int sum = 0;
        int counter = 0;
        String name = "";
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
             pieces = input.split(",");
            if(pieces[0].length() > longest) {
                longest = pieces[0].length();
                name = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            counter++;
        }
        System.out.println("Longest name: "+name);
        avg = (sum * 1.0) / counter;
        System.out.println("Average of the birth years: "+avg);
    }
}
