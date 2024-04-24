package cardGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardGame {

	private static LinkList deckOfCards = new LinkList();  // make list
	private static ArrayList<Card> playerCards = new ArrayList<Card>();

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(new File("cards.txt"));
		} catch (FileNotFoundException e) {
			// error
			System.out.println("error");
			e.printStackTrace();
		}

		while(input.hasNext()) {
			String[] fields  = input.nextLine().split(",");
			//	public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
			Card newCard = new Card(fields[0], fields[1].trim(),
					Integer.parseInt(fields[2].trim()), fields[3]);
			deckOfCards.insertFirst(newCard);	
		}

		shuffle();

		deckOfCards.displayList();

		//deal the player 5 cards
		for(int i = 0; i < 4; i++) {
			playerCards.add(deckOfCards.getFirst());
		}
		
		playerCards.add(playerCards.get(2));

		System.out.println("players cards");
		for(Card c: playerCards)
			System.out.println(c);

		System.out.println("pairs is " + checkFor2Kind());
		
		/*
		Card[] playerHand = new Card[5];
		for(int i = 0; i < playerHand.length; i++)
			playerHand[i] = theList.getFirst();

		System.out.println("players hand");
		for(int i = 0; i < playerHand.length; i++)
			System.out.println(playerHand[i]);

		System.out.println();
		System.out.println("the deck");
		// print shuffled deck
		theList.displayList();
		 */

	}//end main

	public static void shuffle() {
		// shuffle
		String[] SUITS = {
				"club", "diamond", "heart", "spade"
		};

		String[] RANKS = {
				"two", "three", "four", "five", "six", "seven", "eight", 
				"nine", "ten","jack", "queen", "king", "ace"};

		//shuffling the cards by deleting and reinserting
		for (int i = 0; i < deckOfCards.getSize(); i++) {
			int indexInsuits = (int) (Math.random() * 3);
			int indexInRanks = (int) (Math.random() * 12);
			String s = SUITS[indexInsuits];
			String r = RANKS[indexInRanks];
			Card c = deckOfCards.delete(new Card(s, r, 10, "no pic")).getCardObject();
			deckOfCards.insertFirst(c);
		}
	}

	//check for 2 of a kind in the players hand
	public static boolean checkFor2Kind() {

		int count = 0;
		for(int i = 0; i < playerCards.size() - 1; i++) {
			Card current = playerCards.get(i);
			Card next = playerCards.get(i+1);
			
			for(int j = i+1; j < playerCards.size(); j++) {
				next = playerCards.get(j);
				System.out.println(" comparing " + current);
				System.out.println(" to " + next);
				if(current.equals(next))
					count++;
			}//end of inner for
			if(count == 1)
				return true;

		}//end outer for
		return false;
	}
}//end class
