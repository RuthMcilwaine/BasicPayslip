package com.jetbrains.ch8;

public class Card {
    private String suit;
    private String name;
    private Integer value;

    public Card(String suit, String name, Integer value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
