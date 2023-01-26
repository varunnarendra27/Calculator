package cs18200;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.CalcModel;
import uk.ac.rhul.cs2800.InvalidExpressionException;

class TestCalcModel {
	CalcModel testcalcmodel;
	@BeforeEach
	
	void setUp() throws Exception {
		testcalcmodel = new CalcModel();
	}

	@Test
	void testCalcModelInfix() throws EmptyStackException, BadTypeException, InvalidExpressionException {
		
		assertEquals(testcalcmodel.evaluate("2 + 5 * 5", true), 27.0f, "Tests to see if Stack no can pop element");
	}
	@Test
	void testCalcModelPostfix() throws EmptyStackException, BadTypeException, InvalidExpressionException {
		
		assertEquals(testcalcmodel.evaluate("4 5 + 3 / ", false), 3.0f, "Tests to see if Stack no can pop element");
	}

}
