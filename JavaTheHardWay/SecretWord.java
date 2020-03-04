import java.util.Scanner;

public class SecretWord{
  public static void main( String[] args ){
      Scanner keyboard = new Scanner(System.in);
      String secret = "please", guess, guess1;


      System.out.print( "What's the secret word? First guess:  " );
      guess = keyboard.next();

      System.out.print( "What's the secret word? Second guess:  " );
      guess1 = keyboard.next();

      if( guess.equals(secret) ||  guess1.equals(secret)) {
        System.out.println( "one of those is correct!" );
      }

    else {
      System.out.println( " No, the secret word isn't \""  + guess +  "\" or \"" +  guess1 + "\"." );
    }

    if ( guess == secret ) {
      System.out.println( "(This will never ever show, no matter what. )" );

    }
  }

}
