import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pass, pw;
    pin = 12345;
    pw = "bingo";

    System.out.println("WELCOME TO THE BANK OF JAVA");
    System.out.print("ENTER YOUR PASSWORD" );
    pass = keyboard.next();

    while ( ! pass.equals("bingo")) {
      System.out.println("eh, eh, eh! Thats not the password" );
      System.out.print("Try again!");
      pass = keyboard.next();
    }

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ){
      System.out.println("\nINCORRECT PIN.TRY AGAIN. ");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();

    }
    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALLANCE IS $12345.00 " );

  }

}
