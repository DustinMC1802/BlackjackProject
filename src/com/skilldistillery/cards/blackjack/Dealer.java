package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{

	//private Deck deck = new Deck();

	private BlackjackHand dealerHand;
	
	public Dealer() {
		dealerHand = new BlackjackHand();
	}
	// Shuffle Deck
	public void shuffle(Deck deck) {
		deck.shuffle();
		System.out.println("The dealer is shuffling the deck");
		System.out.println("");
	}

	// Deal Cards (dealCard)
	public void initialDeal(Card dealtCard) {
		System.out.println("");
		System.out.println("The Dealer deals themself: ");
		dealerHand.addCard(dealtCard);
		System.out.println("Card = face down");
		System.out.println("");
	}
	
	@Override
	public void dealCard(Card dealtCard) {
		System.out.println("");
		System.out.println("The Dealer deals themself: ");
		dealerHand.addCard(dealtCard);
		System.out.println(dealtCard);
		System.out.println("");
	}


	// Must hit if card sum is < 17
	public void hitOrStay(Card i) {

	}

	//

}
