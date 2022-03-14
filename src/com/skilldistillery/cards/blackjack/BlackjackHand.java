package com.skilldistillery.cards.blackjack;

//import java.util.ArrayList;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	private int handTotal;

//	public BlackjackHand() {
//	}

	//Add the total of the cards in the hand
	@Override
	public int calculateHandValue() {
		int handValue = 0;
		for (Card card : this.cardsInHand) {
			handValue += card.getValue();
		}
		return handValue;
		
	}

//	public int getHandTotal() {
//		return handTotal;
//	}

//	public void setHandTotal(int handTotal) {
//		this.handTotal = handTotal;
//	}


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
