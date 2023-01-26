package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author varunnarendra
 *
 */
public class NumStack {
  private Stack numStack;

  /**
   * This class creates a stack used to hold numbers inputed by the user.
   */
  public NumStack() {
    numStack = new Stack();

  }

  /**
   * A push method used to add a new float into the NumStack.
   * 
   * @param push_float Takes in a specific float that needs to be added to NumStack.
   */
  public void push(float push_float) {
    numStack.push(new Entry(push_float));
  }

  /**
   * Removes the float at the top of the StrStack object.
   * 
   * @return Returns float at the top of the StrStack object.
   * @throws BadTypeException Throws BadTypeException indicating wrong Type being used.
   * @throws EmptyStackException EmptyStackException if StrStack is empty so there is nothing.
   *         that can be returned.
   */
  public float pop() throws BadTypeException, EmptyStackException {
    return numStack.pop().getValue();

  }

  /**
   * Method to check if the OpStack is empty
   * 
   * @return Returns boolean indicating true if it is empty and false if it is not.
   */
  public boolean isEmpty() {

    if (numStack.getSize() == 0) {
      return true;
    } else {
      return false;
    }

  }

}
