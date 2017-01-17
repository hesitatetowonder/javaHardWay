import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi;
    double jin, ft, in, lbs;

    System.out.print( "Your height(feet only): " );
    ft = keyboard.nextDouble();
    System.out.print( "Your height (inches): ");
    jin = keyboard.nextDouble();
    in = ft * 12 + jin;
    m = in/39.37;

    System.out.print( "Your weight in lbs: " );
    lbs = keyboard.nextDouble();
    kg = lbs/2.2;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
