// Zach Heine
// September 20th, 2016
// CS 419
// Rational Class
// This class sets up all the methods and functionality
// to implement a procedure to operate on Rational Numbers.

package rational;

public class Rational {
	/*
	 Zero Argument Constructor
	 Builds a Rational Number with 0 as
	 as the numerator and 1 as the denominator
	*/
	public Rational()
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	
	/*
	 One Argument Constructor
	 Builds a Rational number using the
	 parameter n as the numerator and 1
	 as the denominator
	 */
	public Rational(long n)
	{
		this.numerator = n;
		this.denominator = 1;
	}
	
	/*
	 Two Argument Constructor
	 Builds a rational number using the
	 parameter n as the numerator and the 
	 parameter d as the denominator. If the
	 value of d is zero, it changes the value
	 of n to 0 and d to 1. This constructor
	 also calls the normalize method to get
	 the number in normalized form.	 
	 */
	public Rational(long n, long d)
	{
		if(d == 0)
		{
			n=0;
			d=1;
		}
		else
		{
			numerator = n;
			denominator = d;
		}
		normalize();
	}
	
	/*
	 getNumerator returns the value of the
	 numerator field for a particular
	 rational number
	 */
	public long getNumerator()
	{
		return this.numerator;
	}
	
	/*
	 getNumerator returns the value of the
	 denominator field for a particular
	 rational number
	 */
	public long getDenominator()
	{
		return this.denominator;
	}
	
	/* 
	 This add method and the next three methods act like the 
	 C++ operators +=, -=, *=, and /=, respectively. Each method 
	 modifies the this object. The this object acts like the left-hand 
	 argument of the C++ operators. 
	*/ 
	public Rational add(Rational rhs)
	{
		numerator = (numerator * rhs.denominator) + (denominator * rhs.numerator);
		denominator = (denominator * rhs.denominator);
		reduce();
		return this;
	}
	public Rational sub(Rational rhs)
	{
		numerator = (numerator * rhs.denominator) - (denominator * rhs.numerator);
		denominator = (denominator * rhs.denominator);
		normalize();
		return this;
	}
	public Rational mult(Rational rhs)
	{
		numerator = (numerator * rhs.numerator);
		denominator = (denominator * rhs.denominator);
		normalize();
		return this;
	}
	public Rational div(Rational rhs)
	{
		numerator = (numerator * rhs.denominator);
		denominator = (denominator * rhs.numerator);
		normalize();
		return this;
	}
	
	/* 
	 This static method and the next three static methods should 
	 create a new Rational object that is bound appropriately to
	 the result of operating on two Rational objects. These methods 
	 act like the arithmetic infix operators of C++. 
	*/
	public static Rational add(Rational lhs, Rational rhs)
	{
		Rational result = new Rational(lhs.numerator,lhs.denominator);
		return result.add(rhs);
	}
	public static Rational sub(Rational lhs, Rational rhs)
	{
		Rational result = new Rational(lhs.numerator,lhs.denominator);
		return result.sub(rhs);
	}
	public static Rational mult(Rational lhs, Rational rhs)
	{
		Rational result = new Rational(lhs.numerator, lhs.denominator);
		return result.mult(rhs);
	}
	public static Rational div(Rational lhs, Rational rhs)
	{
		Rational result = new Rational(lhs.numerator, lhs.denominator);
		return result.div(rhs);
	}
	
	/*
	 This method compares the this object to another rational object to
	 determine whether or not they have equal values.
	*/
	public boolean equals(Rational rhs)
	{
		return ((this.numerator == rhs.numerator)&&(this.denominator == rhs.denominator));
	}
	
	/*
	 This method compares the this object to another rational object to
	 determine whether or not the this object is less than the other rational object.
	*/
	public boolean less(Rational rhs)
	{
		return (this.numerator * rhs.denominator) < (this.denominator * rhs.numerator);
	}
	
	/*
	 This method compares the this object to another rational object to
	 determine whether or not the this object is greater than the other rational object.
	*/
	public boolean greater(Rational rhs)
	{
		return (this.numerator * rhs.denominator) > (this.denominator * rhs.numerator);
	}
	
	/* 
	 compareTo method functionality =
	 returns 1 if this object is > than rhs
	 return -1 if this object is < than rhs
	 return 0 if this object is == to rhs 
	*/
	public int compareTo(Rational rhs)
	{
		if(greater(rhs))
			return 1;
		else if(less(rhs))
			return -1;
		else
			return 0;
	}
	
	/* 
	 Use the following notation for converting Rational objects to String objects:
	 1. For Rational objects of the form, a/b, where a != 0 and b > 0, the corresponding String object 
	    representation must be as a String “a/b” where a and b are the string representations of the int 
	    values of a and b, respectively. Note that a maybe negative and the usual string representation of 
	    negative integer values holds.
	 2. For Rational objects of the form, a/b, where b = 1 must be represented as a String “a” where a is 
	    the string representation of the integer value of a. 
	*/
	public String toString()
	{
		String rtnl_str="";
		
		if(denominator != 0)
		{
			if(denominator == 1)
				rtnl_str = Long.toString(numerator);
			else if(numerator == 0)
				rtnl_str = Long.toString(numerator);
			else
				rtnl_str = Long.toString(numerator) + '/' + Long.toString(denominator);
		}
		else
		{
			rtnl_str = "Undefined";
		}
		return rtnl_str;
	}
	
	/* 
	 convert this Rational object to a 
	 double and convert to int using 
	 (int) cast 
	*/
	public int intValue()
	{
		return (int)doubleValue();
	}
	
	/* 
	 convert this Rational object to a 
	 double and convert to long using 
	 (long) cast 
	*/
	public long longValue()
	{
		return (long)doubleValue();
	}
	
	/* 
	 convert this Rational object to a 
	 double and convert to float using 
	 (float) cast 
	*/
	public float floatValue()
	{
		return (float)doubleValue();
	}
	
	/* 
	 convert this Rational object to double by 
	 operating on numerator and denominator 
	*/
	public double doubleValue()
	{
		return (1.0 * numerator) / denominator;
	}
	
	/* 
	 Move the negative sign if necessary to the numerator and 
	 reduce to lowest terms. This method relies
	 on fixsigns() and reduce(). 
	*/
	private void normalize()
	{
		fixsigns();
		reduce();
	}
	
	/*
	 If the denominator is less than zero,
	 the fixsigns function fixes the sign
	 of both the numerator and denominator
	 of the this object to put it into
	 normalized form.
	 */
	private void fixsigns()
	{
		if(denominator < 0)
		{
			numerator *= -1;
			denominator *= -1;
		}
	}
	
	/*
	 Calls the gcd function to get the greatest common divisor
	 of both the numerator and denominator of the this object
	 and divides both values by that divisor in order to get
	 the number into simplest form.
	 */
	private void reduce()
	{
		long divisor = gcd(Math.abs(this.numerator),this.denominator);
		this.numerator = this.numerator / divisor;
		this.denominator = this.denominator / divisor;
	}
	
	/*
	 Determines the greatest common divisor of two values.
	 */
	private long gcd(long m, long n)
	{
		if(n==0)
			return m;
		else
			return gcd(n,m%n);
	}
	
	private long numerator;
	private long denominator;
}
