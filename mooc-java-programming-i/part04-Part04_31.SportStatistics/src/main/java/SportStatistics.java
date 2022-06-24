
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        try(Scanner data = new Scanner(Paths.get(fileName))) {
            System.out.println("Team: ");
            String team = scan.nextLine();
            while(data.hasNextLine()) {
                String line = data.nextLine();
                String[] pieces = line.split(",");
                String teamOne = pieces[0];
                String teamTwo = pieces[1];
                int scoreOne = Integer.valueOf(pieces[2]);
                int scoreTwo = Integer.valueOf(pieces[3]);
                if(teamOne.equals(team) || teamTwo.equals(team)) {
                    gamesPlayed++;
                    if(teamOne.equals(team) && scoreOne > scoreTwo) {
                        wins++;
                        continue;
                    } else if(teamOne.equals(team) && scoreOne < scoreTwo) {
                        losses++;
                        continue;
                    }
                    if(teamTwo.equals(team) && scoreTwo > scoreOne) {
                        wins++;
                        continue;
                    } else {
                        losses++;
                        continue;
                    }
                }
            }
            System.out.println("Games: "+gamesPlayed);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }

}
