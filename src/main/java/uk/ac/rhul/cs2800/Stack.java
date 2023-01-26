
package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * This program creates a stack and creates push, pop, top and getSize to manipulate the stack.
 * 
 * @author varunnarendra
 */

public class Stack {
  int size = 0;
  List<Entry> entries = new ArrayList<Entry>();

  /**
   * Called to return the size of the Stack.
   * 
   * @return Returns the size of the Stack as an integer.
   */
  public int size() {
    return getSize();
  }

  /**
   * Called to add an Entry to the Stack.
   * 
   * @param e The Entry that needs to be added to the Stack.
   */

  public void push(Entry e) {
    entries.add(getSize(), e);
    size = getSize() + 1;
  }

  /**
   * Called to pop an Entry of the Stack.
   * 
   * @return Returns the Entry that is popped from the Stack.
   */
  public Entry pop() {
    if (getSize() == 0) {
      throw new EmptyStackException();
    }
    Entry entry = entries.get(getSize() - 1);
    this.entries.remove(this.getSize() - 1);
    size = getSize() - 1;
    return entry;
  }

  /**
   * Called to find the Entry at the top of the Stack.
   * 
   * @return Returns the entry at the top of the Stack.
   */
  public Entry top() {

    if (getSize() == 0) {
      throw new EmptyStackException();
    } else {
      return entries.get(getSize() - 1);
    }
  }

  public int getSize() {
    return size;
  }
}
