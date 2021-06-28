package pages;

import GeneralSetupViewsAndPages.GeneralPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewToursPage extends GeneralPage {

    @FindBy(xpath = "//img[contains(@src,'images/logo.gif')]")
    private WebElement toursLogo;

    public NewToursPage(AppiumDriver appiumDriver, WebDriverWait wait, WebElement element) {
        super(appiumDriver, wait, element);
    }

    public void waitForToursLogo() {
        waiter(toursLogo);
    }

    public WebElement toursLogo() {
        return getWebElement(toursLogo);
    }
}