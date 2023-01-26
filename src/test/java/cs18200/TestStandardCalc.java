package cs18200;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.InvalidExpressionException;
import uk.ac.rhul.cs2800.StandardCalc;
import uk.ac.rhul.cs2800.Symbol;

class TestStandardCalc {
	StandardCalc test_standard_calc;
	@BeforeEach
	void setUp() throws Exception {
		test_standard_calc = new StandardCalc();
	}

	@Test
	void evaluate() throws EmptyStackException, InvalidExpressionException, BadTypeException {
		assertEquals(test_standard_calc.evaluate("2 + 3 * 4"), 14.0, "Tests to see if an infix expression can be converted into postfix");
		
	}

	@Test
	void testGetPrecedence() {
		assertEquals(test_standard_calc.getPrecedence(Symbol.PLUS), 1, "Tests to see if correct precedence is returned");
	}

}
