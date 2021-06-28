package appium_tests;

import org.testng.annotations.Test;
import pages.TestBasisWeb;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WebAdaptiveTest extends TestBasisWeb {
    @Test
    public void performLogin() {
        String username = "1303";
        String password = "Guru99";

        homePage.clickOnRequiredHomePageElement(0, "Agile page");
        agileProjectPage.enterCredentials(username, password);
        agileProjectPage.hideKeyboard();
        agileProjectPage.changeAppContext("NATIVE_APP");
        agileProjectPage.nativeButton(0);
        agileProjectPage.changeAppContext("CHROMIUM");
        agileProjectPage.waitForLogOutButton();
        assertTrue(agileProjectPage.getLogOutButton().isDisplayed(), "Log out button displayed");
    }

    @Test
    public void invalidLogin() {
        String username = "111";
        String password = "xyz";

        homePage.clickOnRequiredHomePageElement(0, "Agile page");
        agileProjectPage.enterCredentials(username, password);
        agileProjectPage.hideKeyboard();
        agileProjectPage.changeAppContext("NATIVE_APP");
        agileProjectPage.nativeButton(0);
        agileProjectPage.changeAppContext("CHROMIUM");
        agileProjectPage.waitingForAlertWindow();
        String message = agileProjectPage.alertText();
        assertEquals(message, "User or Password is not valid");
    }

    @Test
    public void navigateToBank() {
        homePage.clickOnRequiredHomePageElement(1, "Bank page");
        bankPage.waitForPageHeader();
        assertEquals("GTPL Bank Home Page", bankPage.getPageTitle(), "Home page title is Bank Home Page");
        assertTrue(bankPage.getLogInButton().isDisplayed());
    }

    @Test
    public void navigateToNewTours() {
        homePage.clickOnRequiredHomePageElement(2, "New Tours page");
        newToursPage.waitForToursLogo();
        assertEquals("Welcome: Mercury Tours", newToursPage.getPageTitle(), "Home page title is Mercury Tours Page");
        assertTrue(newToursPage.toursLogo().isDisplayed(), "User is on Mercury Tours Page");
    }

    @Test
    public void navigateToTablePage() {
        homePage.clickOnRequiredHomePageElement(3, "Navigation bar");
        homePage.implicitWait();
        homePage.clickOnRequiredHomePageElement(4, "Table");
        assertEquals("Table Demo", tablePage.getPageTitle(), "Title of the page is correct");
        assertTrue(tablePage.tableView().isDisplayed());
    }
}
