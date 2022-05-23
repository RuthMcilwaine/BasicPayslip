package com.jetbrains;

public class Card {
        String type;
        String suit;
        Integer value;


        public Card(String type, String suit, Integer value) {
                this.type = type;
                this.suit = suit;
                this.value = value;
        }


        @Override
        public String toString() {
        return "Cards{" +
                "type=" + type +
                ", suit=" + suit +
                ", value=" + value +
                '}';
        }
}

