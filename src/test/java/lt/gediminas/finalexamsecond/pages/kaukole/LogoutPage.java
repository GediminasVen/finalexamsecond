package lt.gediminas.finalexamsecond.pages.kaukole;

import lt.gediminas.finalexamsecond.pages.Common;
import lt.gediminas.finalexamsecond.pages.Locator;

public class LogoutPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(Locator.Kaukole.Logout.provideEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.Kaukole.Logout.enterPassword, password);
    }

    public static void clickOnFinalPrisijungti() {
        Common.clickOnElement(Locator.Kaukole.Logout.clickFinalLogin);
    }

    public static void clickOnAccount() {
        Common.clickWithActions(Locator.Kaukole.Logout.clickAccount);
    }

    public static void clickOnAtsijungti() {
        Common.clickWithActions(Locator.Kaukole.Logout.clickLogout);
    }

    public static String confirmLogout() {
        return Common.getTextFromElement(Locator.Kaukole.Logout.getTextLogout);
    }
}
