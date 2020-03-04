import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args ) {
      Scanner keyboard = new Scanner(System.in);

      int age;

      System.out.print( "How old are you? " );
      age = keyboard.nextInt();

      System.out.print( "You are : " );

      if ( age < 13 ) {
      System.out.println("\ttoo young to create a Facebook account. " );
      }

      if ( age >= 13 ) {
      System.out.println("\table to make a Facebook Account. " );
      }

      if ( age < 16 ) {
      System.out.println( "\ttoo young to get a drivers license. " );
      }
      
      if ( age >= 16 ) {
      System.out.println( "\t ready to get your license! " );
      }

      if ( age < 18 ) {
      System.out.println("\ttoo young to get a tattoo. " );
      }

      if ( age >= 18 ) {
      System.out.println("\tin need of some ink! " );
      }

      if ( age < 21 ) {
      System.out.println("\ttoo young to drink alcohol. " );
      }

      if ( age >= 21 ) {
      System.out.println("\tlegally able to have a drink. " );
      }

      if ( age < 35 ) {
      System.out.println("\ttoo young to run for president. " );
      System.out.println("\t\t(how sad!)" );
      }

      if ( age >= 35 ) {
      System.out.println("\tnext in line for presidency. " );
      System.out.println("\t\t(Good luck!)" );
      }

      if ( age >= 65 ){
      System.out.println("\told enough to retire! " );
      }

      if ( age < 65 ){
      System.out.println("\tnot able to retire yet!! " );

      }


    }

  }
