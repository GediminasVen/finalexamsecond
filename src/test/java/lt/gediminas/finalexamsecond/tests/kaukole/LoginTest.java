package lt.gediminas.finalexamsecond.tests.kaukole;

import lt.gediminas.finalexamsecond.pages.Common;
import lt.gediminas.finalexamsecond.pages.Locator;
import lt.gediminas.finalexamsecond.pages.kaukole.LoginPage;
import lt.gediminas.finalexamsecond.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openChrome("https://kaukole.lt/index.php?route=account/login");
    }
    @DataProvider(name = "LoginData")
    public Object[][] provideLogin() {
        return new Object[][]{
                {"venslovaitisgediminas@yahoo.lt", "Abc123!@#1"},
                {"venslovaitisgediminas@yahoo.lt", " "},
                {" ", "Abc123!@#1"}
        };
    }
    @Test(dataProvider = "LoginData")
    public void testLoginFunctionality(String email, String password) {
        String expectedResult = "Gediminas";
        String actualResult;

        LoginPage.enterEmail(email);
        LoginPage.enterPassword(password);
        LoginPage.clickOnFinalPrisijungti();

        actualResult = LoginPage.checkIfLoggedIn();

        Assert.assertEquals(
                        actualResult, expectedResult
        );
    }
}
