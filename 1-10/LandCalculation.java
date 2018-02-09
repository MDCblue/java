/*

  In the United States, land is often measured in
  square feet. In many other countries it is measured
  in square meters. One acre of land is equivalent to
  43,560 square feet. A square meter is equivalent to
  10.7639 square feet. Write a program that computes
  and displays the number of square feet and the number
  of square meters ¼ in acre of land. Hint: Because a
  square meter is larger than a square foot, there will
  be fewer square meters in ¼ acre than there are
  square feet.
  
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
