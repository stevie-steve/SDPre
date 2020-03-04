public class ClubBouncer {
  public static void main(String[] args ){

    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)){
      System.out.println("You are allowed in the club. " );
    }

    System.out.println("boooooo");

    else {
      System.out.println("You are not allowed in the club. " );
// will not compile bacause the 'else' statement is not connected directly to the 'if'
    }
  }
}
