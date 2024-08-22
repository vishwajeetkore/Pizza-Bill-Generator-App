
//here if boolean is true then it is veg pizza or if false then it is the non veg pizza


public class Main {
    public static void main(String[] args) {

//    Pizza basePizza = new Pizza(true);
//    basePizza.addExtraToppings();
//    basePizza.takeAway();
//    basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
        dp.addExtraToppings();
        dp.addExtraCheese();
        dp.takeAway();
        dp.getBill();

    }
}