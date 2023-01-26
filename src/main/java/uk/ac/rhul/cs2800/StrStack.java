package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author varunnarendra
 * 
 *         This class creates a stack used to hold numbers inputed by the user.
 *
 */
public class StrStack {

  private Stack strStack;

  /**
   * Default constructor to create a new StrStack object.
   */
  public StrStack() {
    this.strStack = new Stack();

  }

  /**
   * A push method used to add a new operation of type String into the StrStack.
   * 
   * @param push_operation Takes in a specific String that needs to be added to StrStack.
   */
  public void push(String push_operation) {
    strStack.push(new Entry(push_operation));
  }

  /**
   * Removes the String at the top of the StrStack object.
   * 
   * @return Returns String at the top of the StrStack object.
   * 
   * @throws BadTypeException Throws BadTypeException indicating wrong String being used.
   * @throws EmptyStackException Throws EmptyStackException if StrStack is empty so there is nothing
   *         that can be returned.
   */
  public String pop() throws BadTypeException, EmptyStackException {
    return strStack.pop().getString();

  }

  /**
   * Method to check if the StrStack is empty
   * 
   * @return Returns boolean indicating true if it is empty and false if it is not.
   */
  public boolean isEmpty() {

    if (strStack.getSize() == 0) {
      return true;
    } else {
      return false;
    }

  }

}
