package One;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class errorCheckTest {
	errorCheck obj = new errorCheck();

	@Test
	void test1() {
		assertEquals("Positive", obj.checkNumber(50));
		System.out.println("Positive");
	}

	@Test
	void test2() {
		assertEquals("Negative", obj.checkNumber(-100));
		System.out.println("Negative");
	}

	@Test
	void test3() {
		assertEquals("Zero", obj.checkNumber(0));
		System.out.println("Zeros");
	}

	@Test
	void test4() {
		assertEquals("Positive", obj.checkNumber(250));
		System.out.println("Positive");
	}

}
