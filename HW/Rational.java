//Stefan Tan
//APCS1 pd8
//HW#37 -- Be More Rational
//2017-11-20

/******************************
 * class Rational
 * stores a rational number (p/q s.t. p,q ints && q!=0)
 *
 ******************************/
public class Rational implements Comparable 
{
    //   Instance variables for the numerator and denominator
    private int _numerator;
    private int _denominator;


    // Default constructor (no parameters)
    // creates a new Rational with the value of 0/1
    public Rational()
    {
	_numerator = 0;
	_denominator = 1;
    }


    // Constructor
    // takes 2 parameters, one for the numerator, one for the denominator
    // if an invalid denominator is attempted, should print a message and set the number to 0/1
    public Rational( int n, int d )
    {
	this();
	if ( d != 0 ) {
	    _numerator = n;
	    _denominator = d;
	}
	else {
	    System.out.println( "Invalid number. " +
				"Denominator set to 1." );
	}
    }


    // toString
    // returns a string representation of the rational number (formatting of your choice)
    public String toString()
    {
	return _numerator + " / " + _denominator;
    }


    // floatValue
    // returns floating point approximation of the number
    // uses the most precise floating point primitive
    public double floatValue()
    {
	return (double)_numerator / _denominator;
    }


    // multiply
    // takes 1 Rational object as a parameter and multiplies it by this Rational object
    // does not return any value
    // should modify this object and leave the parameter alone (see below for example)
    // need not reduce the fraction
    public void multiply( Rational r )
    {
	_numerator   = this._numerator   * r._numerator;
	_denominator = this._denominator * r._denominator;
    }


    // divide
    // works the same as multiply, except the operation is division
    public void divide( Rational r )
    {
	if ( r._numerator != 0 ) {
	    _numerator   = _numerator   * r._denominator;
	    _denominator = _denominator * r._numerator;
	}
	else {
	    System.out.println( "Div by 0 error. Values unchanged." );
	}
    }

    // static gcd
    // takes two int parameters and finds the gcd of them
    public static int gcd(int a, int b){
	if (a % b == 0) 
	    return b;
	return gcd(b, a % b);
    }

    // add
    // Takes 1 Rational object and adds it to the current rational number object
    // Needs not reduce
    public void add( Rational r )
    {
	_numerator = (this._numerator * r._denominator) + (r._numerator * this._denominator);
	_denominator = this._denominator * r._denominator;
    }

    // subtract
    // Takes 1 Rational object and subtracts it to the current rational number object
    // Needs not reduce
    public void subtract( Rational r )
    {
	_numerator = (this._numerator * r._denominator) - (r._numerator * this._denominator);
	_denominator = this._denominator * r._denominator;
    }

    // non-static gcd
    // Returns the gcd of the numerator and the denominator of this Rational
    public int gcd()
    {
	return gcd(_numerator, _denominator);
    }

    // reduce
    // Changes this Rational to one in reduced form (should use gcd)
    public void reduce()
    {
	_numerator = this._numerator / gcd();
	_denominator = this._denominator / gcd();
    }

    // compareTo
    // Takes a Rational parameter and compares it to the calling object.
    // Returns 0 if the two numbers are equal
    // Returns a positive integer if the calling number is larger than the parameter
    // Returns a negative integer if the calling number is smaller than the parameter
    public int compareTo( Rational r )
    {
	if (this.floatValue() == r.floatValue())
	    return 0;
	else if (this.floatValue() > r.floatValue())
	    return 1;
	return -1;
    }

    //main method for testing
    public static void main(String[] args)
    {
	/*
	  Rational r = new Rational( 3, 7 );
	  Rational s = new Rational();
	  Rational t = new Rational( 8, 5 );

	  Rational u = new Rational( 1, 2 );
	  Rational v = new Rational( 2, 3 );
	  Rational w = new Rational( 8, 12 );

	  System.out.println("r: " + r );
	  System.out.println("s: " +  s );
	  System.out.println("t: " +  t );

	  System.out.println( r + " represented as a floating pt num: "
	  + r.floatValue() );

	  System.out.print( r + " * " + t + " = ");
	  r.multiply(t);
	  System.out.println(r);

	  System.out.print( r + " / " + t + " = ");
	  r.divide(t);
	  System.out.println(r);
	*/
	
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	Rational u = new Rational(1,2); //Stores the rational number 1/2
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
	t.reduce(); //Changes t to 2/9
	System.out.println(r);
	System.out.println(s);
	System.out.println(t);

	System.out.println(r.compareTo(s)); //Returns 1
	System.out.println(s.compareTo(u)); //Returns 0
	System.out.println(t.compareTo(s)); //Returns -1
    }
}//end class Rational
