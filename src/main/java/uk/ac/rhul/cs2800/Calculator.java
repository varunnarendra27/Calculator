package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author varunnarendra
 * 
 *         Used to create evaluate method called by many classes in program.
 */
public interface Calculator {

  /**
   * Calculator Interface called by RevPolishCalc and StandardCalc to evaluate answer to expression
   * inputed by user.
   * 
   * @param expression The expression inputed by user.
   * 
   * @return returns answer to expression.
   * 
   * @throws InvalidExpressionException Thrown if invalid expression is inputed.
   * 
   * @throws EmptyStackException Thrown if any stack during calculation is popped whilst being
   *         empty.
   * 
   * @throws BadTypeException Thrown if incorrect type is used.
   */
  float evaluate(String expression)
      throws InvalidExpressionException, EmptyStackException, BadTypeException;

}
