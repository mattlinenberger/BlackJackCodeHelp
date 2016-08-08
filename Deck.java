import java.util.Random;


//This is my class named Deck
public class Deck {
	/*/class variables-- allowed throughout ( i do this so i can use my variables between methods.)
	//Methods are only supposed to return a specific thing..but using class variables "between" methods to help return that specific thing is a little confusing to me. 
	 * At least accessing them without syntax errors./*/ 
	
	 //random object 
	Random random = new Random();
	
	//Player variables
	
	int card1 = random.nextInt(14);//the number 0 is not accounted for in the random generation.
	int card2 = random.nextInt(14);		
	//Players Totals
	int playerTotal = card1 + card2;
	
	//CPU variables 
	int cpuCard1 = random.nextInt(14);
	int cpuCard2 = random.nextInt(14);
	//CPU Totals
	int cpuTotal = cpuCard1 + cpuCard2;
	
	
	//The Main method where the program runs
	public static void main(String[] args) {
		
		//I created my deck OBJECT, so i can use my whoWins method and cpuCardsWin method to run.
		
		/*/ I know that the two methods can actually become only 1 method.. "who wins".. this was just my process.. of doing it.. individually for each player makes it more simplistic for me. 
		 * I'm sure there is some better logic..like one if statement, getting rid of a lot of this code.  Just trying to show you my thought process.. and what im doing.. /*/
		
		Deck deck = new Deck();
		//deck is my object, who wins is my method
		deck.whoWins();
		//deck is my obeject, cpu cards wins is my method
		deck.cpuCardsWin();
		
		
		
	}
	//Constructor of Deck -- To create the "Deck" properties?
	public Deck(){
		/*/this constructor has no purpose .. still might have a little confusion on this. I know java makes you a default constructor if you don't. 
		Maybe we can go over a little more on the importance of the constructor... how it is used in conjunction with objects. Objects clicked in my mind today I think.. 
		at least the "becoming an instance of that class" did...
		
		from what i understand.. the class is a template to make an object that becomes an instance of that class.. 
		so you can use that object.. created from the class template, to write methods and what not.
		
		the constructor for the class.. is setting up the actual template, letting your object know what it can use/access? /*/
		
		
	}
	
	//Pretty plain method,  The whole static non static.. is still a little fuzzy.. but what i still understand is that 'Static' methods are stand alone methods.. meaning they
	//do pretty much one thing, calculations are a good example.
	public  void whoWins(){
		
		//if statements im getting used to.. im still a little crappy at them.. especially when it comes to adding the 'else' somehow i screw it up every time.
		System.out.println(playerTotal + " is player total." + " " +  "Card one is:" + " " + card1 + " " +  "Card two is: " + " " + card2);
		if (playerTotal == 21){
			System.out.println("Blackjack! Player Wins!!");
			return;
		}
		if (playerTotal  > 21 ){
			System.out.println("BUST!, Player lost!");
			return;
		}
		if (playerTotal > cpuTotal){
			System.out.println("Player Wins!");
		}
	
		if (playerTotal == cpuTotal){
			System.out.println("Split!");
		}
		
	}
	
	public  void cpuCardsWin(){
		
		System.out.println(cpuTotal + " is CPU total." + " " +  "Card one is:" + " " + cpuCard1 + " " +  "Card two is: " + " " + cpuCard2);
		
		if (cpuTotal == 21){
			System.out.println("Blackjack! CPU Wins!!");
			return;
		}
		if(cpuTotal > 21){
			System.out.println("BUST!, Player Wins.");
			return;
		}
		if(cpuTotal > playerTotal ){
			System.out.println("CPU Wins!");
		}
		
		if (playerTotal == cpuTotal){
			System.out.println("Split");
		}

		
	}
	
}
