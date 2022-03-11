package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;
//	private List<Card> cards = new ArrayList<>(52);
	
//	Instance Initiallizer
//	{	
//		this.cards = new ArrayList<>(52);
//	}
	
	public Deck() {
		this.cards = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card newCard = new Card(suit, rank);
				cards.add(newCard);
			}
		}
		
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}

}
