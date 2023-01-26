package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author varunnarendra
 * 
 *         Creates a Reverse Polish Calculator Objects used to calculate the answer of any postfix
 *         expression inputted.
 *
 */
public class RevPolishCalc implements Calculator {
  NumStack values;

  /**
   * Default constructor that creates a new RevPolishCalc object
   */
  public RevPolishCalc() {

    this.values = new NumStack();

  }

  /**
   * Method to calculate the answer to an expression that is put in postfix.
   * 
   * @param expression The postfix expression inputed by user to be calculated.
   * 
   * @return float Returns the answer to expression inputed.
   */
  @Override
  public float evaluate(String expression)
      throws InvalidExpressionException, EmptyStackException, BadTypeException {

    String[] split_expression = expression.split(" ");
    for (String i : split_expression) {

    }

    for (String i : split_expression) {


      String holder = i;

      try {
        float floatValue = Float.parseFloat(holder);

        values.push(floatValue);

      } catch (NumberFormatException e) {


        if (holder.equals("(") || holder.equals(")") || holder.equals("/") || holder.equals("*")
            || holder.equals("+") || holder.equals("-")) {

          float operand2 = values.pop();
          float operand1 = values.pop();

          if (holder.equals("+")) {
            values.push(operand1 + operand2);

          } else if (holder.equals("-")) {
            values.push(operand1 - operand2);
          } else if (holder.equals("*")) {
            values.push(operand1 * operand2);
          } else if (holder.equals("/")) {
            values.push(operand1 / operand2);
          }



        } else {
          throw new InvalidExpressionException();
        }

      }

    }
    return values.pop();
  }

}
