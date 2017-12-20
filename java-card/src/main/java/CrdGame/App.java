//Andrew J. Holmes - 12/20/2017
package CrdGame;
import java.util.ArrayList;
import java.util.Scanner;
import CrdGame.Deck;

public class App {

	public static void main(String[] args) {
		
		try{
		
		String input = null;
		//User Input
		Scanner scan = new Scanner(System.in); 
		
			while (input != "N") {
			
			//Create Deck
			Deck play = new Deck();
	 
			//Initialize Stack
			ArrayList<Card> c = new ArrayList<Card>();	
			
			//52 Cards
			//add hearts
			c.add(play.hearts1); c.add(play.hearts2); c.add(play.hearts3); c.add(play.hearts4);
			c.add(play.hearts5); c.add(play.hearts6); c.add(play.hearts7); c.add(play.hearts8);
			c.add(play.hearts9); c.add(play.hearts10); c.add(play.hearts11); c.add(play.hearts12);
			c.add(play.hearts13);		
			
			//add spades
			c.add(play.spades1); c.add(play.spades2); c.add(play.spades3); c.add(play.spades4);
			c.add(play.spades5); c.add(play.spades6); c.add(play.spades7); c.add(play.spades8);
			c.add(play.spades9); c.add(play.spades10); c.add(play.spades11); c.add(play.spades12);
			c.add(play.spades13);				
			
			//add clubs
			c.add(play.clubs1); c.add(play.clubs2); c.add(play.clubs3); c.add(play.clubs4);
			c.add(play.clubs5); c.add(play.clubs6); c.add(play.clubs7); c.add(play.clubs8);
			c.add(play.clubs9); c.add(play.clubs10); c.add(play.clubs11); c.add(play.clubs12);
			c.add(play.clubs13);
			
			//add diamonds
			c.add(play.diamonds1); c.add(play.diamonds2); c.add(play.diamonds3); c.add(play.diamonds4);
			c.add(play.diamonds5); c.add(play.diamonds6); c.add(play.diamonds7); c.add(play.diamonds8);
			c.add(play.diamonds9); c.add(play.diamonds10); c.add(play.diamonds11); c.add(play.diamonds12);
			c.add(play.diamonds13);	
			
			//shuffle
			play.shuffle(c);
			
			//** I made this for loop to call the method on its own, hopefully it helps your understanding of the code functionality. 
			for(int x = 51;x >= 0;x--)
			{
				play.dealOneCard(c,x);
				System.out.println("  Card total: " + c.size());
			}
			
			System.out.println();
			System.out.println("Play Again? Y/N");
			
			input = scan.next();
			if(input.equals("N") || input.equals("n"))
				break;
			}
			
			scan.close();
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry, there are no more cards. Is this your first time playing?");
		}
	}
}
