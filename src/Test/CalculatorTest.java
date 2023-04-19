package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		int output1 = test.add(3, 4);
		assertEquals(7, output1);

		int output2 = test.substraction(4, 2);
		assertEquals(2, output2);

		int output3 = test.multiplication(8, 9);
		assertEquals(72, output3);

		int output4 = test.dividation(50, 5);
		assertEquals(10, output4);
	}
}
