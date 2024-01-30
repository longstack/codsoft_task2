package studentcalculator;
import java.util.Scanner;

public class StudentCalculator 
{
	
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);

	       //total number of inputs
	        System.out.print("Enter the number of subjects: ");
	        int subjno = input.nextInt();
	        input.nextLine(); 

	        
	        //names of subjects
	        String[] subjectNames = new String[subjno];
	        for (int x = 0; x < subjno; x++) 
	        {
	            System.out.print("Name of Subject " + (x + 1) + ": ");
	            subjectNames[x] = input.nextLine();
	        }
	        
	        
	        
	        
	        
	        
	        
	        //marks in each subject
	        
	        int[] marks = new int[subjno];
	        for (int x = 0; x < subjno; x++)
	        {
	            System.out.print("Enter marks for Subject " + subjectNames[x] + ": ");
	            marks[x] = input.nextInt();
	        }

	        //total calculation
	        int marks_sum = 0;
	        for (int x = 0; x < subjno; x++) 
	        {
	            marks_sum += marks[x];
	        }

	        // Calculate Average Percentage
	        gradecalculator grdcal=new gradecalculator();
	        double averagePercentage = grdcal.averagepercent(marks_sum,subjno);

	        char finalgrade=grdcal.grade(averagePercentage);

	       System.out.println();
	        System.out.println(" ! ! FINAL REPORT ! ! ");
	        System.out.println("------------------------");
	        System.out.println("Total Marks: " + marks_sum);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Final Grade: " + finalgrade);

	        input.close();
	    }
	}
	 

