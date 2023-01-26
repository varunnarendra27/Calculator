package cs18200;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.Entry;
import uk.ac.rhul.cs2800.Stack;
import uk.ac.rhul.cs2800.Symbol;
import uk.ac.rhul.cs2800.Type;

class TestEntry {

  @Test //Test 1
  void testEntryFloat() {//To pass this test, an entry of type float must successfully be created
    Stack Entry_stack_test = new Stack();
    Entry number_test_entry = new Entry(1);
    Entry_stack_test.push(number_test_entry);
    assertEquals(Entry_stack_test.size(), 1, "Test that whether an Entry of type Float can "
        + "successfully be instantiated");
  }

  @Test //Test 2
  void testEntrySymbol() {//To pass this test, an entry of type String must successfully be created
    Stack Entry_stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.PLUS);
    Entry_stack_test.push(symbol_test_entry);
    assertEquals(Entry_stack_test.size(), 1, "Test that whether an Entry of type Symbol can "
        + "successfully be instantiated");
  }

  @Test //Test 3
  void testGetType() throws BadTypeException {//To pass this test, the getType method must return the same type as what is being initially passed into the constructor
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.DIVIDE);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getType(), Type.SYMBOL, "Test that whether an Entry of type Symbol can "
        + "successfully be retrieved after being instantiated");
  }
  
  @Test //Test 4
  void testGetSymbolException() throws BadTypeException {//To pass this test, the getType method will throw a BadTypeExpression for not using a Symbol
    Stack stack_test = new Stack();
    Entry number_test_entry = new Entry(100.0f);
    stack_test.push(number_test_entry);
    Entry holder= stack_test.pop();
    assertThrows(BadTypeException.class, () -> holder.getSymbol(), "Test that a BadTypeException "
        + "will be thrown if the argument does not match the constructor");
  }
  
  @Test //Test 5 
  void testGetSymbolPlus() throws BadTypeException {//To pass this test, holder (which holds the return of pop) must match the initial Symbol 'Plus' using getSymbol method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.PLUS);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getSymbol(), Symbol.PLUS, "Test that checks whether an Entry of type "
        + "Symbol PLUS can successfully be retrieved after being instantiated");
    
  }
  
  @Test //Test 6
  void testGetSymbolMnus() throws BadTypeException {//To pass this test, holder (which holds the return of pop) must match the initial Symbol 'Minus' using getSymbol method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.MINUS);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getSymbol(), Symbol.MINUS, "Test that checks whether an Entry of type "
        + "Symbol MINUS can successfully be retrieved after being instantiated");
    
  }
  
  @Test //Test 7
  void testGetSymbolDivide() throws BadTypeException {//To pass this test, holder (which holds the return of pop) must match the initial Symbol 'Divide' using getSymbol method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.DIVIDE);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getSymbol(), Symbol.DIVIDE, "Test that checks whether an Entry of type "
        + "Symbol DIVIDE can successfully be retrieved after being instantiated");
  }
  
  @Test //Test 8
  void testGetSymbolTimes() throws BadTypeException {//To pass this test, holder (which holds the return of pop) must match the initial Symbol 'Times' using getSymbol method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.TIMES);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getSymbol(), Symbol.TIMES, "Test that checks whether an Entry of type "
        + "Symbol TIMES can successfully be retrieved after being instantiated");
    
  }
  
  @Test //Test 9
  void testGetSymbolRightBracket() throws BadTypeException {//To pass this test, holder (which holds the return of pop) must match the initial Symbol 'Right Bracket' using getSymbol method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.RIGHT_BRACKET);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getSymbol(), Symbol.RIGHT_BRACKET, "Test that checks whether an Entry of "
        + "type Symbol RIGHT BRACKET can successfully be retrieved after being instantiated");
    
  }
  
  @Test //Test 10
  void testGetSymbolLeftBracket() throws BadTypeException {//To pass this test, holder (which holds the return of pop) must match the initial Symbol 'Left Bracket' using getSymbol method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.LEFT_BRACKET);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getSymbol(), Symbol.LEFT_BRACKET, "Test that checks whether an Entry of "
        + "type Symbol LEFT BRACKET can successfully be retrieved after being instantiated");
    
  }
  
  @Test //Test 11
  void testGetValueException() throws BadTypeException {//To pass this test, the getValue method will throw a BadTypeExpression for not using the right getter method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.DIVIDE);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertThrows(BadTypeException.class, () -> holder.getValue(), "Test that a BadTypeException "
        + "will be thrown if the argument does not match the constructor");
  }

  @Test //Test 12
  void testGetValue() throws BadTypeException {//To pass this test, holder (which holds the return of pop) must match the initial value using getValue method
    Stack stack_test = new Stack();
    Entry number_test_entry = new Entry(0.134f);
    stack_test.push(number_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getValue(), 0.134f, "Test that checks whether an Entry of type Symbol can "
        + "successfully be instantiated");
    
  }

  @Test //Test 13
  void testGetString() throws BadTypeException {
    Stack stack_test = new Stack();
    Entry string_test_entry = new Entry("test");
    stack_test.push(string_test_entry);
    Entry holder= stack_test.pop();
    assertEquals(holder.getString(), "test", "Test that checks whether an Entry of type String can "
        + "successfully be instantiated");
  }
  
  @Test //Test 14
  void testGetStringException() throws BadTypeException {//To pass this test, the getValue method will throw a BadTypeExpression for not using the right getter method
    Stack stack_test = new Stack();
    Entry symbol_test_entry = new Entry(Symbol.DIVIDE);
    stack_test.push(symbol_test_entry);
    Entry holder= stack_test.pop();
    assertThrows(BadTypeException.class, () -> holder.getString(), "Test that a BadTypeException "
        + "will be thrown if the argument does not match the constructor");
  }
}
