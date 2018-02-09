/*
Write a program that calculates how much a student organization earns
during its fund raising candy sale. The program should prompt the user
to enter the number of candy bars sold and the amount the organization
earns for each bar sold. It should then calculate and display the total
amount earned.
Author: Carlos Abraham, @19cah
www.19cah.com
*/

import java.util.Scanner;

public class CandyBarsSales {

  Scanner scan = new Scanner(System.in);

  public static void main(String[] args){

      CandyBarsSales c = new CandyBarsSales();
      System.out.println("The total amount earned is: " + c.getTotalEarned());
  }

  double getNumberOfCandiesBarsSold(){
  	double candyBarsTotal;
  	System.out.println("Enter the number of candy bars sold in the fund raising candy sale: ");
    candyBarsTotal = scan.nextDouble();

  	return candyBarsTotal;
  }

  double getRevenuePerCandy(){
    double getRevenuePerCandy;
    System.out.println("How much will the organization earn when sell a candy: ");
    getRevenuePerCandy = scan.nextDouble();
    
    return getRevenuePerCandy;
  }

  double getTotalEarned(){
    return getNumberOfCandiesBarsSold() * getRevenuePerCandy();
  }
}
