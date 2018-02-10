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
public class PersonalInformation{
  public static void main(String[] args){

    PersonalInformation student = new PersonalInformation();
    student.personalInformation();
  }

  public void personalInformation(){
    name("Abraham");
    direction("123 N Test Street", "Miami", "FL", 12345);
    telephoneNumber("3051234567");
    major("Computer Science");
  }

  public void name(String name){
    System.out.println("Name: " + name);
  }

  public void direction(String address, String city, String state, int zipCode){
    System.out.println("Address: "
                        +address + " "
                        +city + ", "
                        +state + " "
                        +zipCode);
  }

  public void telephoneNumber(String phone){
    System.out.println("Telephone Number: " + phone);
  }
  public void major(String major){
    System.out.println("Major: "+ major);
  }
}
