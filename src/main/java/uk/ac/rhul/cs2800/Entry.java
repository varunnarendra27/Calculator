package uk.ac.rhul.cs2800;

import java.util.Objects;

/**
 * @author varunnarendra
 *
 * Class to create an Entry Object.
 */
public class Entry {

  float number;
  Symbol other;
  String str;
  Type type;

  /**
   * Constructor to instantiate an Entry of type float.
   * 
   * @param value The value passed in to be used to update the float attribute for a new Entry.
   */
  public Entry(float value) {
    this.number = value;
    this.type = Type.NUMBER;
  }

  /**
   * Constructor to instantiate an Entry of type String.
   * 
   * @param str The string passed in to be used to update the string attribute for a new Entry.
   */
  public Entry(String str) {
    this.str = str;
    this.type = Type.STRING;
  }

  /**
   * Constructor to instantiate an Entry of type Symbol.
   * 
   * @param which The enum passed in to be used to update the Symbol attribute for a new Entry.
   */
  public Entry(Symbol which) {
    this.other = which;
    this.type = Type.SYMBOL;
  }

  /**
   * Method to find the type attribute of an Entry.
   * 
   * @return Returns the attribute 'type' for an Entry. Returns String, float, Symbol or Invalid.
   * 
   */
  public Type getType() throws BadTypeException {
    if (this.type == null) {
      throw new BadTypeException();
    }
    return this.type;
  }

  /**
   * Method to find what Symbol an Entry represents.
   * 
   * @return Returns the Symbol attribute for an Entry. Returns Plus, Minus, Times, Divide, Left
   *         Bracket, Right Bracket.
   * 
   * @throws BadTypeException If this method is used with an Entry that does not have type Symbol,
   *         it will throw a BadTypeException.
   */
  public Symbol getSymbol() throws BadTypeException {
    if (this.other == null) {
      throw new BadTypeException();
    }
    return this.other;
  }

  /**
   * Method to find the value of an Entry of type float.
   * 
   * @return Returns the float attribute of an Entry of Type Number.
   * 
   * @throws BadTypeException If this method is used with an Entry that does not have type Number,
   *         it will throw a BadTypeException.
   */
  public float getValue() throws BadTypeException {
    if (this.number == 0.0f) {
      throw new BadTypeException();
    }
    return this.number;
  }

  /**
   * A method to return the string value of an Entry of type String.
   * 
   * @return Returns the string attribute of an Entry of type String.
   * 
   * @throws BadTypeException If this method is used with an Entry that does not have type String,
   *         it will throw a BadTypeException.
   */
  public String getString() throws BadTypeException {
    if (this.str == null) {
      throw new BadTypeException();
    }
    return this.str;

  }

  @Override
  public int hashCode() {
    return Objects.hash(number, other, str, type);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Entry other = (Entry) obj;
    return Float.floatToIntBits(number) == Float.floatToIntBits(other.number)
        && this.other == other.other && Objects.equals(str, other.str) && type == other.type;
  }

}
