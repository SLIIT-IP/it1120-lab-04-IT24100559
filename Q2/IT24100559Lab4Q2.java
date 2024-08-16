import java.util.Scanner;

public class IT24100559Lab4Q2
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter Exam Marks (out of 100): ");
		int examMarks = scanner.nextInt();
		
		// Validate Exam marks
		if (0>examMarks || examMarks>100){
			System.out.print("Invalid Input for Exam Marks. Terminating Program.");
			scanner.close();
			return;
		}
		
		System.out.print("Please Enter Lab Submission Marks (out of 100): ");
		int labMarks = scanner.nextInt();
		
		// Validate Lab Submission marks
		if (0>labMarks || labMarks>100){
			System.out.print("Invalid Input for Lab Submission Marks. Terminating Program.");
			scanner.close();
			return;
		}
		
		System.out.print("Please Enter the Percentage Give for the Exam: ");
		int examPercentage = scanner.nextInt();
			
		System.out.print("Please Enter the Percentage Give for the Lab Submission: ");
		int labPercentage = scanner.nextInt();	
		
		// Validate that the percentages add up to 100
		if (examPercentage + labPercentage != 100) {
			System.out.print("The Percentage Must add up to 100. Terminating Program.");
			scanner.close();
			return;
		}
		
		// Calculate the final mark
		double finalMarks = ( examMarks*examPercentage/100.0 ) + ( labMarks*labPercentage/100.0 );
		System.out.println("Final Exam Mark is :" + finalMarks);
		
		scanner.close();
	}
}