
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
        double meanMark = calculateMeanMark(studentMarks);
        double standarddeviationMark = calculateStandardDeviationMark(studentMarks);

        System.out.println("Assigment name: " + assignmentName);  // Print assignment name to address F4
        System.out.println("The Highest Mark is: " + maxMark); // Print Highest Mark
        System.out.println("The Lowest Mark is: " + minMark); // Print Lowest Mark
        System.out.println("The Mean Mark is: " + meanMark); // Print Mean Mark
        System.out.println("The Standard deviation of the Marks is: " + standarddeviationMark); // Print Standard Deviation of the Marks
  
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
    
    // Method to calculate the mean mark
    public static double calculateMeanMark(double[] studentMarks) {
        double sum = 0;

        for (double mark : studentMarks) {
            sum += mark;
        }

        return sum / studentMarks.length;
    }
    
    // Method to calculate the standard deviation
    public static double calculateStandardDeviationMark(double[] studentMarks) {
        double sum = 0;
        double standardDeviation = 0;
        
        for (double mark : studentMarks) {
            sum += mark;
            standardDeviation += (mark - (sum / studentMarks.length)) * (mark - (sum / studentMarks.length));
        }

        return Math.sqrt(standardDeviation / studentMarks.length);
    }
    
    }
        
