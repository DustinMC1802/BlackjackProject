package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer {
	
	Deck deck = new Deck();
	
	// Shuffle Deck
	public void shuffle() {
		deck.shuffle();
		System.out.println("shuffling the deck");
	}
	// Deal Cards (dealCard)
	public Card deal() {
		return deck.dealCard();
	}
	
	// Wait for Player to finish their Hand
	
	// Finish Dealer's Hand
	
		// Must hit if card sum is < 17
	
		// 

}
