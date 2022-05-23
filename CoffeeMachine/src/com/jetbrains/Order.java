package com.jetbrains;

public class Order {
    private Drink drink = Drink.noDrink;
    private String sugar = "";
    private String hot = "";
    private float cost = 0;
    private String touillette = "";
    private float cashAmount = 0;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setSugar(String sugar) {
        if (!sugar.equals("0")) {
            this.sugar = sugar;
            this.touillette = "0";
        }
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

//    public boolean isHot(String hot) {
//        if (hot.equals("Y")) {
//            return true;
//        }

//    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public Order() {

    }

    public String displayOrder() {
        if (cashAmount < cost) {
            float difference = cost - cashAmount;
            return "M:missing amount is " + difference;
        }
        return convertDrinkToLetter() + hot + ":" + sugar + ":" + touillette;
    }

    private String convertDrinkToLetter() {
        switch (drink) {
            case Tea:
                return "T";
            case Coffee:
                return "C";
            case HotChoc:
                return "H";
            case OJuice:
                return "O";
            default:
                return "";
        }
    }

    public float getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(float cashAmount) {
        this.cashAmount = cashAmount;
    }

    public float getCost() {
        return cost;
    }


    public Drink getDrink() {
        return drink;
    }

}
