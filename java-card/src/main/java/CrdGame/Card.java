//Andrew J. Holmes - 12/20/2017
package CrdGame;

public class Card {
private String suit;
private String face;

public Card(String a, String b){
	this.setSuit(a);
	this.setFace(b);}

public String getFace() {
	return face;
}

public void setFace(String face) {
	this.face = face;
}

public String getSuit() {
	return suit;
}

public void setSuit(String suit) {
	this.suit = suit;
}
@Override
public String toString(){
	return getFace() + " " + getSuit();}

}
