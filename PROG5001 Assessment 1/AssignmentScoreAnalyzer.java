
/**
 * A class Analyzing Assignment Score
 *
 * @author (Ayodeji)
 * @version (1.0)
 */
import java.util.Scanner; //Importing the Scanner class to read input from users
public class AssignmentScoreAnalyzer{
     public static void main(String[] args) {//Function to receive assignment name and students' marks from user 
         System.out.println("Input assignment name"); //recieve assignment name
         Scanner scanner = new Scanner(System.in);
         String assignmentName = scanner.nextLine();
                 
        //Input 30 students' marks for the assignment
        double[] studentMarks = new double[30];
        for (int i = 0; i < 30; i++) {
            System.out.print("Enter students' marks for the assignment" + (i + 1) + ": ");
             while (true) { //while loop to ensure valid mark is collected from users
                 double mark = scanner.nextDouble();
                 if (mark >= 0 && mark <=30) {
                     studentMarks[i] = mark;
                     break;
                 }else {
                     System.out.println("Invalid mark. Please enter a valid student mark between 0 and 30.");
                    }
                }
            }
        
       // Calculate and display results
        
        System.out.println("Assigment name: " + assignmentName);  // Print assignment name to address F4
        
 
        scanner.close();
    }     
    
    }
        
