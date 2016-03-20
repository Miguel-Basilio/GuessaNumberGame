import java.util.Scanner;

public class gameon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int user;
		int computer;
		
		//system ask for user imput//
		System.out.println("Guess the number that Im thinking of");
		user = in.nextInt();
		
		//computer random number creation//
		System.out.println("My number is:");
		computer = 0 + (int)(Math.random()*10);
		System.out.println(computer);
		
		if (user < computer)
		System.out.println("Your number is less than mine ");
	
		else  if (user > computer)
		System.out.println("You number is more than mine");
		 
		 else {
			 System.out.println("YES your guess is correct");
			 
		 }
		 
		 
		
		
		
	}

}
