import java.util.Scanner;

public class BMICalculatorSD2 {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);

    double inches, ft, lb, m, kg, bmi;

    System.out.print( "Your height in ft: " );
    ft = keyboard.nextDouble();

    System.out.print( "Your remaining inches of height: " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in lb: " );
    lb = keyboard.nextDouble();


    m = (ft*12+inches)*.0254;
    kg = lb*0.453592;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );

  }
}
