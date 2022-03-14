package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

import java.util.Scanner;

public class Player {

	// Receives BlackjackHand
	private BlackjackHand playerHand;

	public Player() {
		playerHand = new BlackjackHand();

	}

	public void dealCard(Card dealtCard) {
		System.out.println("You have been dealt: ");
		playerHand.addCard(dealtCard);
		System.out.println(dealtCard);
//		if (playerHand.blackjack()) {
//			System.out.println("You got a Blackjack!!");
//			System.out.println("Let's see what the Dealer gets...");
//		} else if (playerHand.bust()) {
//			System.out.println("You busted! Better luck next time ");
//		} else {
//		}
	}

	// Decide to hit or stay
	public String hitOrStand(Scanner sc, Card i) {
		String hitInput = "";
		System.out.println("Your total is currently " + playerHand.getHandValue(i));
		System.out.println("Would you like to hit or stay?");
		System.out.println("Press \"H\" to press or \"S\" to Stay");
		hitInput = sc.next();
		return hitInput;

	}
	
	public boolean checkForBlackjack() {
		boolean check = false;
		if (playerHand.blackjack()) {
			check = true;
			
		} 
		return check;
	}
		
	public boolean checkForBust() {
		boolean check = false;
		if (playerHand.bust()) {
			check = true;
		}
		return check;
	}

}
