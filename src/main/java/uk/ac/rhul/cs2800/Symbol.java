package uk.ac.rhul.cs2800;

/**
 * This holds all the types of Symbols that are available to use
 * 
 * @author varunnarendra
 *
 */
public enum Symbol {
  LEFT_BRACKET("(") {
    public String toString() {
      return "(";
    }
  },
  RIGHT_BRACKET(")") {
    public String toString() {
      return ")";
    }
  },
  TIMES("*") {
    public String toString() {
      return "*";
    }
  },
  DIVIDE("/") {
    public String toString() {
      return "/";
    }
  },
  PLUS("+") {
    public String toString() {
      return "+";
    }
  },
  MINUS("-") {
    public String toString() {
      return "-";
    }
  },
  INVALID;

  private String symbol;

  Symbol(String string) {
    this.symbol = string;
  }

  public static Symbol getEnum(String symbolpass) {
    // System.out.println(symbolpass);
    if (symbolpass.equals("+")) {
      return Symbol.PLUS;
    }

    if (symbolpass.equals("(")) {

      return Symbol.LEFT_BRACKET;

    } else if (symbolpass.equals(")")) {
      return Symbol.RIGHT_BRACKET;

    } else if (symbolpass.equals("*")) {
      return Symbol.TIMES;

    } else if (symbolpass.equals("/")) {
      return Symbol.DIVIDE;

    } else if (symbolpass.equals("+")) {
      return Symbol.PLUS;

    } else if (symbolpass.equals("-")) {
      return Symbol.MINUS;

    } else {
      return Symbol.INVALID;
    }

  }

  Symbol() {

  }
}
