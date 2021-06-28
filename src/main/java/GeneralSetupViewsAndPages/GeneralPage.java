package GeneralSetupViewsAndPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class GeneralPage {
    public AppiumDriver appiumDriver;
    public WebDriverWait wait;
    public WebElement element;

    public GeneralPage(AppiumDriver appiumDriver, WebDriverWait wait, WebElement element) {
        this.appiumDriver = appiumDriver;
        this.wait = wait;
        this.element = element;
        PageFactory.initElements(new AppiumFieldDecorator(this.appiumDriver), this);
    }

    public void implicitWait(){
        appiumDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    protected void waiter (WebElement webElement){
        wait.until(visibilityOf(webElement));
    }

    public void hideKeyboard(){
        appiumDriver.hideKeyboard();
    }

    public void changeAppContext(String contextName){
        appiumDriver.context(contextName);
    }

    public void waitingForAlertWindow(){
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public String getPageTitle(){
        return appiumDriver.getTitle();
    }

    protected void clickOnNativeButton(List<WebElement> buttonsList, int buttonNumber){
        buttonsList.get(buttonNumber).click();
    }

    protected WebElement getWebElement(WebElement webElement){
        return webElement;
    }
}