//Andrew J. Holmes - 12/20/2017
package CrdGame;
import java.util.ArrayList;
import java.util.Collections;
import CrdGame.Card;

class Deck{	
	
	public Deck(){
		System.out.println("Greetings, my name is Pixel. I will be serving you as your dealer...");
	}
	
	//Hearts
	Card hearts1 = new Card("Hearts","Ace");
	Card hearts2 = new Card("Hearts","2");
	Card hearts3 = new Card("Hearts","3");
	Card hearts4 = new Card("Hearts","4");
	Card hearts5 = new Card("Hearts","5");
	Card hearts6 = new Card("Hearts","6");
	Card hearts7 = new Card("Hearts","7");
	Card hearts8 = new Card("Hearts","8");
	Card hearts9 = new Card("Hearts","9");
	Card hearts10 = new Card("Hearts","10");
	Card hearts11 = new Card("Hearts","Jack");
	Card hearts12 = new Card("Hearts","Queen");
	Card hearts13 = new Card("Hearts","King");
	
	//Spades
	Card spades1 = new Card("Spades","Ace");
	Card spades2 = new Card("Spades","2");
	Card spades3 = new Card("Spades","3");
	Card spades4 = new Card("Spades","4");
	Card spades5 = new Card("Spades","5");
	Card spades6 = new Card("Spades","6");
	Card spades7 = new Card("Spades","7");
	Card spades8 = new Card("Spades","8");
	Card spades9 = new Card("Spades","9");
	Card spades10 = new Card("Spades","10");
	Card spades11 = new Card("Spades","Jack");
	Card spades12 = new Card("Spades","Queen");
	Card spades13 = new Card("Spades","King");
	
	//Clubs
	Card clubs1 = new Card("Clubs","Ace");
	Card clubs2 = new Card("Clubs","2");
	Card clubs3 = new Card("Clubs","3");
	Card clubs4 = new Card("Clubs","4");
	Card clubs5 = new Card("Clubs","5");
	Card clubs6 = new Card("Clubs","6");
	Card clubs7 = new Card("Clubs","7");
	Card clubs8 = new Card("Clubs","8");
	Card clubs9 = new Card("Clubs","9");
	Card clubs10 = new Card("Clubs","10");
	Card clubs11 = new Card("Clubs","Jack");
	Card clubs12 = new Card("Clubs","Queen");
	Card clubs13 = new Card("Clubs","King");
	
	//Diamonds
	Card diamonds1 = new Card("Diamonds","Ace");
	Card diamonds2 = new Card("Diamonds","2");
	Card diamonds3 = new Card("Diamonds","3");
	Card diamonds4 = new Card("Diamonds","4");
	Card diamonds5 = new Card("Diamonds","5");
	Card diamonds6 = new Card("Diamonds","6");
	Card diamonds7 = new Card("Diamonds","7");
	Card diamonds8 = new Card("Diamonds","8");
	Card diamonds9 = new Card("Diamonds","9");
	Card diamonds10 = new Card("Diamonds","10");
	Card diamonds11 = new Card("Diamonds","Jack");
	Card diamonds12 = new Card("Diamonds","Queen");
	Card diamonds13 = new Card("Diamonds","King");

	public void shuffle(ArrayList<Card> a){
		Collections.shuffle(a);
		System.out.println();
		System.out.println("I will shuffle the cards for you...");
		System.out.println("Completed.");
		System.out.println();
	}
	
	public void dealOneCard(ArrayList<Card> a,int x){
			System.out.println("Card drawn: " + a.get(x).toString());	
			a.remove(x);
			
	}
}
