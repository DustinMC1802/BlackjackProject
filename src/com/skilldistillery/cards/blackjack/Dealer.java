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
	
	// Finish Dealer's Hand
private BlackjackHand dealerHand;
	
	public Dealer() {
		dealerHand = new BlackjackHand();
	
	}
	
	public void initialDeal(Card i,Card j) {
		System.out.println("");
		System.out.println("The Dealer deals themself: ");
			dealerHand.addCard(i);
			dealerHand.addCard(j);
			System.out.println("Card = face down");
			System.out.println(j);
	}
	
	// Must hit if card sum is < 17
	public void hitOrStay(Card i) {
		
		
	}
	
	
		// 

}
