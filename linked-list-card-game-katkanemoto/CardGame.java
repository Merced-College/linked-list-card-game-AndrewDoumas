package linkedLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CardGame {
	
	private static LinkList theList = new LinkList();  // make list

	public static void main(String[] args) {

		String[] SUITS = {
				"Clubs", "Diamonds", "Hearts", "Spades"
		};

		String[] RANKS = {
				"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"
		};

		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				//deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
				int value = i + 2;
				if(value > 10)
					value = 10;
				if(RANKS[i].contentEquals("Ace"))
					value = 1;
				theList.insertFirst(new Card(SUITS[j], RANKS[i], value));
			}
		}
		
		//theList.displayList();

		// shuffle
		for (int i = 0; i < n; i++) {
			int indexInsuits = (int) (Math.random() * 3);
			int indexInRanks = (int) (Math.random() * 12);
			String s = SUITS[indexInsuits];
			String r = RANKS[indexInRanks];
			Card c = theList.delete(new Card(s, r, 10));
			theList.insertFirst(c);
		}

		// print shuffled deck
		theList.displayList();
		
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
		

	}//end main

}//end class
