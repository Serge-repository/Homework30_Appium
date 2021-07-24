package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class TestBasisMobile {
    public AppiumDriver<MobileElement> appiumDriver;
    public WebDriverWait wait;
    public MobileElement element;

    public CalculatorView calculatorView;

    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AndroidDriver<MobileElement>(serverAddress, capabilities);
    }

    @AfterClass
    public void actionsAfterClass() {
        appiumDriver.quit();
    }

    @BeforeMethod
    public void actionsBeforeMethod(){
        calculatorView = new CalculatorView(appiumDriver, wait, element);
    }
}
