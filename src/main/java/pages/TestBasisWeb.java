package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class TestBasisWeb {
    public AppiumDriver<WebElement> appiumDriver;
    public WebDriverWait wait;
    public WebElement element;

    public HomePage homePage;
    public AgileProjectPage agileProjectPage;
    public BankPage bankPage;
    public NewToursPage newToursPage;
    public TablePage tablePage;

    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);
        capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("chromedriverExecutableDir", "C:\\Users\\sderi\\.m2\\repository\\webdriver\\chromedriver\\win32\\91.0.4472.101");

        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AndroidDriver<WebElement>(serverAddress, capabilities);
        wait = new WebDriverWait(appiumDriver, 20);
    }

    @BeforeMethod
    public void actionsBeforeMethod() {
        appiumDriver.get("http://demo.guru99.com/");
        homePage = new HomePage(appiumDriver, wait, element);
        agileProjectPage = new AgileProjectPage(appiumDriver, wait, element);
        bankPage = new BankPage(appiumDriver, wait, element);
        newToursPage = new NewToursPage(appiumDriver, wait, element);
        tablePage = new TablePage(appiumDriver, wait, element);
    }

    @AfterClass
    public void actionsAfterClass() {
        appiumDriver.quit();
    }
}
