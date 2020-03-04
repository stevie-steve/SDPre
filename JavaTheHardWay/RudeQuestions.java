import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, comment;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();


    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old. " );
    System.out.print( "How much do you weigh, " + name + "?" );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();


    System.out.print( "hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );

    System.out.print( "Are you getting offended? " );
    comment = keyboard.next();

    System.out.println( comment + "? I wouldn't have guessed that! " );

    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

// no because a double can emcompass intigers, but not the other way
// no because a string can be anyhting, it is not seen as a numerical value
// i cant find anything, but "space" alone will not run the first, or any output
  }
}
