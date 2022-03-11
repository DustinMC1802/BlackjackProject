package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;

	private Suit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
