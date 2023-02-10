package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import driver.DriverCreation;

public class BaseTest {

    @BeforeMethod
    public void startDriver() throws MalformedURLException {
        DriverCreation.getDriver();
    }

    @AfterTest
    public void closeDriver() {
        DriverCreation.closeDriver();
    }
}
