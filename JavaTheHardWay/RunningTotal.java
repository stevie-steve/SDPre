import java.util.Scanner;

public class RunningTotal{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int current=1, total = 0;

    System.out.print(" Type in a bunch of values and ill add them up." );
    System.out.println( " Ill stop when you type a zero. " );



    while (current!=0){
      System.out.print("Value: " );
      current = keyboard.nextInt();
      total += current;
  
      System.out.println(" the total so far is: " + total);

} while ( current !=0);

    System.out.println("The final total is : " + total);
  }
}
