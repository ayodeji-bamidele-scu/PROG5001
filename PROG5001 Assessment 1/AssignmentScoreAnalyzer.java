
/**
 * A class Analyzing Assignment Score
 *
 * @author (Ayodeji)
 * @version (1.0)
 */
import java.util.Scanner; //Importing the Scanner class to read input from users
public class AssignmentScoreAnalyzer{
     public static void main(String[] args) {//Function to receive assignment name from users 
         System.out.println("Input assignment name");
         Scanner scanner = new Scanner(System.in);
         String assignmentName = scanner.nextLine();
         System.out.println("Assigment name: " + assignmentName);
        }
    }
