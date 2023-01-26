package cs18200;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.Entry;
import uk.ac.rhul.cs2800.Stack;
import uk.ac.rhul.cs2800.Symbol;

class TestStack {
  
  @Test //Test 1
  void testSize() {//.size() method is created to return the attribute size of ArrayList
    Stack stack_test = new Stack();
    assertEquals(stack_test.size(), 0, "Test a Stack to make sure it has an initial size 0");
    
    
  }

  @Test //Test 2
  void testPush() {//A method which takes in an Entry is created. The in-build add method for ArrayLists are used to add this Entry to the ArrayList  
    Stack stack_test = new Stack();
    Entry number_test_entry = new Entry(1);
    stack_test.push(number_test_entry);
    assertEquals(stack_test.size(), 1, "Test that push will increase the number of Entries within "
        + "the Stack.");
  }
  
  @Test //Test 3
  void testMultiplePush() {//Multiple Entries are passed into the push method, and its size is returned to check that the entries have been added to the ArrayList
    Stack stack_test = new Stack();
    Entry number_test_entry = new Entry(1);
    Entry symbol_test_entry = new Entry(Symbol.PLUS);
    stack_test.push(number_test_entry);
    stack_test.push(symbol_test_entry);
    assertEquals(stack_test.size(), 2, "Tests that multiple Entries can be pushed into the stack");
  }
  
  
  @Test //Test 4
  void testPop() {//To pass this test, a method which uses the in-built .remove() method to take away the last added item on the stack and return it must be created
    Stack stack_test = new Stack();
    Entry number_test_entry = new Entry(1);
    stack_test.push(number_test_entry);
    assertEquals(stack_test.pop(), number_test_entry, "Test that pop will remove the Entry from "
        + "the top of the Stack");
    
  }
  
  @Test //Test 5
  void testEmptyPop() {//to Pass this test, create a new stack and try to pop something before any items are pushed in
    Stack stack_test = new Stack(); 
    assertThrows(EmptyStackException.class, () -> stack_test.pop(), "Test that pop will send an "
        + "exception if you try to remove an Entry from the top of an empty stack" );
 
  }

  
  @Test //Test 6
  void pushThenPop() {//to pass this test, an Entry needs to be passed in to be pushed and then immediately popped out. The size should be tested to see if it is 0
    Stack stack_test = new Stack();
    Entry number_test_entry2 = new Entry(2);
    stack_test.push(number_test_entry2);
    stack_test.pop();
    assertEquals(stack_test.size(), 0, "Tests that an Entry can be pushed then popped without "
        + "issue");
    
  }
  
  @Test //Test 7
  void testTop() throws BadTypeException {//to pass this test, an two Entries needs to be pushed into the stack. The back of the ArrayList should be passed at the top in order for it to pass
    Stack stack_test = new Stack();
    Entry symbol_test_entry2 = new Entry(Symbol.MINUS);
    stack_test.push(symbol_test_entry2);
    assertEquals(stack_test.top().getSymbol(), Symbol.MINUS, "Tests that the top of the stack is "
        + "the last Entry to be pushed.");
  }

}
