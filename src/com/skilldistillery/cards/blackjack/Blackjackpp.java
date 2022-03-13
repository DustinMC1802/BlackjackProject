package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;

public class Blackjackpp {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Deck deck = new Deck();
		
		dealer.shuffle(deck);
		player.initialDeal(deck.dealCard(), deck.dealCard());
		
		
			
		}
			
		

}
