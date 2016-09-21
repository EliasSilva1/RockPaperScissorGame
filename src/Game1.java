import java.util.Random;
import java.util.Scanner;

public class Game1 {
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		Random game = new Random();
		int input, output;
		String input_selection, output_selection;
				
		System.out.println("Rock(1) paper(2) scissor(3) game");
		
		input = x.nextInt();
		output = game.nextInt(2)+1;
		
		
		if (input == 1)
		{
			input_selection = "rock";
				if (output == 1)
				{
					output_selection = "rock";
					System.out.printf("Your choice %s is equal to the computer chooice %s",input_selection,output_selection);
				}
				if (output == 2)
				{
					output_selection = "paper";
					System.out.printf("Your choice %s is loses to the computer chooice %s",input_selection,output_selection);
				}
				if (output == 3)
				{
					output_selection = "scissor";
					System.out.printf("Your choice %s is beats to the computer chooice %s",input_selection,output_selection);
				}
		}
		if (input == 2)
		{
			input_selection = "Paper";
				if (output == 1)
				{
					output_selection = "rock";
					System.out.printf("Your choice %s is beats to the computer chooice %s",input_selection,output_selection);
				}
				if (output == 2)
				{
					output_selection = "paper";
					System.out.printf("Your choice %s is equal to the computer chooice %s",input_selection,output_selection);
				}
				if (output == 3)
				{
					output_selection = "scissor";
					System.out.printf("Your choice %s is loses to the computer chooice %s",input_selection,output_selection);
				}
		}
		if (input == 3 )
		{
			input_selection = "scissor";
			if (output == 1)
			{
				output_selection = "rock";
				System.out.printf("Your choice %s is loses to the computer chooice %s",input_selection,output_selection);
			}
			if (output == 2)
			{
				output_selection = "paper";
				System.out.printf("Your choice %s is beats to the computer chooice %s",input_selection,output_selection);
			}
			if (output == 3)
			{
				output_selection = "scissor";
				System.out.printf("Your choice %s is equal to the computer chooice %s",input_selection,output_selection);
			}
		
		}
			
	}

}



