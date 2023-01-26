package uk.ac.rhul.cs2800;

import javafx.event.ActionEvent;
import java.util.EmptyStackException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * @author varunnarendra
 *
 *         Class that gives GUI functionality.
 */
public class MainView {

  boolean isInfix;
  private CalcModel answer;

  @FXML
  private TextField ResultID;

  @FXML
  private Button calculateInfix;

  @FXML
  private Button calculatePostfix;

  @FXML
  private TextField expressionID;

  @FXML
  private Pane mainPane;

  public void calculate() {}

  public void expressionType() {}

  /**
   * Method that is called when user inputs an expression into expressionID and clicks on
   * calculateInfix. This calculates the answer and changes ResultID to this answer.
   * 
   * @param event Event that is triggered when Infix calculate button is pressed.
   * @throws EmptyStackException Thrown if any stack during calculation is popped whilst being
   *         empty.
   * @throws InvalidExpressionException Thrown if incorrect expression is inputed.
   */
  @FXML
  void infixPressed(ActionEvent event) throws EmptyStackException, InvalidExpressionException {
    answer = new CalcModel();
    try {
      ResultID.setText(Float.toString(answer.evaluate(expressionID.getText(), true)));

    } catch (BadTypeException e) {
      ResultID.setText("Bad type");
    }

  }

  /**
   * Method that is called when user inputs an expression into expressionID and clicks on
   * calculatePostfix. This calculates the answer and changes ResultID to this answer.
   * 
   * @param event Event that is triggered when Infix calculate button is pressed.
   * @throws EmptyStackException Thrown if any stack during calculation is popped whilst being
   *         empty.
   * @throws InvalidExpressionException Thrown if incorrect expression is inputed.
   */
  @FXML
  void postfixPressed(ActionEvent event) throws EmptyStackException, InvalidExpressionException {
    answer = new CalcModel();
    try {
      ResultID.setText(Float.toString(answer.evaluate(expressionID.getText(), false)));

    } catch (BadTypeException e) {
      ResultID.setText("Bad type");
    } catch (Exception e) {
      ResultID.setText("Invalid expression");
    }

  }

}
