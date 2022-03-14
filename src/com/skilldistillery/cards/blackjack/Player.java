package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

//import java.util.ArrayList;
import java.util.Scanner;

public class Player {

	// Receives BlackjackHand
	private BlackjackHand playerHand;

	public Player() {
		playerHand = new BlackjackHand();

	}
	
//	public Player player = new Player();

	public void receiveCard(Card dealtCard) {
		System.out.println("The Dealer deals you: ");
		this.playerHand.addCard(dealtCard);
		System.out.println(dealtCard);
	}

	// Decide to hit or stay
	public String hitOrStay(Scanner sc, Card i) {
		String hitInput = "S";
		System.out.println("Your total is currently " + this.playerHand.calculateHandValue());
		if (this.playerHand.calculateHandValue() > 21) {
			System.out.println("You busted! Better luck next time ");
		} else if (this.playerHand.calculateHandValue() == 21){
			System.out.println("You got 21! Let's see what the Dealer gets...");
		} else {
		System.out.println("Would you like to hit or stay?");
		System.out.println("Press \"H\" to press or \"S\" to Stay");
		hitInput = sc.next();
		}
		return hitInput;
	}
	
	public int getHandTotal() {
		int handTotal = this.playerHand.calculateHandValue();
		return handTotal;
	}
	
	public boolean checkForBlackjack() {
		boolean check = false;
		if (this.playerHand.blackjack()) {
			check = true;
			
		} 
		return check;
	}
		
//	public boolean checkForBust() {
//		boolean check = false;
//		if (this.playerHand.bust()) {
//			check = true;
//		}
//		return check;
//	}

}
