package packy;

import java.math.BigInteger;

public class MyBigInteger {
	private BigInteger value;

	// Constructor to create a MyBigInteger from a string representation.
	// Throws NumberFormatException if the string does not contain a valid number.
	public MyBigInteger(String val) {
		value = new BigInteger(val);
	}

	// Adds the given MyBigInteger to this BigInteger.
	// Returns a new MyBigInteger representing the sum.
	public MyBigInteger add(MyBigInteger other) {
		return new MyBigInteger(this.value.add(other.value).toString());
	}

	// Returns the modulus (non-negative remainder) of this MyBigInteger and the
	// specified divisor.
	// Throws ArithmeticException if the divisor is zero.
	public MyBigInteger mod(MyBigInteger other) {
		if (other.value.equals(BigInteger.ZERO)) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return new MyBigInteger(this.value.mod(other.value).toString());
	}

	// Returns the string representation of this MyBigInteger.
	@Override
	public String toString() {
		return value.toString();
	}
}
