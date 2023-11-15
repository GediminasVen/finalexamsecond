package lt.gediminas.finalexamsecond.pages.kaukole;

import lt.gediminas.finalexamsecond.pages.Common;
import lt.gediminas.finalexamsecond.pages.Locator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void enterEmail(String email) {
        Common.sendKeysToElement(Locator.Kaukole.Login.enterEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.Kaukole.Login.enterPassword, password);
    }

    public static void clickOnFinalPrisijungti() {
        Common.clickWithActions(Locator.Kaukole.Login.clickFinalLogin);
    }

    public static String checkIfLoggedIn() {
        return Common.getTextFromElement(Locator.Kaukole.Login.getConfirmationLoggedIn);
    }
}
