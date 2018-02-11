/*
Write a program that displays the
following information, each on a separate line:

  Your name
  Your address, with city, state, and zip code
  Your telephone number
  Your college major

Author: Carlos Abraham, @19cah
www.19cah.com
*/
public class TrianglePattern{
  public static void main(String[] args){

    TrianglePattern shape = new TrianglePattern();
    shape.triangle(4);
  }

  public void triangle(int height)
  {
    for(int i = 0; i < height; i++)
    {
      for(int j = 0; j < height - i; j++)
      {
        System.out.print(" ");
      }
      for(int k = 0; k < i; k++)
      {
        System.out.print("*");
      }
      for(int l = 0; l < i + 1; l++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
