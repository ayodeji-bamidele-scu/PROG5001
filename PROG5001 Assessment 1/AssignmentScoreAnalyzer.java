
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
        double maxMark = findMaxMArk(studentMarks);
        double minMark = findMinMArk(studentMarks);
        
        System.out.println("Assigment name: " + assignmentName);  // Print assignment name to address F4
        System.out.println("The Highest Mark is: " + maxMark); // Print Highest Mark
        System.out.println("The Lowest Mark is: " + minMark); // Print Lowest Mark

 
        scanner.close();
    }     
    
    // Method to find the highest mark
    public static double findMaxMArk(double[] studentMarks) {
        double maxMark = studentMarks[0];
        
        for (double mark : studentMarks) {
            if (mark > maxMark) {
                    maxMark = mark;
            }
        }

        return maxMark;
    }
    
    // Method to find the lowest mark
    public static double findMinMArk(double[] studentMarks) {
        double minMark = studentMarks[0];
        
        for (double mark : studentMarks) {
            if (mark < minMark) {
                    minMark = mark;
            }
        }

        return minMark;
    }
    
    
    
    }
        
