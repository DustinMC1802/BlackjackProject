package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	// The hand will receive cards from the Dealer and store them in a list
	public List<Card> cardsInHand = new ArrayList<>();
	
	public Hand() {
		
		this.cardsInHand = new ArrayList<>();
	}
	
	public void addCard(Card i) {
		
		cardsInHand.add(i);
	}
	
	public abstract int getHandValue(Card cardsInHand);
	
	
	public void clear() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [cards =");
		builder.append(cardsInHand);
		builder.append("]");
		return builder.toString();
	}
	
	
	// Display the cards in the hand
	//public void displayCards(Card i) {
	//	System.out.println(cards.toString());
	//}
	
}
