package views;

import GeneralSetupViewsAndPages.GeneralPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorView extends GeneralPage {

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_2')]")
    private MobileElement digitTwo;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'op_add')]")
    private MobileElement plusSign;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_8')]")
    private MobileElement digitEight;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'eq')]")
    private MobileElement equalSign;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'result')]")
    private MobileElement result;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'clr')]")
    private MobileElement clearSign;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'dec_point')]")
    private MobileElement point;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'op_mul')]")
    private MobileElement multiplySign;

    public CalculatorView(AppiumDriver appiumDriver, WebDriverWait wait, MobileElement element) {
        super(appiumDriver, wait, element);
    }

    public MobileElement getDigitTwo() {
        return digitTwo;
    }

    public MobileElement getPlusSign() {
        return plusSign;
    }

    public MobileElement getDigitEight() {
        return digitEight;
    }

    public MobileElement getEqualSign() {
        return equalSign;
    }

    public MobileElement getResult() {
        return result;
    }

    public MobileElement getClearSign() {
        return clearSign;
    }

    public MobileElement getPoint() {
        return point;
    }

    public MobileElement getMultiplySign() {
        return multiplySign;
    }
}
