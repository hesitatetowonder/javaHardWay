import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
  public static void main( String[] args ) throws Exception {
    PrintWriter fileout = new PrintWriter( "receipt.txt" );
    Scanner keyboard = new Scanner(System.in);
    double gallons;
    double total;
    System.out.println ( "Gas cost 3.459 per gallon" );
    System.out.print ( "How many gallons of gas do you need? " );
    gallons = keyboard.nextDouble();
    total = gallons * 3.459;
    System.out.print("\nWriting customized receipt to 'receipt.txt'......done." );

    fileout.println( "+-------------------------+" );
    fileout.println( "|                         |" );
    fileout.println( "|       CORNER STORE      |" );
    fileout.println( "|                         |" );
    fileout.println( "| 2014-06-25   04:38PM    |" );
    fileout.println( "|                         |" );
    fileout.println( "| Gallons:            " + gallons + " |" );
    fileout.println( "| Price/gallon:   $ 3.459 |" );
    fileout.println( "|                         |" );
    fileout.println( "| Fuel total:     $" + total + " |" );
    fileout.println( "|                         |" );
    fileout.println( "+-------------------------+" );
    fileout.close();
  }
}
