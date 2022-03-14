package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;

import java.util.Scanner;

public class BlackjackApp {

	private Dealer dealer = new Dealer();
	private Player player = new Player();
	private Deck deck = new Deck();


	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();

		Scanner sc = new Scanner(System.in);

		app.shuffleDeck();
		app.dealInitialHands();
		app.checkPlayerForBlackJack();
		app.checkDealerForBlackJack();
		app.checkPlayerForBust();
		app.checkDealerForBust();
		app.hitOrStand(sc);

		sc.close();
	}

	private void shuffleDeck() {
		dealer.shuffle(deck);
	}

	private void dealInitialHands() {
		player.dealCard(deck.dealCard());
		dealer.initialDeal(deck.dealCard());
		player.dealCard(deck.dealCard());
		dealer.dealCard(deck.dealCard());
	}

	private void checkPlayerForBlackJack() {
		if (player.checkForBlackjack()) {
			System.out.println("You got a Blackjack!!");
			System.out.println("Let's see what the Dealer gets...");

		} else {
		}

	}

	private void checkDealerForBlackJack() {
		if (dealer.checkForBlackjack()) {
			System.out.println("The Dealer got a Blackjack... Better luck next time");
		} else {
		}

	}

	private void checkPlayerForBust() {
		if (player.checkForBust()) {
			System.out.println("You busted! Better luck next time ");
		}
	}

	private void checkDealerForBust() {
		if (dealer.checkForBlackjack()) {
			System.out.println("The Dealer busted!! You win!!");
		}
	}

	private void hitOrStand(Scanner sc) {
		String answer = player.hitOrStand(sc, deck.dealCard());

		while (answer.equals("H")) {
			player.dealCard(deck.dealCard());
			answer = player.hitOrStand(sc, deck.dealCard());
		}

	}
}
