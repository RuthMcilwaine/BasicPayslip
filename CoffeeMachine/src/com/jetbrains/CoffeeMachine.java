package com.jetbrains;


public class CoffeeMachine {
    private Order order = new Order();


    public void setDrink(String drinkInput) {
        if (drinkInput.equals("1")) {
            this.order.setDrink(Drink.Tea);
            this.order.setCost(0.4f);
        } else if (drinkInput.equals("2")) {
            this.order.setDrink(Drink.Coffee);
            this.order.setCost(0.6f);
        } else if (drinkInput.equals("3")) {
            this.order.setDrink(Drink.HotChoc);
            this.order.setCost(1.0f);
        } else if (drinkInput.equals("4")) {
            this.order.setDrink(Drink.OJuice);
            this.order.setCost(0.6f);
        }
    }

    public Order getDrinkOrder() {
        Order currentOrder = this.order;
        order = new Order();

        return currentOrder;
    }

    public void setHot(String hot) {
        if (hot.equals("Y")) {
            this.order.setHot("h");
        }
    }
//
//    public void setHot(String hot) {
//        if (hot.equals("Y")) {
//            this.order.setHot("h");
//        }
//    }

    public void setSugar(String sugar) {
        order.setSugar(sugar);
    }

    public boolean isHotDrink() {
        return order.getDrink() != Drink.OJuice;
    }

    public void setCashAmount(float cashAmount) {
        this.order.setCashAmount(cashAmount);
    }

    public String toString() {
        return "I am a Coffee Machine";
    }
}


