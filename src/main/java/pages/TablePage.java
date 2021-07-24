package pages;

import GeneralSetupViewsAndPages.GeneralPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TablePage extends GeneralPage {

    @FindBy(xpath = "//table")
    private WebElement table;

    public TablePage(AppiumDriver<WebElement> appiumDriver, WebDriverWait wait, WebElement element) {
        super(appiumDriver, wait, element);
    }

    public WebElement tableView() {
        return getWebElement(table);
    }
}