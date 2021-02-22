import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Does pineapple belong on pizza?");
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Disgusting.");
		}
		else if(answer.equalsIgnoreCase("no"))
		{
			System.out.println("That is the right answer.");
		}
		else System.out.println("You did not input yes or no");
	}
}
