package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{

	private Deck deck = new Deck();

	private BlackjackHand dealerHand;
	
//	public Dealer dealer = new Dealer();
	
	public Dealer() {
		this.dealerHand = new BlackjackHand();
		setDeck(new Deck());
	}
	// Shuffle Deck
	public void shuffle(Deck deck) {
		deck.shuffle();
		System.out.println("The dealer is shuffling the deck");
		System.out.println("");
	}

	// Deals themselves Cards
	public void initialDeal(Card dealtCard) {
		System.out.println("");
		System.out.println("The Dealer deals themself: ");
		this.dealerHand.addCard(dealtCard);
		System.out.println("Card = face down");
		System.out.println("");
	}
	
	@Override
	public void receiveCard(Card dealtCard) {
		System.out.println("");
		System.out.println("The Dealer deals themself: ");
		this.dealerHand.addCard(dealtCard);
		System.out.println(dealtCard);
		System.out.println("");
	}


	// Must hit if card sum is < 17
	public void hitOrStand(Card i) {
		if(this.dealerHand.getHandValue(i) >= 17) {
			
		}

	}
	
	//Getters and Setters for the Deck
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	//

}
