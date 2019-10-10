package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void test() {
		AddingMachine test1 = new AddingMachine();
		test1.add(5);
		test1.subtract(3);
		test1.add(2);
		assertEquals(test1.getTotal(), 4);
	}
	
	@Test
	void test1() {
		AddingMachine test1 = new AddingMachine();
		test1.add(5);
		test1.subtract(3);
		test1.add(2);
		assertEquals(test1.toString(), "0 + 5 - 3 + 2");
	}

}
