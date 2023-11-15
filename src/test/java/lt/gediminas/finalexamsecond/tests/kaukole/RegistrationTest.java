package lt.gediminas.finalexamsecond.tests.kaukole;

import lt.gediminas.finalexamsecond.pages.kaukole.RegistrationPage;
import lt.gediminas.finalexamsecond.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.openChrome("https://kaukole.lt/index.php?route=extension/module/uni_login_register/page");
    }

    @DataProvider(name = "Registration")
    public Object[][] RegistrationData() {
        return new Object[][]{
                {"Gediminas", "Venslovaitis", "37062744123", "vesslovaitisgediminas@yahoo.com", "Abc123!@#1", "Abc123!@#1"},
                {"Gediminas", "Venslovaitis", "37062344123", "venslovaitisgediminas@yahoo.lt", "Abc123!@#1", " "},
                {"Gediminas", "Venslovaitis", "37062344123", "venslovaitisgediminas@yahoo.lt", " ", "Abc123!@#1"},
                {"Gediminas", "Venslovaitis", "37062344123", " @yahoo.lt", "Abc123!@#1", "Abc123!@#1"},
                {"Gediminas", "Venslovaitis", "12345612343", "venslovaitisgediminas@yahoo.lt", "Abc123!@#1", "Abc123!@#1"},
                {"Gediminas", " ", "37062344123", "venslovaitisgediminas@yahoo.lt", "Abc123!@#1", "Abc123!@#1"},
                {" ", "Venslovaitis", "37062344123", "venslovaitigediminas@yahoo.lt", "Abc123!@#1", "Abc123!@#1"}
        };
    }

    @Test(dataProvider = "Registration")
    public void testRegistrationWeb(String name, String lastname, String number, String email, String password, String confirmPassword) {
        String expectedResult = name;
        String actualResult = "";

        RegistrationPage.enterName(name);
        RegistrationPage.enterLastname(lastname);
        RegistrationPage.enterNumber(number);
        RegistrationPage.enterEmail(email);
        RegistrationPage.enterPassword(password);
        RegistrationPage.enterConfirmationPassword(confirmPassword);
        RegistrationPage.clickAgreeTermsConditions();
        RegistrationPage.clickContinueAfterRegistration();

        actualResult = RegistrationPage.checkSuccesfulRegistration();
        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
