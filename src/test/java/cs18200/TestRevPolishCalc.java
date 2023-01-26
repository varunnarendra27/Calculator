package cs18200;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.ac.rhul.cs2800.BadTypeException;
import uk.ac.rhul.cs2800.InvalidExpressionException;
import uk.ac.rhul.cs2800.RevPolishCalc;

class TestRevPolishCalc {

	RevPolishCalc revpolcalctest;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		revpolcalctest = new RevPolishCalc();
		
	}

	@Test
	void testInvalidExpressionThrow() {
		RevPolishCalc revpolcalctest2 = new RevPolishCalc();
		assertThrows(InvalidExpressionException.class, () -> revpolcalctest2.evaluate("FakeExpressionThatShouldFail"), "Test that a InvalidExpressionException "
		        + "will be thrown if invalid expression is passed into constructor");
		
	}

	@Test
	void testSingleDigitEvaluate() throws EmptyStackException, InvalidExpressionException, BadTypeException {
		assertEquals(revpolcalctest.evaluate("6 3 * 4 5 - - 2 +"), 21f, "Tests to see if RPN successfully computes single digit answer");
		
	}
	
	@Test
	void testDoubleDigitEvaluate() throws EmptyStackException, InvalidExpressionException, BadTypeException {
		assertEquals(revpolcalctest.evaluate("12 13 * 41 5 - - 24 +"), 144f, "Tests to see if RPN successfully computes double digit answer");
		
	}
	
	@Test
	void testDecimalDigitEvaluate() throws EmptyStackException, InvalidExpressionException, BadTypeException {
		assertEquals(revpolcalctest.evaluate("6.3 3.1 * 4.5 5.2 - - 2 +"), 22.23f, "Tests to see if RPN successfully computes decimal digit answer");
		
	}
	
	
	

}
