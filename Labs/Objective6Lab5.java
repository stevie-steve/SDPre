import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args ){
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("____Menu___");
      System.out.println("1. Say Hello");
      System.out.println("2. List my favorite foods");
      System.out.println("3. Exit");
      System.out.println();

      selection = scanner.nextInt();

      if (selection == 1) {
        System.out.println(" Hello World");
      }

      else if (selection ==2) {
        System.out.println("Apple, banana, coconut");
      }

      else if (selection == 3) {
        System.out.println("Goodbye");
          break;
      }
      else  {
        System.out.println("Please type 1, 2 or 3");
      }

    }
    scanner.close();
  }
}
