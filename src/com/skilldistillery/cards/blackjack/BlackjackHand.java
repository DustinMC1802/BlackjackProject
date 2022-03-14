package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {

	}

	@Override
	public int getHandValue(Card cardsInHand) {
		int total = 0;
		
		for (Card card : this.cardsInHand) {
			total += card.getValue();
		}
		return total;
	}

	// Sum the values of the cards
//	@Override
//	public int getHandValue(Card cardsInHand) {
//		for(int i = 0; i < BlackjackHand.size; i++) {
//			
//		}

	// Display cards

	// Determine if bust

	// Determine if blackjack

}
