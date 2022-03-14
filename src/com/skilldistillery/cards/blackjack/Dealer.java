package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer {
	
	private Deck deck = new Deck();
	
	// Shuffle Deck
	public void shuffle(Deck deck) {
		deck.shuffle();
		System.out.println("The dealer is shuffling the deck");
	}
	// Deal Cards (dealCard)
	public Card deal() {
		System.out.println("Dealing");
		return deck.dealCard();
	}
	
		
	
	
	// Wait for Player to finish their Hand
	
	// Finish Dealer's Hand
	
		// Must hit if card sum is < 17
	
		// 

}
