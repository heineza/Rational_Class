// Zach Heine
// September 20th, 2016
// CS 419
// Rational JUnitTest Class
// This file runs tests on each method of the Rational Class
// With the exception of two methods(testRational and 
// testRationalLong, each method runs four test cases on the 
// particular Rational class method.

package rational;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalJUnitTest {

	@Test
	public void testRational() {
		// Default Constructor Test Case
		
		Rational r1 = new Rational();
		assertEquals("Failed Test", 0, r1.getNumerator());
		assertEquals("Failed Test", 1, r1.getDenominator());
		System.out.println("Zero-arg constructor test r1 = " + r1);
	}

	@Test
	public void testRationalLong() {
		/*
		 One-Arg Constructor Test Cases:
		 Positive Numerator
		 Negative Numerator
		 Zero Numerator
		*/
		
		Rational r2 = new Rational(3);
		assertEquals("Failed Test", 3, r2.getNumerator());
		assertEquals("Failed Test", 1, r2.getDenominator());
		System.out.println("One-arg constructor test r2 = " + r2);
		
		Rational r3 = new Rational(-3);
		assertEquals("Failed Test", -3, r3.getNumerator());
		assertEquals("Failed Test", 1, r3.getDenominator());
		System.out.println("One-arg constructor test r3 = " + r3);
		
		Rational r4 = new Rational(0);
		assertEquals("Failed Test", 0, r4.getNumerator());
		assertEquals("Failed Test", 1, r4.getDenominator());
		System.out.println("One-arg constructor test r4 = " + r4);
	}

	@Test
	public void testRationalLongLong() {
		/*
		 Two-Arg Constructor Test Cases:
		 Different Valued Numerator and Denominator
		 Zero Numerator
		 Negative Rational Number
		 Same Valued Numerator and Denominator
		*/
		Rational r5 = new Rational(2,4);
		assertEquals("Failed Test", 1, r5.getNumerator());
		assertEquals("Failed Test", 2, r5.getDenominator());
		System.out.println("Two-arg constructor test r5 = " + r5);
		
		Rational r6 = new Rational(0,1);
		assertEquals("Failed Test", 0, r6.getNumerator());
		assertEquals("Failed Test", 1, r6.getDenominator());
		System.out.println("Two-arg constructor test r6 = " + r6);
		
		Rational r7 = new Rational(-4,6);
		assertEquals("Failed Test", -2, r7.getNumerator());
		assertEquals("Failed Test", 3, r7.getDenominator());
		System.out.println("Two-arg constructor test r7 = " + r7);
		
		Rational r8 = new Rational(4,4);
		assertEquals("Failed Test", 1, r8.getNumerator());
		assertEquals("Failed Test", 1, r8.getDenominator());
		System.out.println("Two-arg constructor test r8 = " + r8);
	}

	@Test
	public void testAddRational() {
		/*
		 Unary Add Test Cases:
		 Adds up to one
		 Adds down to zero
		 Adds up to a negative
		 Adds down to a negative		 
		*/
				
		Rational r9 = new Rational(1,4);
		Rational r10 = new Rational(3,4);
		r9.add(r10);
		assertEquals("Failed Test", 1, r9.getNumerator());
		assertEquals("Failed Test", 1, r9.getDenominator());
		System.out.println("Unary add operator test r9 += r10 = " + r9);
		
		Rational r11 = new Rational(-2,4);
		Rational r12 = new Rational(2,4);
		r11.add(r12);
		assertEquals("Failed Test", 0, r11.getNumerator());
		assertEquals("Failed Test", 1, r11.getDenominator());
		System.out.println("Unary add operator test r11 += r12 = " + r11);
		
		Rational r13 = new Rational(-2,4);
		Rational r14 = new Rational(1,4);
		r13.add(r14);
		assertEquals("Failed Test", -1, r13.getNumerator());
		assertEquals("Failed Test", 4, r13.getDenominator());
		System.out.println("Unary add operator test r13 += r14 = " + r13);
		
		Rational r15 = new Rational(1,4);
		Rational r16 = new Rational(-4,4);
		r15.add(r16);
		assertEquals("Failed Test", -3, r15.getNumerator());
		assertEquals("Failed Test", 4, r15.getDenominator());
		System.out.println("Unary add operator test r15 += r16 = " + r15);
	}

	@Test
	public void testSubRational() {
		/*
		 Unary Subtract Test Cases:
		 Subtract a positive from a positive
		 Subtract a negative from a positive
		 Subtract a positive from a negative
		 Subtract a negative from a negative
		*/
		
		Rational r17 = new Rational(5,6);
		Rational r18 = new Rational(1,6);
		r17.sub(r18);
		assertEquals("Failed Test", 2, r17.getNumerator());
		assertEquals("Failed Test", 3, r17.getDenominator());
		System.out.println("Unary subtract operator test r17 -= r18 = " + r17);
		
		Rational r19 = new Rational(2,3);
		Rational r20 = new Rational(-1,3);
		r19.sub(r20);
		assertEquals("Failed Test", 1, r19.getNumerator());
		assertEquals("Failed Test", 1, r19.getDenominator());
		System.out.println("Unary subtract operator test r19 -= r20 = " + r19);
		
		Rational r21 = new Rational(-1,4);
		Rational r22 = new Rational(3,4);
		r21.sub(r22);
		assertEquals("Failed Test", -1, r21.getNumerator());
		assertEquals("Failed Test", 1, r21.getDenominator());
		System.out.println("Unary subtract operator test r21 -= r22 = " + r21);
		
		Rational r23 = new Rational(-5,4);
		Rational r24 = new Rational(-3,4);
		r23.sub(r24);
		assertEquals("Failed Test", -1, r23.getNumerator());
		assertEquals("Failed Test", 2, r23.getDenominator());
		System.out.println("Unary subtract operator test r23 -= r24 = " + r23);
	}

	@Test
	public void testMultRational() {
		/*
		 Unary Multiplication Test Cases:
		 Multiply a positive by a positive
		 Multiply a negative by a positive
		 Multiply a negative by a negative
		 Multiply a positive by zero
		*/
		
		Rational r25 = new Rational(1,2);
		Rational r26 = new Rational(1,3);
		r25.mult(r26);
		assertEquals("Failed Test", 1, r25.getNumerator());
		assertEquals("Failed Test", 6, r25.getDenominator());
		System.out.println("Unary multiply operator test r25 *= r26 = " + r25);
		
		Rational r27 = new Rational(2,3);
		Rational r28 = new Rational(-4,5);
		r27.mult(r28);
		assertEquals("Failed Test", -8, r27.getNumerator());
		assertEquals("Failed Test", 15, r27.getDenominator());
		System.out.println("Unary multiply operator test r27 *= r28 = " + r27);
		
		Rational r29 = new Rational(-2,5);
		Rational r30 = new Rational(-5,6);
		r29.mult(r30);
		assertEquals("Failed Test", 1, r29.getNumerator());
		assertEquals("Failed Test", 3, r29.getDenominator());
		System.out.println("Unary multiply operator test r29 *= r30 = " + r29);
		
		Rational r31 = new Rational(11,15);
		Rational r32 = new Rational(0,1);
		r31.mult(r32);
		assertEquals("Failed Test", 0, r31.getNumerator());
		assertEquals("Failed Test", 1, r31.getDenominator());
		System.out.println("Unary multiply operator test r31 *= r32 = " + r31);
	}
	
	@Test
	public void testDivRational() {
		/*
		 Unary Division Test Cases:
		 Divide a positive by a positive
		 Divide a positive by a negative
		 Divide a negative by a negative
		 Divide a negative by one
		*/
		
		Rational r33 = new Rational(3,4);
		Rational r34 = new Rational(1,2);
		r33.div(r34);
		assertEquals("Failed Test", 3, r33.getNumerator());
		assertEquals("Failed Test", 2, r33.getDenominator());
		System.out.println("Unary divide operator test r33 /= r34 = " + r33);
		
		Rational r35 = new Rational(5,8);
		Rational r36 = new Rational(-3,4);
		r35.div(r36);
		assertEquals("Failed Test", -5, r35.getNumerator());
		assertEquals("Failed Test", 6, r35.getDenominator());
		System.out.println("Unary divide operator test r35 /= r36 = " + r35);
		
		Rational r37 = new Rational(-5,6);
		Rational r38 = new Rational(-2,3);
		r37.div(r38);
		assertEquals("Failed Test", 5, r37.getNumerator());
		assertEquals("Failed Test", 4, r37.getDenominator());
		System.out.println("Unary divide operator test r37 /= r38 = " + r37);
		
		Rational r39 = new Rational(-4,5);
		Rational r40 = new Rational(3,3);
		r39.div(r40);
		assertEquals("Failed Test", -4, r39.getNumerator());
		assertEquals("Failed Test", 5, r39.getDenominator());
		System.out.println("Unary divide operator test r39 /= r40 = " + r39);
	}

	@Test
	public void testAddRationalRational() {
		/*
		 Binary Add Test Cases:
		 Adds up to one
		 Adds down to zero
		 Adds up to a negative
		 Adds down to a negative		 
		*/
		
		Rational testResult;
		
		Rational r41 = new Rational(1,4);
		Rational r42 = new Rational(3,4);
		testResult = Rational.add(r41,r42);
		assertEquals("Failed Test", 1, testResult.getNumerator());
		assertEquals("Failed Test", 1, testResult.getDenominator());
		System.out.println("Binary add operator test--testResult = r41 + r42 = " + testResult);
		
		Rational r43 = new Rational(-2,4);
		Rational r44 = new Rational(2,4);
		testResult = Rational.add(r43,r44);
		assertEquals("Failed Test", 0, testResult.getNumerator());
		assertEquals("Failed Test", 1, testResult.getDenominator());
		System.out.println("Binary add operator test--testResult = r43 + r44 = " + testResult);
		
		Rational r45 = new Rational(-2,4);
		Rational r46 = new Rational(1,4);
		testResult = Rational.add(r45,r46);
		assertEquals("Failed Test", -1, testResult.getNumerator());
		assertEquals("Failed Test", 4, testResult.getDenominator());
		System.out.println("Binary add operator test--testResult = r45 + r46 = " + testResult);
		
		Rational r47 = new Rational(1,4);
		Rational r48 = new Rational(-4,4);
		testResult = Rational.add(r47,r48);
		assertEquals("Failed Test", -3, testResult.getNumerator());
		assertEquals("Failed Test", 4, testResult.getDenominator());
		System.out.println("Binary add operator test--testResult = r47 + r48 = " + testResult);
	}

	@Test
	public void testSubRationalRational() {
		/*
		 Binary Subtract Test Cases:
		 Subtract a positive from a positive
		 Subtract a negative from a positive
		 Subtract a positive from a negative
		 Subtract a negative from a negative
		*/
		
		Rational testResult;
		
		Rational r49 = new Rational(5,6);
		Rational r50 = new Rational(1,6);
		testResult = Rational.sub(r49,r50);
		assertEquals("Failed Test", 2, testResult.getNumerator());
		assertEquals("Failed Test", 3, testResult.getDenominator());
		System.out.println("Binary subtract operator test--testResult = r49 - r50 = " + testResult);
		
		Rational r51 = new Rational(2,3);
		Rational r52 = new Rational(-1,3);
		testResult = Rational.sub(r51,r52);
		assertEquals("Failed Test", 1, testResult.getNumerator());
		assertEquals("Failed Test", 1, testResult.getDenominator());
		System.out.println("Binary subtract operator test--testResult = r51 - r52 = " + testResult);
		
		Rational r53 = new Rational(-1,4);
		Rational r54 = new Rational(3,4);
		testResult = Rational.sub(r53, r54);
		assertEquals("Failed Test", -1, testResult.getNumerator());
		assertEquals("Failed Test", 1, testResult.getDenominator());
		System.out.println("Binary subtract operator test--testResult = r53 - r54 = " + testResult);
		
		Rational r55 = new Rational(-5,4);
		Rational r56 = new Rational(-3,4);
		testResult = Rational.sub(r55, r56);
		assertEquals("Failed Test", -1, testResult.getNumerator());
		assertEquals("Failed Test", 2, testResult.getDenominator());
		System.out.println("Binary subtract operator test--testResult = r55 - r56 = " + testResult);
	}

	@Test
	public void testMultRationalRational() {
		/*
		 Binary Multiplication Test Cases:
		 Multiply a positive by a positive
		 Multiply a negative by a positive
		 Multiply a negative by a negative
		 Multiply a positive by zero
		*/
		
		Rational testResult;
		
		Rational r57 = new Rational(1,2);
		Rational r58 = new Rational(1,3);
		testResult = Rational.mult(r57, r58);
		assertEquals("Failed Test", 1, testResult.getNumerator());
		assertEquals("Failed Test", 6, testResult.getDenominator());
		System.out.println("Binary multiply operator test--testResult = r57 * r58 = " + testResult);
		
		Rational r59 = new Rational(2,3);
		Rational r60 = new Rational(-4,5);
		testResult = Rational.mult(r59,r60);
		assertEquals("Failed Test", -8, testResult.getNumerator());
		assertEquals("Failed Test", 15, testResult.getDenominator());
		System.out.println("Binary multiply operator test--testResult = r59 * r60 = " + testResult);
		
		Rational r61 = new Rational(-2,5);
		Rational r62 = new Rational(-5,6);
		testResult = Rational.mult(r61,r62);
		assertEquals("Failed Test", 1, testResult.getNumerator());
		assertEquals("Failed Test", 3, testResult.getDenominator());
		System.out.println("Binary multiply operator test--testResult = r61 * r62 = " + testResult);
		
		Rational r63 = new Rational(11,15);
		Rational r64 = new Rational(0,1);
		testResult = Rational.mult(r63,r64);
		assertEquals("Failed Test", 0, testResult.getNumerator());
		assertEquals("Failed Test", 1, testResult.getDenominator());
		System.out.println("Binary multiply operator test--testResult = r63 * r64 = " + testResult);
	}

	@Test
	public void testDivRationalRational() {
		/*
		 Binary Division Test Cases:
		 Divide a positive by a positive
		 Divide a positive by a negative
		 Divide a negative by a negative
		 Divide a negative by one
		*/
		
		Rational testResult;
		
		Rational r65 = new Rational(3,4);
		Rational r66 = new Rational(1,2);
		testResult = Rational.div(r65,r66);
		assertEquals("Failed Test", 3, testResult.getNumerator());
		assertEquals("Failed Test", 2, testResult.getDenominator());
		System.out.println("Binary divide operator test--testResult = r65 / r66 = " + testResult);
		
		Rational r67 = new Rational(5,8);
		Rational r68 = new Rational(-3,4);
		testResult = Rational.div(r67, r68);
		assertEquals("Failed Test", -5, testResult.getNumerator());
		assertEquals("Failed Test", 6, testResult.getDenominator());
		System.out.println("Binary divide operator test--testResult = r67 / r68 = " + testResult);
		
		Rational r69 = new Rational(-5,6);
		Rational r70 = new Rational(-2,3);
		testResult = Rational.div(r69, r70);
		assertEquals("Failed Test", 5, testResult.getNumerator());
		assertEquals("Failed Test", 4, testResult.getDenominator());
		System.out.println("Binary divide operator test--testResult = r69 / r70 = " + testResult);
		
		Rational r71 = new Rational(-4,5);
		Rational r72 = new Rational(3,3);
		testResult = Rational.div(r71, r72);
		assertEquals("Failed Test", -4, testResult.getNumerator());
		assertEquals("Failed Test", 5, testResult.getDenominator());
		System.out.println("Binary divide operator test--testResult = r71 / r72 = " + testResult);
	}
	
	@Test
	public void testMultipleOps() {
		/*
		 Multiple Operations Test Test Cases
		 	-Adding a negative rational to the 
		 	 result of the multiplication of two
		 	 positive rational numbers.
		 	 
		 	-Subtracting a negative rational from the 
		 	 result of the division of two
		 	 positive rational numbers.
		 	 
		 	-Adding a positive rational to the 
		 	 result of the multiplication of a
		 	 negative rational and the result of
		 	 subtracting a positive rational from
		 	 the result of dividing a negative 
		 	 rational from a positive rational number.
		 */
		
		Rational testVal;
		
		
		Rational mltpl_r1 = new Rational(3,-4);
		Rational mltpl_r2 = new Rational(2,5);
		Rational mltpl_r3 = new Rational(5,6);
		testVal = Rational.add(mltpl_r1, Rational.mult(mltpl_r2, mltpl_r3));
		assertEquals("Failed Test", -5, testVal.getNumerator());
		assertEquals("Failed Test", 12, testVal.getDenominator());
		System.out.println("MultipleOps Test - Case (-3/4) + ((2/5)*(5/6)) = " + testVal);
		
		Rational mltpl_r4 = new Rational(3,-4);
		Rational mltpl_r5 = new Rational(2,5);
		Rational mltpl_r6 = new Rational(5,6);
		testVal = Rational.sub(mltpl_r4, Rational.div(mltpl_r5, mltpl_r6));
		assertEquals("Failed Test", -123, testVal.getNumerator());
		assertEquals("Failed Test", 100, testVal.getDenominator());
		System.out.println("MultipleOps Test - Case (-3/4) - ((2/5)/(5/6)) = " + testVal);
		
		Rational mltpl_r7 = new Rational(1,2);
		Rational mltpl_r8 = new Rational(3,-4);
		Rational mltpl_r9 = new Rational(5,6);
		Rational mltpl_r10 = new Rational(-7,8);
		testVal = Rational.add(mltpl_r7, Rational.mult(mltpl_r8, Rational.sub(mltpl_r9, Rational.div(mltpl_r10, mltpl_r7))));
		assertEquals("Failed Test", -23, testVal.getNumerator());
		assertEquals("Failed Test", 16, testVal.getDenominator());
		System.out.println("MultipleOps Test - Case (1/2)+((-3/4)*((5/6)-((-7/8)/(1/2)))) = " + testVal);
	}
	
	@Test
	public void testEqualsRational() {
		/*
		 Boolean Equals Operator Test Cases:
		 Same Value Comparison
		 Different Value Comparison
		 Negative Same Value Comparison
		 Negative Different Value Comparison 
		*/
		
		boolean testVal;
		
		Rational bool_r1=new Rational(1,2);
		Rational bool_r2=new Rational(2,4);
		testVal = bool_r1.equals(bool_r2);
		assertTrue("Failed Test", testVal);
		System.out.println("Boolean Equals Both Values Equal Result: " + testVal);
		
		Rational bool_r3=new Rational(1,2);
		Rational bool_r4=new Rational(3,4);
		testVal = bool_r3.equals(bool_r4);
		assertFalse("Failed Test", testVal);
		System.out.println("Boolean Equals Values Not Equal Result: " + testVal);
		
		Rational bool_r5=new Rational(-1,2);
		Rational bool_r6=new Rational(-2,4);
		testVal = bool_r5.equals(bool_r6);
		assertTrue("Failed Test", testVal);
		System.out.println("Boolean Equals Negative Both Values Equal Result: " + testVal);

		
		Rational bool_r7=new Rational(-1,2);
		Rational bool_r8=new Rational(-3,4);
		testVal = bool_r7.equals(bool_r8);
		assertFalse("Failed Test", testVal);
		System.out.println("Boolean Equals Negative Values Not Equal Result: " + testVal);
	}

	@Test
	public void testLess() {
		/*
		 Boolean Less Than Operator Test Cases:
		 First Value Less Than Comparison
		 First Value Greater Than Comparison
		 Negative First Value Less Than Comparison
		 Negative First Value Greater Than Comparison 
		*/
		
		boolean testVal;
		
		Rational bool_r9=new Rational(1,4);
		Rational bool_r10=new Rational(2,4);
		testVal = bool_r9.less(bool_r10);
		assertTrue("Failed Test", testVal);
		System.out.println("Boolean Less First Value Less Result: " + testVal);
		
		Rational bool_r11=new Rational(3,8);
		Rational bool_r12=new Rational(1,8);
		testVal = bool_r11.less(bool_r12);
		assertFalse("Failed Test", testVal);
		System.out.println("Boolean Less First Value Greater Result: " + testVal);
		
		Rational bool_r13=new Rational(-3,4);
		Rational bool_r14=new Rational(-1,2);
		testVal = bool_r13.less(bool_r14);
		assertTrue("Failed Test", testVal);
		System.out.println("Boolean Less Negative First Value Less Result: " + testVal);
		
		Rational bool_r15=new Rational(-1,8);
		Rational bool_r16=new Rational(-5,8);
		testVal = bool_r15.less(bool_r16);
		assertFalse("Failed Test", testVal);
		System.out.println("Boolean Less Negative First Value Greater Result: " + testVal);
	}

	@Test
	public void testGreater() {
		/*
		 Boolean Greater Than Operator Test Cases:
		 First Value Greater Than Comparison
		 First Value Less Than Comparison
		 Negative First Value Greater Than Comparison
		 Negative First Value Less Than Comparison 
		*/
		
		boolean testVal;
		
		Rational bool_r17=new Rational(3,4);
		Rational bool_r18=new Rational(1,4);
		testVal = bool_r17.greater(bool_r18);
		assertTrue("Failed Test", testVal);
		System.out.println("Boolean Greater First Value Greater Result: " + testVal);
		
		Rational bool_r19=new Rational(1,8);
		Rational bool_r20=new Rational(3,8);
		testVal = bool_r19.greater(bool_r20);
		assertFalse("Failed Test", testVal);
		System.out.println("Boolean Greater First Value Less Result: " + testVal);
		
		Rational bool_r21=new Rational(-1,2);
		Rational bool_r22=new Rational(-3,4);
		testVal = bool_r21.greater(bool_r22);
		assertTrue("Failed Test", testVal);
		System.out.println("Boolean Greater Negative First Value Greater Result: " + testVal);
		
		Rational bool_r23=new Rational(-5,8);
		Rational bool_r24=new Rational(-1,8);
		testVal = bool_r23.greater(bool_r24);
		assertFalse("Failed Test", testVal);
		System.out.println("Boolean Greater Negative First Value Less Result: " + testVal);
	}

	@Test
	public void testCompareTo() {
		/*
		 compareTo Function Test Cases:
		 lhs is greater than rhs
		 lhs is less than rhs
		 lhs is equal to rhs
		 negative lhs is equal to negative rhs
		*/
		int testVal;
		
		Rational cmp_r1 = new Rational(5,8);
		Rational cmp_r2 = new Rational(2,4);
		testVal = cmp_r1.compareTo(cmp_r2);
		assertEquals("Failed Test", 1, testVal);
		System.out.println("compareTo lhs greater than rhs result: " + testVal);
		
		Rational cmp_r3 = new Rational(5,8);
		Rational cmp_r4 = new Rational(3,4);
		testVal = cmp_r3.compareTo(cmp_r4);
		assertEquals("Failed Test", -1, testVal);
		System.out.println("compareTo lhs less than rhs result: " + testVal);
		
		Rational cmp_r5 = new Rational(3,6);
		Rational cmp_r6 = new Rational(4,8);
		testVal = cmp_r5.compareTo(cmp_r6);
		assertEquals("Failed Test", 0, testVal);
		System.out.println("compareTo lhs equal to rhs result: " + testVal);
		
		Rational cmp_r7 = new Rational(-8,16);
		Rational cmp_r8 = new Rational(-4, 8);
		testVal = cmp_r7.compareTo(cmp_r8);
		assertEquals("Failed Test: ", 0, testVal);
		System.out.println("compareTo negative lhs equal to negative rhs result: " + testVal);
	}

	@Test
	public void testToString() {
		/*
		 To String Method Test Cases:
		 Rational Number is One
		 Numerator is Zero
		 Normal Value
		 Negative Value
		 */
		String testVal = "";
		
		Rational str_r1 = new Rational(5,5);
		testVal = str_r1.toString();
		assertEquals("Failed Test", "1", testVal);
		System.out.println("toString Value is One Test Result: " + testVal);
		
		Rational str_r2 = new Rational(0,2);
		testVal = str_r2.toString();
		assertEquals("Failed Test", "0", testVal);
		System.out.println("toString Value is Zero Test Result: " + testVal);
		
		Rational str_r3 = new Rational(3,4);
		testVal = str_r3.toString();
		assertEquals("Failed Test", "3/4", testVal);
		System.out.println("toString Normal Value Test Result: " + testVal);
		
		Rational str_r4 = new Rational(-2,4);
		testVal = str_r4.toString();
		assertEquals("Failed Test", "-1/2", testVal);
		System.out.println("toString Negative Value Test Result: " + testVal);
	}

	@Test
	public void testIntValue() {
		/*
		 Int Value Test Cases:
		 Positive Value
		 Zero Numerator
		 One 
		 Negative Value
		 */
		
		int testVal;
		
		Rational int_r1 = new Rational(9,4);
		testVal = int_r1.intValue();
		assertEquals("Failed Test", 2, testVal);
		System.out.println("Int Value Positive Test Result: " + testVal);
		
		Rational int_r2 = new Rational(0,5);
		testVal = int_r2.intValue();
		assertEquals("Failed Test", 0, testVal);
		System.out.println("Int Value Zero Test Result: " + testVal);
		
		Rational int_r3 = new Rational(5,5);
		testVal = int_r3.intValue();
		assertEquals("Failed Test", 1, testVal);
		System.out.println("Int Value One Test Result: " + testVal);
		
		Rational int_r4 = new Rational(-9,4);
		testVal = int_r4.intValue();
		assertEquals("Failed Test", -2, testVal);
		System.out.println("Int Value Negative Test Result: " + testVal);
	}

	@Test
	public void testLongValue() {
		/*
		 Long Value Test Cases:
		 Positive Value
		 Zero Numerator
		 One 
		 Negative Value
		*/
		
		long testVal;
		
		Rational long_r1 = new Rational(9,4);
		testVal = long_r1.longValue();
		assertEquals("Failed Test", 2, testVal);
		System.out.println("Long Value Positive Test Result: " + testVal);
		
		Rational long_r2 = new Rational(0,5);
		testVal = long_r2.longValue();
		assertEquals("Failed Test", 0, testVal);
		System.out.println("Long Value Zero Test Result: " + testVal);
		
		Rational long_r3 = new Rational(5,5);
		testVal = long_r3.longValue();
		assertEquals("Failed Test", 1, testVal);
		System.out.println("Long Value One Test Result: " + testVal);
		
		Rational long_r4 = new Rational(-9,4);
		testVal = long_r4.longValue();
		assertEquals("Failed Test", -2, testVal);
		System.out.println("Long Value Negative Test Result: " + testVal);
	}

	@Test
	public void testFloatValue() {
		/*
		 Float Value Test Cases:
		 Positive Value
		 Zero Numerator
		 One 
		 Negative Value
		*/
		
		float testVal;
		
		Rational flt_r1 = new Rational(9,4);
		testVal = flt_r1.floatValue();
		assertEquals("Failed Test", 2.25, testVal, 0.000000000000001);
		System.out.println("Float Value Positive Test Result: " + testVal);
		
		Rational flt_r2 = new Rational(0,5);
		testVal = flt_r2.floatValue();
		assertEquals("Failed Test", 0.0, testVal, 0.000000000000001);
		System.out.println("Float Value Zero Test Result: " + testVal);
		
		Rational flt_r3 = new Rational(5,5);
		testVal = flt_r3.floatValue();
		assertEquals("Failed Test", 1.0, testVal, 0.000000000000001);
		System.out.println("Float Value One Test Result: " + testVal);
		
		Rational flt_r4 = new Rational(-9,4);
		testVal = flt_r4.floatValue();
		assertEquals("Failed Test", -2.25, testVal, 0.000000000000001);
		System.out.println("Float Value Negative Test Result: " + testVal);
	}

	@Test
	public void testDoubleValue() {
		/*
		 Double Value Test Cases:
		 Positive Value
		 Zero Numerator
		 One 
		 Negative Value
		*/
		
		double testVal;
		
		Rational dbl_r1 = new Rational(9,4);
		testVal = dbl_r1.doubleValue();
		assertEquals("Failed Test", 2.25, testVal, 0.000000000000001);
		System.out.println("Double Value Positive Test Result: " + testVal);
		
		Rational dbl_r2 = new Rational(0,5);
		testVal = dbl_r2.doubleValue();
		assertEquals("Failed Test", 0.0, testVal, 0.000000000000001);
		System.out.println("Double Value Zero Test Result: " + testVal);
		
		Rational dbl_r3 = new Rational(5,5);
		testVal = dbl_r3.doubleValue();
		assertEquals("Failed Test", 1.0, testVal, 0.000000000000001);
		System.out.println("Double Value One Test Result: " + testVal);
		
		Rational dbl_r4 = new Rational(-9,4);
		testVal = dbl_r4.doubleValue();
		assertEquals("Failed Test", -2.25, testVal, 0.000000000000001);
		System.out.println("Double Value Negative Test Result: " + testVal);
	}

}
