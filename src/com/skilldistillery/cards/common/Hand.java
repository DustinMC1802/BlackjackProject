package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	// The hand will receive cards from the Dealer and store them in a list
	private List<Card> cards = new ArrayList<>();
	
	public Hand() {
		this.cards = new ArrayList<>();
	}
	
	public void addCard(Card i) {
		
		cards.add(i);
	}
	// Display the cards in the hand
	
}
