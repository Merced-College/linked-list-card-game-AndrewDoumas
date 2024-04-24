package cardGame;

public class Card {

	//instance variables, sometimes called data variables
	private String cardName;
	private String cardValue;

	//default constructor
	public Card() {
		cardName = "King";
		cardValue = "10";
	}

	//non-default constructor
	public Card(String name, String value) {
		cardName = name;
		cardValue = value;
	}

	//getter method, accessor method
	public String getCardName() {
		return cardName;
	}

	public String getCardValue() {
		return cardValue;
	}

	//setter methods, mutator methods
	public void setCardName(String newCardName) {
		cardName = newCardName;
	}

	public String getCardValues() {
		return cardName + " " + cardValue;
	}

	public String toString() {
		return cardName + " " + cardValue;
	}
	
}//end class
