import java.util.Scanner;

public class BMICategories {
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

    System.out.println( "Your BMI is: " + bmi );

    System.out.print( "BMI category is: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severly underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severly underweight" ) ;
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severly obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
