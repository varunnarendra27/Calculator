package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * @author varunnarendra
 * 
 *         A class that is used to create a new StandardCalc object. This is used to convert from
 *         infix to postfix to be evaluated.
 *
 */
public class StandardCalc implements Calculator {
  String expression;
  OpStack values;
  StrStack operands;
  RevPolishCalc reCalc;

  /**
   * Default constructor used to create a new StandardCalc object.
   */
  public StandardCalc() {

    this.values = new OpStack();
    this.reCalc = new RevPolishCalc();
    this.operands = new StrStack();

  }

  /**
   * 
   * Used to get precedence of operations to convert from infix to postfix correctly.
   * 
   * @param temp Symbol passed in to work out the precedence of it.
   * 
   * @return Returns the precedence of the of the symbol passed in.
   */
  public int getPrecedence(Symbol temp) {
    if (temp == Symbol.PLUS || temp == Symbol.MINUS) {
      return 1;
    } else {
      return 2;
    }
  }

  /**
   * An overrided method inherited from Calculator class. Used to convert an infix expression into
   * postfix and passed into revpolishcalc to get answer of expression.
   */
  @Override
  public float evaluate(String expression)
      throws InvalidExpressionException, EmptyStackException, BadTypeException {

    String[] split_expression = expression.split(" ");

    for (String i : split_expression) {


      String holder = i;
      if (!holder.equals("+") && !holder.equals("-") && !holder.equals("*") && !holder.equals("/")
          && !holder.equals("(") && !holder.equals(")")) {
        operands.push(holder);
      } else if (holder.equals("(")) {

        values.push(Symbol.getEnum(holder));

      } else if (holder.equals(")")) {
        while (values.isEmpty() == false) {
          Symbol temp = values.pop();
          if (temp != Symbol.LEFT_BRACKET) {
            operands.push(temp.name());
          } else {
            break;
          }
        }
      }

      else if (holder.equals("+") || holder.equals("-") || holder.equals("*")
          || holder.equals("/")) {
        if (values.isEmpty()) {
          values.push(Symbol.getEnum(holder));

        } else {
          while (values.isEmpty() == false) {
            Symbol temp = values.pop();
            if (temp == Symbol.LEFT_BRACKET) {
              values.push(temp);
              break;
            } else if (temp == Symbol.PLUS || temp == Symbol.MINUS || temp == Symbol.TIMES
                || temp == Symbol.DIVIDE) {
              if (getPrecedence(temp) < getPrecedence(Symbol.getEnum(holder))) {
                values.push(temp);
                break;
              } else {
                operands.push(temp.name());
              }

            }
          }
          values.push(Symbol.getEnum(holder));

        }

      }
    }


    String result = "";
    while (values.isEmpty() == false) {
      operands.push(values.pop().name());
    }
    ArrayList<String> swap = new ArrayList<String>();

    while (operands.isEmpty() == false) {
      swap.add(operands.pop());
    }

    for (int i = swap.size() - 1; i >= 0; i--) {

      if (swap.get(i).equals("PLUS")) {
        result = result + (" +");

      }

      else if (swap.get(i).equals("MINUS")) {
        result = result + (" -");

      }

      else if (swap.get(i).equals("DIVIDE")) {
        result = result + (" /");

      } else if (swap.get(i).equals("TIMES")) {
        result = result + (" *");

      } else {
        if (result.equals("")) {
          result = result + swap.get(i);
        } else {
          result = result + " " + swap.get(i);
        }

      }



    }
    return this.reCalc.evaluate(result);

  }

}
