package lt.gediminas.finalexamsecond.pages.kaukole;

import lt.gediminas.finalexamsecond.pages.Common;
import lt.gediminas.finalexamsecond.pages.Locator;
import lt.gediminas.finalexamsecond.utilities.Driver;

import java.time.Duration;

public class RegistrationPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterName(String name) {
        Common.sendKeysToElement(Locator.Kaukole.Registration.enterName, name);
    }

    public static void enterLastname(String lastname) {
        Common.sendKeysToElement(Locator.Kaukole.Registration.enterLastname, lastname);
    }

    public static void enterNumber(String number) {
        Common.sendKeysToElement(Locator.Kaukole.Registration.enterNumber, number);
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(Locator.Kaukole.Registration.enterEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.Kaukole.Registration.enterPassword, password);
    }

    public static void enterConfirmationPassword(String confirmPassword) {
        Common.sendKeysToElement(Locator.Kaukole.Registration.confirmPassword, confirmPassword);
    }

    public static void clickAgreeTermsConditions() {
        Common.clickOnElement(Locator.Kaukole.Registration.agreeTermsConditions);
    }

    public static void clickContinueAfterRegistration() {
        Common.clickOnElement(Locator.Kaukole.Registration.clickContinue);
    }

    public static String checkSuccesfulRegistration() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Common.getTextFromElement(Locator.Kaukole.Registration.readTextName);
    }
}
