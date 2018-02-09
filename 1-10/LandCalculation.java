/*
Write a program that calculates how much a student organization earns
during its fund raising candy sale. The program should prompt the user
to enter the number of candy bars sold and the amount the organization
earns for each bar sold. It should then calculate and display the total
amount earned.
Author: Carlos Abraham, @19cah
www.19cah.com
*/
public class LandCalculation {

  final double  ACRE = 43560; //square feet
  final double SQUARE_METER = 10.7639; // square feet

  public static void main(String[] args){

    LandCalculation l = new LandCalculation();
      System.out.println("In ¼ in acre of land there are " + l.squareFeetInAcre(0.25) + " square feets.");
      System.out.println("In ¼ in acre of land there are " + l.squareMeterInAcre(0.25) + " square meters.");
    }

      double squareFeetInAcre(double acre){
        return acre * ACRE;
      }

      double squareMeterInAcre(double acre){
        return squareFeetInAcre(acre) / SQUARE_METER;
      }
}
