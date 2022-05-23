package com.jetbrains.ch8;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {

    }

    public Stock(String s, String n) {
        this.symbol = s;
        this.name = n;
    }

    public double getChangePercent() {
        return ( previousClosingPrice - currentPrice ) * 100;
    }

}
