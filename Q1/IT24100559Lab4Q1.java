import java.util.Scanner;

public class IT24100559Lab4Q1 
{
	public static void main(String[]args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if (number > 0){
			System.out.println("The Number is: Positive");
		}
		
		else if (number < 0){
			System.out.println("The Number is: Negative");
		}
		
		else {
			System.out.println("The Number is: Zero");
		}
	}
}