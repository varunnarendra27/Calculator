package cs18200;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.Entry;
import uk.ac.rhul.cs2800.NumStack;
import uk.ac.rhul.cs2800.Stack;

class TestNumStack {
	
	private NumStack num_stack_test;
	
	@BeforeEach
	public void setup(){
	    num_stack_test = new NumStack();
	}

	@Test
	void testPush() {
	    
		num_stack_test.push(1.0f);
		assertEquals(num_stack_test.isEmpty(), false, "Tests to see if Stack is no longer empty after pushing an item");
		
	}

	@Test
	void testPop() throws EmptyStackException, BadTypeException {
		num_stack_test.push(1.0f);
		assertEquals(num_stack_test.pop(), 1.0f, "Tests to see if Stack no can pop element");
	}

	@Test
	void testIsEmpty() throws EmptyStackException, BadTypeException {
		num_stack_test.push(3.0f);
		num_stack_test.push(4.0f);
		num_stack_test.pop();
		num_stack_test.pop();
		assertEquals(num_stack_test.isEmpty(), true, "Tests to see if Stack is empty after popping an item");
		
	}
}
