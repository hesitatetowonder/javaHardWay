import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    String car;

    System.out.print( "What type of car do you drive? " );
    car = keyboard.next ();
    System.out.println( "So you drive a " + car + ", nice.");
  }
}
// Study drill 1 : No, I would guess that it just assumes .0 for the double.
// Study drill 2 : No, we were told earlier that strings are a collection and
// can even be a collection of numbers, would guess that if we had a = 23 and
// b = 5  that a + b would return 235 and not 8.
// Study drill 3: Cannot blow up program on question 1(string), anything(ie 43.4
// or Greg) blows up question 2, only alpha characters blow up question 3 and 4
// (double)
// Study drill 4:
