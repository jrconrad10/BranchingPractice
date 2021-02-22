import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Does pineapple belong on pizza?");
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Disgusting");
			System.out.println("What is your favorite type of pizza?");
			String favPizza = input.nextLine();
			if(favPizza.equalsIgnoreCase("meatball"))
			{
				System.out.println("Great minds think alike.");
			}
			else if(favPizza.equalsIgnoreCase("pineapple"))
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
			if(favPizza.equalsIgnoreCase("meatball"))
			{
				System.out.println("Great minds think alike.");
			}
			else System.out.println("At least it's not pineapple.");
		}
		else System.out.println("You did not input yes or no");
	}
}
