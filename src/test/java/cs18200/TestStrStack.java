package cs18200;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.StrStack;

class TestStrStack {
	
	StrStack strstacktest;
	@BeforeEach
	void setUp() throws Exception {
		strstacktest = new StrStack();
		
	}

	@Test
	void testStrStack() {
		
	}

	@Test
	void testPush() {
		strstacktest.push("test");
		assertEquals(strstacktest.isEmpty(), false, "Tests to see if Stack is no longer empty after pushing an item");
	}

	@Test
	void testPop() throws EmptyStackException, BadTypeException {
		strstacktest.push("test");
		assertEquals(strstacktest.pop(), "test", "Tests to see if Stack no can pop element");
	}

	@Test
	void testIsEmpty() throws EmptyStackException, BadTypeException {
		strstacktest.push("test1");
		strstacktest.push("test2");
		strstacktest.pop();
		strstacktest.pop();
		assertEquals(strstacktest.isEmpty(), true, "Tests to see if Stack is empty after popping an item");
	}

}
