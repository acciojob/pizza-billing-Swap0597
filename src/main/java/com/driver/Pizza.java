package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private  boolean isBillGenerated;
    private int basePrice;
    private int extraCheese;
    private boolean isCheeseAdded;
    private int extraTopping;
    private  boolean isToppingAdded;
    private int bagPrice = 20;
    private boolean isBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            basePrice = 300;
            extraTopping = 70;

        }
        else{
            basePrice = 400;
            extraTopping = 120;

        }
        extraCheese = 80;
        bagPrice = 20;
        price = basePrice;
        bill = "";
        isBagAdded = false;
        isToppingAdded = false;
        isCheeseAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            price += extraCheese;
            isCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false){
            price += extraTopping;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isBagAdded == false){
            price += bagPrice;
            isBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == true){
            return bill;
        }

        bill += "Base Price Of The Pizza: " + basePrice +"\n";

        if(isCheeseAdded == true){
            bill += "Extra Cheese Added: " + extraCheese +"\n";
        }
        if(isToppingAdded == true){
            bill += "Extra Toppings Added: " + extraTopping +"\n";
        }
        if(isBagAdded == true){
            bill += "Paperbag Added: " + bagPrice +"\n";
        }
        bill += "Total Price: " + price +"\n";
        isBillGenerated = true;
        return this.bill;
    }
}
