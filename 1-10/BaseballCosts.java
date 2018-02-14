
/*
Write a program that calculates how much a little league baseball
team spent last year to purchase new baseballs. The program should
prompt the user to enter the number of baseballs purchased and the
cost of each baseball. It should then calculate and display the
total amount spent to purchase the baseballs.

Author: Adriel Camargo 
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    
    
    System.out.println("The total amount earned is: " + getAmountSpent());
    
  }
  static double getAmountSpent(){
	
	double numberOfBaseballs = getNumberOfBaseballsPurchased();
	double baseballCost = getNumberOfBaseballsPurchased();

	return numberOfBaseballs * baseballCost;
}


static double costOfBaseball(){
  
  Scanner scan = new Scanner(System.in);
	double baseballCost;
	System.out.println("Enter how much does each baseball cost: ");
	baseballCost = scan.nextDouble();

	return baseballCost;
}

static double getNumberOfBaseballsPurchased(){
	Scanner scan = new Scanner(System.in);
	double baseballsPurchased;
	System.out.println("Enter the number of baseballs purchaed: ");
	baseballsPurchased = scan.nextDouble();

	return baseballsPurchased;
}
}







