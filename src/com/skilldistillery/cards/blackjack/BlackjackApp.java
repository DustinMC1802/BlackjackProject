package com.skilldistillery.cards.blackjack;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

//import com.skilldistillery.cards.common.Card;
//import com.skilldistillery.cards.common.Hand;

public class BlackjackApp {

	private Dealer dealer = new Dealer();
	private Player player = new Player();
//	private BlackjackHand playerHand = new BlackjackHand();


	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();

		Scanner sc = new Scanner(System.in);
		

		app.shuffleDeck();
		app.dealInitialHands();
		app.checkPlayerForBlackJack();
		app.checkDealerForBlackJack();
		app.playerDecide(sc);
		app.dealerDecision();
		app.determineWinner();

		sc.close();
	}


	private void shuffleDeck() {
		this.dealer.shuffle(dealer.getDeck());
	}

	private void dealInitialHands() {
		this.player.receiveCard(dealer.getDeck().dealCard());
		this.dealer.initialDeal(dealer.getDeck().dealCard());
		this.player.receiveCard(dealer.getDeck().dealCard());
		this.dealer.receiveCard(dealer.getDeck().dealCard());
	}

	private void checkPlayerForBlackJack() {
		if (this.player.checkForBlackjack()) {
			System.out.println("You got a Blackjack!!");
			System.out.println("Let's see what the Dealer gets...");
		}
	}

	private void checkDealerForBlackJack() {
		if (this.dealer.checkForBlackjack()) {
			System.out.println("The Dealer got a Blackjack... Better luck next time");
		}
	}

	private void playerDecide(Scanner sc) {
		String answer = this.player.hitOrStay(sc, dealer.getDeck().dealCard());

		while (answer.equals("H")) {
			player.receiveCard(dealer.getDeck().dealCard());;
			answer = this.player.hitOrStay(sc, dealer.getDeck().dealCard());
		}

	}
	
	private void dealerDecision() {
		dealer.dealerDecider(dealer.getDeck().dealCard());
		
		}

			
	private void determineWinner() {
		if (dealer.getHandTotal() > player.getHandTotal() && dealer.getHandTotal() <= 21) {
			System.out.println("The dealer's total is " + dealer.getHandTotal());
			System.out.println("Your total is " + player.getHandTotal());
			System.out.println("Dealer wins. Better luck next time");
		} else if (dealer.getHandTotal() < player.getHandTotal() && player.getHandTotal() <= 21) {
			System.out.println("The dealer's total is " + dealer.getHandTotal());
			System.out.println("Your total is " + player.getHandTotal());
			System.out.println("You won!!");
		} else if (dealer.getHandTotal() == player.getHandTotal()){
			System.out.println("The dealer's total is " + dealer.getHandTotal());
			System.out.println("Your total is " + player.getHandTotal());
			System.out.println("It's a push");
		}
	}
		
		
	
}
