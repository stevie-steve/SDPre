import java.util.Scanner;

public class ComparingNumbers {
  public static void main(String[] args ){
  Scanner keyboard = new Scanner(System.in);
  double first, second;

  System.out.print( "Give me two numbers: First: " );
  first = keyboard.nextDouble();
  System.out.print( "Second: " );
  second = keyboard.nextDouble();

  if ( first < second ) {
  System.out.println( first + " is LESS THAN " + second );
  }

  if ( first <= second ) {
  System.out.println( first + " is LESS THAN/EQUAL TO " + second );
  }

  if ( first == second ) {
  System.out.println( first + " is EQUAL TO " + second );
  }

  if ( first >= second ) {
  System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
  }

  if ( first > second ) {
  System.out.println( first + " is GREATER THAN " + second );
  }

  if ( first != second ) {
  System.out.println( first + " is NOT EQUAL TO " + second );
  System.out.println("Hey." );

  /* hey statement will run when within the curly braces
  of the whole 'if' statement when the statement is true (2 != 5)

  if statement is is not true (2 != 2) it will not show because it is part of the 'i
  */
  
}
  }
}
