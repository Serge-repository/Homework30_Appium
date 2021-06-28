package pages;

import GeneralSetupViewsAndPages.GeneralPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankPage extends GeneralPage {

    @FindBy(xpath = "//h2")
    private WebElement bankPageHeader;
    @FindBy(name = "btnLogin")
    private WebElement loginButton;

    public BankPage(AppiumDriver appiumDriver, WebDriverWait wait, WebElement element) {
        super(appiumDriver, wait, element);
    }

    public void waitForPageHeader() {
        waiter(bankPageHeader);
    }

    public WebElement getLogInButton() {
        return getWebElement(loginButton);
    }
}