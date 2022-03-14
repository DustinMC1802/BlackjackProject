package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{

	private Deck deck = new Deck();

	private BlackjackHand dealerHand;
//	protected List<Card> = new dealerHand();
//	public Dealer dealer = new Dealer();
	
	public Dealer() {
//		setDeck(new Deck());
		this.dealerHand = new BlackjackHand();
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
//		System.out.println(dealtCard);
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
	public int dealerDecider(Card dealtCard) {
//		int dealerTotal = this.dealerHand.calculateHandValue();
		int dealerTotal = getHandTotal();
		if(dealerTotal < 17) {
			this.dealerHand.addCard(dealtCard);
//			System.out.println(dealtCard);
//			System.out.println();
//			System.out.println("The Dealer total is currently " + this.dealerHand.calculateHandValue());

		} else if(dealerTotal >= 17) {
			if (dealerTotal > 21) {
				System.out.println();
				System.out.println("The Dealer busted! You win!!");
			} else if(dealerTotal == 21) {
				System.out.println();
				System.out.println("The dealer won. Better luck next time");
			}
//			System.out.println(this.dealerHand.getHandValue(dealtCard));
		}
		return dealerTotal;
	}
	@Override
	public int getHandTotal() {
		int handTotal = this.dealerHand.calculateHandValue();
		return handTotal;
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
