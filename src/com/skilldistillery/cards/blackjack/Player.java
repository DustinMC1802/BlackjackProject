package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

import java.util.Scanner;

public class Player {
	
	// Receives BlackjackHand
	private BlackjackHand playerHand;
	
	public Player() {
		playerHand = new BlackjackHand();
	
	}
	
	public void initialDeal(Card i,Card j) {
		System.out.println("You have been dealt: ");
			playerHand.addCard(i);
			playerHand.addCard(j);
			System.out.println(i);
			System.out.println(j);
	}
	
	// Decide to hit or stay
	public void hitOrStay(Scanner sc, Card i) {
		String hitImput;
		System.out.println("Would you like to hit or stay?");
		System.out.println("Press \"H\" to hit or \"S\" to Stay");
		hitImput = sc.next();
		if( hitImput.equals("H")) {
		System.out.println("You have been dealt: ");
		playerHand.addCard(i);
		System.out.println(i);
		} else {
			System.out.print(playerHand.toString());
		}
		
	}

}
