package appium_tests;

import org.testng.annotations.Test;
import views.TestBasisMobile;

import static org.testng.Assert.assertEquals;

public class CalculatorNativeTests extends TestBasisMobile {

    @Test
    public void sumWholeNumbers() {
        calculatorView.getDigitTwo().click();
        calculatorView.getPlusSign().click();
        calculatorView.getDigitEight().click();
        calculatorView.getEqualSign().click();
        assertEquals("10", calculatorView.getResult().getText(), "Assert that result of sum whole numbers is correct");
        calculatorView.getClearSign().click();
    }

    @Test
    public void sumFractionalNumbers() {
        calculatorView.getDigitTwo().click();
        calculatorView.getPoint().click();
        calculatorView.getDigitTwo().click();
        calculatorView.getPlusSign().click();
        calculatorView.getDigitEight().click();
        calculatorView.getPoint().click();
        calculatorView.getDigitEight().click();
        calculatorView.getEqualSign().click();
        assertEquals("11", calculatorView.getResult().getText(), "Assert that result of sum fractional numbers is correct");
        calculatorView.getClearSign().click();
    }

    @Test
    public void multiplyWholeNumbers() {
        calculatorView.getDigitTwo().click();
        calculatorView.getMultiplySign().click();
        calculatorView.getDigitEight().click();
        calculatorView.getEqualSign().click();
        assertEquals("16", calculatorView.getResult().getText(), "Assert that result of multiply whole numbers is correct");
        calculatorView.getClearSign().click();
    }

    @Test
    public void multiplyFractionalNumbers() {
        calculatorView.getDigitTwo().click();
        calculatorView.getPoint().click();
        calculatorView.getDigitTwo().click();
        calculatorView.getMultiplySign().click();
        calculatorView.getDigitEight().click();
        calculatorView.getPoint().click();
        calculatorView.getDigitEight().click();
        calculatorView.getEqualSign().click();
        assertEquals("19.36", calculatorView.getResult().getText(), "Assert that result of multiply fractional numbers is correct");
        calculatorView.getClearSign().click();
    }
}