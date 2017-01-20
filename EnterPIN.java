import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, correct;

    password = "wrong";
    correct = "MyCatFluffy";
    pin = 12345;

    System.out.println( "WELCOME TO THE BANK OF JAVA." );
    System.out.println( "ENTER YOUR PASSWORD: ");
    password = keyboard.nextLine();

    while ( ! password.equals( "MyCatFluffy" ) ) {
      System.out.println( "\nINCORRECT PASSWORD, TRY AGAIN" );
      System.out.println( "ENTER YOUR PASSWORD: ");
      password = keyboard.nextLine();
    }

    System.out.println( "YOUR PASSWORD IS ACCEPTED." );
    System.out.println( "ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
      System.out.println( "ENTER YOUR PIN: " );
      entry = keyboard.nextInt();
    }

    System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCD IS $425.17" );
  }
}
