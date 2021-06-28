package pages;

import GeneralSetupViewsAndPages.GeneralPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AgileProjectPage extends GeneralPage {

    @FindBy(name = "uid")
    private WebElement userName;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "btnLogin")
    private WebElement loginButton;
    @FindBy(xpath = "//android.widget.Button")
    private List<WebElement> agileProjectNativeButtons;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    private WebElement logOutButton;

    public AgileProjectPage(AppiumDriver appiumDriver, WebDriverWait wait, WebElement element) {
        super(appiumDriver, wait, element);
    }

    public void enterCredentials(String username, String userPassword){
        waiter(userName);
        userName.sendKeys(username);
        password.sendKeys(userPassword);
        waiter(loginButton);
    }

    public void nativeButton(int buttonNumber){
        clickOnNativeButton(agileProjectNativeButtons, buttonNumber);
    }

    public void waitForLogOutButton(){
        waiter(logOutButton);
    }

    public WebElement getLogOutButton(){
        return getWebElement(logOutButton);
    }

    public String alertText() {
        return appiumDriver.switchTo().alert().getText();
    }
}