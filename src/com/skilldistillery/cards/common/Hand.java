package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	// The hand will receive cards from the Deck and store them in a list
	public List<Card> cardsInHand = new ArrayList<>();

	public Hand() {

		this.cardsInHand = new ArrayList<>();
	}

	public void addCard(Card i) {

		cardsInHand.add(i);
	}

	// Abstract method to get the total value of the cards
	public abstract int getHandValue(Card cardsInHand);

	// Clear the hand
	public void clear() {
		for (Card card : cardsInHand) {
			cardsInHand.remove(card);
		}
	}

	// Display the cards in the hand
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [cards =");
		builder.append(cardsInHand);
		builder.append("]");
		return builder.toString();
	}

}
