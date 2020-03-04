import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args ){

    Scanner bingo = new Scanner(System.in);

    double x, y, sum;

    System.out.println ("Please enter a number. " );
    x = bingo.nextDouble();

    System.out.println("Please enter another number." );
    y = bingo.nextDouble();

    sum = x+y;

    System.out.println("The sum of " + x + " and " + y + " is " + sum + "." );

  }
}
