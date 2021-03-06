public class HeronsFormula{
  public static void main(String[] args ){
    double a, g;
    String tws = "a triangle with sides";

    a = triangleArea(3, 3, 3);
    System.out.println(" A triangle with sides 3, 3, 3 has area " + a);

    a = triangleArea(3, 4, 5);
    System.out.println(" A triangle with sides 3, 4 ,5 has area " + a);
    g = triangleArea(7, 8, 9);
    System.out.println(tws + " 7, 8 ,9 has an area " + g);

    System.out.println(tws + " 5, 12, 13 has area " + triangleArea(5, 12, 13));
    System.out.println(tws + " 10, 9, 11 has area " + triangleArea(10, 9, 11));
    System.out.println(tws + " 8, 15, 17 has area " + triangleArea(8, 15, 17));
    System.out.println(tws + " 9, 9, 9,  has area " + triangleArea(9, 9, 9));
}


public static double triangleArea( int a, int b, int c){
  double  s, A;

  s = (a+b+c)/2.0;
  A = Math.sqrt( s*(s-a)*(s-b)*(s-c));
  return A;

  }
}
/*
1. without a function is longer.  the function allows a formula to be written once
without needing to rewrite it each time
2. you would have to revalue a, b and c and rewrite the HeronsFormula
3. you would have to change every formula, with this you can just change it once
*/
