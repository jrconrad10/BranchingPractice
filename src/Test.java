import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("Hello!");
		Scanner input = new Scanner(System.in);
		System.out.println("Does pineapple belong on pizza?");
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Disgusting");
			System.out.println("What is your favorite type of pizza?");
			String favPizza = input.nextLine();
			if(favPizza.equalsIgnoreCase("meatball") || favPizza.equalsIgnoreCase("meatball pizza"))
			{
				System.out.println("Great minds think alike.");
			}
			else if(favPizza.equalsIgnoreCase("pineapple") || favPizza.equalsIgnoreCase("pineapple pizza"))
			{
				System.out.println("Yuck");
			}
			else System.out.println("At least it's not pineapple.");
		}
		else if(answer.equalsIgnoreCase("no"))
		{
			System.out.println("That is the right answer.");
			System.out.println("What is your favorite type of pizza?");
			String favPizza = input.nextLine();
			if(favPizza.equalsIgnoreCase("meatball") || favPizza.equalsIgnoreCase("meatball pizza"))
			{
				System.out.println("Great minds think alike.");
			}
			else if(favPizza.equalsIgnoreCase("pineapple") || favPizza.equalsIgnoreCase("pineapple pizza"))
			{
				System.out.println("You lied!");
			}
			else System.out.println("At least it's not pineapple.");
		}
		else System.out.println("You did not input yes or no");
		
		System.out.println("Thank you for your input!");
		System.out.println("Have a good day!");
	}
}
