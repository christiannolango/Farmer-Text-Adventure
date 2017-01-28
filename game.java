import java.util.Random;

//API

public class game {
	//we will need a random number generator to find out 
	//what happens during the turn
	Random rand = new Random();
	String[] turnoptions = {"Would you like to ","Would you like to 2","Would you like to 3"};
	static int turnNum = 1;
	boolean alive = true;
	
	//basic functions
	public boolean start(){
		boolean running = true;
		return running;
	}
	public boolean end(){
		boolean running = false;
		return running;
	}
	
	//turns
	public void turn1(String input){
		String turn1 = input;
		System.out.println("You chose to plant "+turn1);
	}
	
	public void allturns(String input){
		String allturns = null;
		int  n = rand.nextInt(3) + 0; //three options for what could happen during a turn
		System.out.println(turnoptions[n]);
		turnNum++;
	}
	
}
