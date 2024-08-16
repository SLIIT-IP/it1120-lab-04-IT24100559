import java.util.Scanner;

public class IT24100559Lab4Q3
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int number = scanner.nextInt();
		
		//Using ternary operator to check if the number is positive, negative or zero
		String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
		
		System.out.println("The Number is: " + result);
	}
}