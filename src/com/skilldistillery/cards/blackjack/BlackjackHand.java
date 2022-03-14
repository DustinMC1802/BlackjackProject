package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}

	private int handTotal = 0;
	public boolean bust = false;
	//Add the total of the cards in the hand
	@Override
	public int getHandValue(Card cardsInHand) {
		int handAmount = getHandTotal();
		for (Card card : this.cardsInHand) {
			handAmount += card.getValue();
		}
		return handAmount;
		
	}

	public int getHandTotal() {
		return handTotal;
	}

	public void setHandTotal(int handTotal) {
		this.handTotal = handTotal;
	}

	// Determine if bust
	public boolean bust() {
		boolean bustVar;
		if (handTotal >= 21) {
			bustVar = true;
		} else {
			bustVar = false;
		}
		return bustVar;
	}

	// Determine if blackjack
	public boolean blackjack() {
		boolean blackjackVar;
		if (handTotal == 21) {
			blackjackVar = true;
		} else {
			blackjackVar = false;
		}
		return blackjackVar;
		
	}
	
}
