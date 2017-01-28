import java.util.Scanner;

public class text {

	
	
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		String input;
		game Game = new game();
		Game.start();
		
		System.out.println("Welcome to Life of a Farmer");
		System.out.println("You can only enter 1 or 2 into the console");
		System.out.println("Set out to accomplish things before you inevitably die. You have ten turns.");
		
		System.out.println("\nThe sun shines brightly today, before you lies an open field. Do you plant potato or tobbaco?");
		System.out.println("1: potato \n2: tobacco");
		
		input=scanner1.next();
		Game.turn1(input);
		for(int i=0;i<9;i++){
			input=scanner1.nextLine();
			Game.allturns(input);
		}
		Game.end();
	}

}
