package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import constants.ButtonNames;
import pages.MainPage;

public class CalculatorTest extends BaseTest {

    private MainPage mainPage;

    @Test
    public void summationTest() {
        mainPage = new MainPage();
        mainPage.clickButton(ButtonNames.NUMBER_ONE);
        mainPage.clickButton(ButtonNames.SUMMATION_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_TWO);
        Assert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_THREE), mainPage.getResult(), "Result should be equals 3");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
    }

    @Test
    public void subtractionTest() {
        mainPage = new MainPage();
        mainPage.clickButton(ButtonNames.NUMBER_FIVE);
        mainPage.clickButton(ButtonNames.SUBTRACTION_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_FOUR);
        Assert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_ONE), mainPage.getResult(), "Result should be equals 1");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
    }

    @Test
    public void divisionTest() {
        mainPage = new MainPage();
        mainPage.clickButton(ButtonNames.NUMBER_EIGHT);
        mainPage.clickButton(ButtonNames.DIVISION_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_TWO);
        Assert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_FOUR), mainPage.getResult(), "Result should be equals 4");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
    }

    @Test
    public void multiplicationTest() {
        mainPage = new MainPage();
        mainPage.clickButton(ButtonNames.NUMBER_ZERO);
        mainPage.clickButton(ButtonNames.MULTIPLICATION_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_SIX);
        Assert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_ZERO), mainPage.getResult(), "Result should be equals 0");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
    }

    @Test
    public void pressNumberTest() {
        mainPage = new MainPage();
        SoftAssert softAssert = new SoftAssert();
        mainPage.clickButton(ButtonNames.NUMBER_ZERO);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_ZERO), mainPage.getField(), "Number 0 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_ONE);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_ONE), mainPage.getField(), "Number 1 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_TWO);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_TWO), mainPage.getField(), "Number 2 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_THREE);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_THREE), mainPage.getField(), "Number 3 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_FOUR);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_FOUR), mainPage.getField(), "Number 4 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_FIVE);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_FIVE), mainPage.getField(), "Number 5 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_SIX);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_SIX), mainPage.getField(), "Number 6 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_SEVEN);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_SEVEN), mainPage.getField(), "Number 7 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_EIGHT);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_EIGHT), mainPage.getField(), "Number 8 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        mainPage.clickButton(ButtonNames.NUMBER_NINE);
        softAssert.assertEquals(Double.parseDouble(ButtonNames.NUMBER_NINE), mainPage.getField(), "Number 9 is not pressed");
        mainPage.clickButton(ButtonNames.CLEAR_BUTTON);
        softAssert.assertAll();
    }
}
