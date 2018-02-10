/*
An electronics company sells circuit boards
at a 40 percent profit. Write a program that
calculates the selling price of a circuit board
that costs them $12.67 to produce. Display the
result on the screen.

Author: Carlos Abraham, @19cah
www.19cah.com
*/
public class CircuitBoardPrice {
    public static void main(String[] args){

      CircuitBoardPrice price = new CircuitBoardPrice();
      System.out.println("Selling Price: " + price.sellingPrice(12.64));
    }

    double sellingPrice(double moneyInvested){
        return (moneyInvested * 100)/60;
    }
}
