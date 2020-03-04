import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String[] args ){
  Scanner bingo = new Scanner(System.in);

  int number;

  System.out.println( "Please enter a number: " );
  number = bingo.nextInt();

  if (number % 2 == 0) {
    System.out.println( "the number is even" );
    }

  else {
    System.out.println( "the number is odd" );
    }
  }
}
