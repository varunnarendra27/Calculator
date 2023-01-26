package uk.ac.rhul.cs2800;

/**
 * This page holds the enumerations for all the different Entry Types
 * 
 * @author varunnarendra
 *
 */
public enum Type {

  NUMBER("Number"), SYMBOL("Symbol"), STRING("String"), INVALID;

  private String type;

  /**
   * constructor accepts a String argument which is saved to type field which is later accessed by
   * getter method getType()
   * 
   * @param string2 Field to be accessed by getType
   */
  Type(String string2) {
    this.type = string2;
  }

  Type() {}
}
