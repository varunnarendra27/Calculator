package cs18200;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.Entry;
import uk.ac.rhul.cs2800.NumStack;
import uk.ac.rhul.cs2800.OpStack;
import uk.ac.rhul.cs2800.Symbol;

class TestOpStack {

	
	OpStack op_stack_test;
	@BeforeEach
	public void setup(){
	    op_stack_test = new OpStack();
	}
	

	@Test
	void testPush() {
	    
		op_stack_test.push(Symbol.PLUS);
		assertEquals(op_stack_test.isEmpty(), false, "Tests to see if Stack is no longer empty after pushing an item");
		
	}

	@Test
	void testPop() throws EmptyStackException, BadTypeException {
		op_stack_test.push(Symbol.PLUS);
		assertEquals(op_stack_test.pop(), Symbol.PLUS, "Tests to see if Stack can pop an element");
		
	}

	@Test
	void testIsEmpty() throws EmptyStackException, BadTypeException {
		op_stack_test.push(Symbol.PLUS);
		op_stack_test.push(Symbol.MINUS);
		op_stack_test.pop();
		op_stack_test.pop();
		assertEquals(op_stack_test.isEmpty(), true, "Tests to see if Stack is no longer empty after pushing an item");
		
	}

}
