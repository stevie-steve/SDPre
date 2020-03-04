import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String z;

    System.out.println(" say HI");
    z = keyboard.next();

    while (! z.equals("HI")) {
    System.out.println("Thats not what i asked!, try again");
    z = keyboard.next();
  }

    System.out.print("Give me a number, and I'll find its square root. ");
    System.out.print("No negatives, please." );
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("I wont take the square root of a negative.");
      System.out.print("\nNew Number: ");
      x = keyboard.nextDouble();
}
      y = Math.sqrt(x);

      System.out.println("the square root of "+x+" is "+y);

  }
}
