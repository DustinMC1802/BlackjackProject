package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;

import java.util.Scanner;

public class BlackjackApp {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Dealer dealer = new Dealer();
		Player player = new Player();
		Deck deck = new Deck();
		
		dealer.shuffle(deck);
		player.initialDeal(deck.dealCard(), deck.dealCard());
		player.hitOrStay(sc, deck.dealCard());
		dealer.initialDeal(deck.dealCard(), deck.dealCard());
		
		
		sc.close();
		}
			
		

}
