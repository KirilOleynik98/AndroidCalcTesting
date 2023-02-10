package pages;

import org.openqa.selenium.By;
import driver.DriverCreation;
import io.appium.java_client.MobileElement;

public class MainPage {

    private final String buttonLocator = "//android.widget.ImageButton[contains(@content-desc,'%s')]";
    private By results = By.id("com.google.android.calculator:id/result_preview");
    private By inputField = By.id("com.google.android.calculator:id/formula");

    public void clickButton(String name){
        getButton(name).click();
    }

    public double getResult() {
        return Double.parseDouble(DriverCreation.getDriver().findElement(results).getText());
    }

    public double getField() {
        return Double.parseDouble(DriverCreation.getDriver().findElement(inputField).getText());
    }

    private MobileElement getButton(String name){
        return (MobileElement) DriverCreation.getDriver().findElement(By.xpath(String.format(buttonLocator, name)));
    }
}
