package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author varunnarendra
 * 
 *         Class referenced by MainView to create a RevPolishCalc or StandardCalc object. This
 *         depends on whether a user has inputed an infix or postfix expression.
 *
 */
public class CalcModel {
  Calculator RevPolish;
  Calculator Standard;

  /**
   * Default constructor that created a new CalcModel and initialises attributes.
   */
  public CalcModel() {
    this.RevPolish = new RevPolishCalc();
    this.Standard = new StandardCalc();
  }

  /**
   * Method created to call appropriate class method to calculate answer to expression.
   * 
   * @param expression The expression written by user to be calculated.
   * @param isInfix Changes based on whether expression is infix or postfix.
   * @return returns answer of expression inputed.
   * @throws EmptyStackException Thrown if any stacks used within calculation are being popped when
   *         there are no more elements inside them.
   * @throws InvalidExpressionException Thrown if user inputs invalid expression.
   * @throws BadTypeException Thrown if a bad type is inputed.
   */
  public float evaluate(String expression, boolean isInfix)
      throws EmptyStackException, InvalidExpressionException, BadTypeException {
    if (isInfix) {
      return Standard.evaluate(expression);
    } else {
      return RevPolish.evaluate(expression);
    }

  }

}
