package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author varunnarendra
 *
 *         This class creates a stack used to hold operations inputed by the user.
 */
public class OpStack {
  /**
   * Default Stack object used to create OpStack.
   */
  private Stack opStack;

  /**
   * Default constructor to create a new OpStack object.
   */
  public OpStack() {
    this.opStack = new Stack();

  }

  /**
   * A push method used to add a new operation of type Symbol into the OpStack.
   * 
   * @param push_operation Takes in a specific Symbol that needs to be added to OpStack.
   */
  public void push(Symbol push_operation) {
    opStack.push(new Entry(push_operation));
  }

  /**
   * Removes the Symbol at the top of the OpStack object.
   * 
   * @return Returns Symbol at the top of the OpStack object.
   * 
   * @throws BadTypeException Throws BadTypeException indicating wrong Symbol Type being used.
   * 
   * @throws EmptyStackException Throws EmptyStackException if OpStack is empty so there is nothing.
   *         that can be returned.
   */
  public Symbol pop() throws BadTypeException, EmptyStackException {
    return opStack.pop().getSymbol();

  }

  /**
   * Method to check if the OpStack is empty
   * 
   * @return Returns boolean indicating true if it is empty and false if it is not.
   */
  public boolean isEmpty() {

    if (opStack.getSize() == 0) {
      return true;
    } else {
      return false;
    }

  }

}
