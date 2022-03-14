package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {

	}

	int total = 0;
	//Add the total of the cards in the hand
	@Override
	public int getHandValue(Card cardsInHand) {
		
		for (Card card : this.cardsInHand) {
			total += card.getValue();
		}
		return total;
	}

	// Determine if bust
	public boolean bust() {
		boolean bustVar;
		if (total >= 21) {
			bustVar = true;
		} else {
			bustVar = false;
		}
		return bustVar;
	}

	// Determine if blackjack
	public boolean blackjack() {
		boolean blackjackVar;
		if (total >= 21) {
			blackjackVar = true;
		} else {
			blackjackVar = false;
		}
		return blackjackVar;
		
	}
	
}
