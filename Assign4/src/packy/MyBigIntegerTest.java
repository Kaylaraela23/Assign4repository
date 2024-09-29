package packy;

public class MyBigIntegerTest {
	public static void main(String[] args) {
		// Create two large BigIntegers
		MyBigInteger num1 = new MyBigInteger("987654321987654321987654321");
		MyBigInteger num2 = new MyBigInteger("123456789123456789123456789");

		// Test add method
		MyBigInteger sum = num1.add(num2);
		System.out.println("Sum: " + sum); // Should output the sum of num1 and num2

		// Test mod method
		MyBigInteger modResult = num1.mod(num2);
		System.out.println("Modulus: " + modResult); // Should output num1 % num2

		// Test mod by zero (should throw ArithmeticException)
		try {
			MyBigInteger zero = new MyBigInteger("0");
			num1.mod(zero); // This should throw an exception
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // Expected: Division by zero is not allowed
		}
	}
}
