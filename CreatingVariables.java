public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;

    x = 10;
    y= 400;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Greg";
    lastName = "Taylor";
    title = "Mr.";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds.");
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + " " + lastName );

    int z;
    double pi;
    String city,state;

    z = 43;
    pi = 3.14;
    city = "Highgrove";
    state = "California";

    System.out.println( "Our new interger is " + z );
    System.out.println( "Our new floating point is " + pi );
    System.out.println( "We used " + city + " and " + state + " for our Strings." );
  }
}
