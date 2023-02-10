package driver;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import config.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import utils.Util;

public class DriverCreation {

    private static final String DEVICE_NAME = ConfigReader.emulatorConfig.deviceName();
    private static final String PLATFORM_NAME = ConfigReader.emulatorConfig.platformName();
    private static final String PLATFORM_VERSION = ConfigReader.emulatorConfig.platformVersion();
    private static final String UDID = ConfigReader.emulatorConfig.udid();
    private static String APP_PACKAGE = ConfigReader.emulatorConfig.appPackage();
    private static String APP_ACTIVITY = ConfigReader.emulatorConfig.appActivity();
    private static final String APP = ConfigReader.emulatorConfig.app();
    private static final String URL = ConfigReader.emulatorConfig.remoteURL();
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if(driver==null){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", DEVICE_NAME);
            capabilities.setCapability("platformName", PLATFORM_NAME);
            capabilities.setCapability("platformVersion", PLATFORM_VERSION);
            capabilities.setCapability("udid", UDID);
            capabilities.setCapability("appPackage", APP_PACKAGE);
            capabilities.setCapability("appActivity", APP_ACTIVITY);
            capabilities.setCapability("app", Util.getAbsolutePath(APP));
            try {
                driver = new AndroidDriver(new URL(URL), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if(driver!=null){
            driver.quit();
        }
    }
}
