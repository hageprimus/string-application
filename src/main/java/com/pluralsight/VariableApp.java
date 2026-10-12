package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        //Step 1:
        String myColor;
        int startingYear;
        char middleInitial;
        boolean hasPets;
        String niceMessage;

        //Step 2:
        int daysInWeek = 7;
        System.out.println("The number of days in the week is: " + daysInWeek);

        float priceOfCoffee = 4.99f;
        System.out.println("The current price of coffee is: " + priceOfCoffee);

        char favoriteLetter = 'w';
        System.out.println("My favorite letter is: " + favoriteLetter);

        boolean isRaining = false;
        String output = isRaining ? "It is raining." : "It is not raining.";
        System.out.println(output);
    }
}
