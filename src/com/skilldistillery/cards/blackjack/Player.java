package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

import java.util.Scanner;

public class Player {

	// Receives BlackjackHand
	private BlackjackHand playerHand;

	public Player() {
		playerHand = new BlackjackHand();

	}

	public void initialDeal(Card i, Card j) {
		System.out.println("You have been dealt: ");
		playerHand.addCard(i);
		playerHand.addCard(j);
		System.out.println(i);
		System.out.println(j);
	}

	// Decide to hit or stay
	public void hitOrStay(Scanner sc, Card i) {
		String hitInput = "";
		System.out.println("Your total is currently " + playerHand.getHandValue(i));
		System.out.println("Would you like to hit or stay?");
		System.out.println("Press \"H\" to press or \"S\" to Stay");
		hitInput = sc.next();
		do {
				System.out.println("You have been dealt: ");
				playerHand.addCard(i);
				System.out.println(i);
				System.out.println("Your total is currently " + playerHand.getHandValue(i));
				System.out.println("Would you like to hit again or stay?");
				System.out.println("Press \"H\" to press or \"S\" to Stay");
				hitInput = sc.next();

		} while (hitInput.equals("H"));

	}

}
