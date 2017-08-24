import java.util.Scanner;

public class Guessing {
	
	public static void main(String[] args) {
		
			{
				System.out.println("I'm thinking of a number between 1 and 100.... See if you can guess it!");
			}
			
		Scanner cin = new Scanner(System.in);
		
		boolean chek = true;
		
		int a = 1;		
		
		int b = 100;
		
		int random = (int)(a + b*Math.random()); 
		//working
		{
			System.out.println(random);
			//allows testing
		}
		//below is loop
		while(chek == true)
		{	
		int guess = cin.nextInt();
		//players guess
			if(guess==random)
			{
				System.out.println("Correct!");
				
				break;
				//alright, that didn't work either
			}
			if(guess<random)
			{
				System.out.println("Too low!");
			}
			if(guess>random)
			{
				System.out.println("Too high!");
			}
			}		
		cin.close();		
	}
}