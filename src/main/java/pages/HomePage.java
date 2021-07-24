package pages;

import GeneralSetupViewsAndPages.GeneralPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends GeneralPage {

    @FindBy(xpath = "//a[contains(@href,'Agile_Project')]")
    private WebElement agileProjectButton;
    @FindBy(xpath = "//a[contains(text(),'Bank')]")
    private WebElement bankProjectButton;
    @FindBy(xpath = "//a[contains(@href,'newtours')]")
    private WebElement newToursButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li")
    private WebElement navigationBar;
    @FindBy(xpath = "//a[contains(@href,'table')]")
    private WebElement pageTable;


    public HomePage(AppiumDriver<WebElement> appiumDriver, WebDriverWait wait, WebElement element) {
        super(appiumDriver, wait, element);
    }

    public void clickOnRequiredHomePageElement(int elementNumber, String elementName){
        List<WebElement> elementsList = new ArrayList<WebElement>();
        elementsList.add(0, agileProjectButton);
        elementsList.add(1, bankProjectButton);
        elementsList.add(2, newToursButton);
        elementsList.add(3, navigationBar);
        elementsList.add(4, pageTable);
        elementsList.get(elementNumber).click();
        System.out.println(elementName + " clicked");
    }
}