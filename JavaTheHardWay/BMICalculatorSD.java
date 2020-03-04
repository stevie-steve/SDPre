import java.util.Scanner;

public class BMICalculatorSD {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);

    double inches, ft, lb, m, kg, bmi;

    System.out.print( "Your height in inches: " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in lb: " );
    lb = keyboard.nextDouble();

    m = inches*.0254;
    kg = lb*0.453592;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );

  }
}
