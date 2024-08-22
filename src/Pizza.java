public class Pizza {
    private int price;

    private boolean veg;

    private int extracheeseprice = 100;
    private int extratoppingsprice = 150;
    private int backpackprice = 20;
    private int basepizzaprice;

    private boolean extracheeseadded = false;
    private boolean extratoppingsadded = false;
    private boolean isoptedtakeaway = false;

    public Pizza(boolean veg){
        this.veg =veg;
        if(this.veg){
            this.price = 300;
        }else {
            this.price = 400;
        }
        basepizzaprice = this.price;
    }
    public void getPizzaPrice()
    {
        System.out.println(this.price);
    }

    public void addExtraCheese()
    {
        extracheeseadded = true;
        this.price += extracheeseprice;
    }

    public void addExtraToppings()
    {
        extratoppingsadded = true;
        this.price += extratoppingsprice;
    }

    public void takeAway()
    {
        isoptedtakeaway = true;
        this.price += backpackprice;
    }

    public void getBill()
    {
        String bill = "";

        System.out.println("Pizza : " +basepizzaprice);

        if(extracheeseadded){
            bill += "extra cheese added : "+extracheeseprice + "\n";

    }
        if(extratoppingsadded){
            bill += "extra toppings added : "+extratoppingsprice+"\n";
        }

        if(isoptedtakeaway){
            bill += "take away : "+backpackprice+ "\n";
        }

        bill += "Bill : " + this.price +"\n";
        System.out.println(bill);
    }


}
