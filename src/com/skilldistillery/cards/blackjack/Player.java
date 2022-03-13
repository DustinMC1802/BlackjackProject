package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	
	// Receives BlackjackHand
	private BlackjackHand playerHand;
	
	public Player() {
		playerHand = new BlackjackHand();
	}
	
	public void initialDeal(Card i,Card j) {
			playerHand.addCard(i);
			playerHand.addCard(j);
			System.out.println(i);
			System.out.println(j);
	}
	
	// Decide to hit or stay

}
