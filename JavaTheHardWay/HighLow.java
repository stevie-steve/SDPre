import java.util.Scanner;

public class HighLow {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner (System.in);
    int secret, guess;

    secret = 1 + (int)(100*Math.random());

    System.out.println("i am thinking of a number from 1 - 100. " );
    System.out.println("Try to guess it! " );
    System.out.print( " > " );
    guess = keyboard.nextInt();

    while ( secret != guess) {



      if ( guess < secret ) {
        System.out.print( " Sorry your guess is too low ");
      }
      if (guess > secret) {
          System.out.print("Your guess was too high." );
        }

        System.out.print(" Try again. \n> " );
          guess = keyboard.nextInt();
        
    }
    System.out.println( "You guessed it! " );

  }
}
