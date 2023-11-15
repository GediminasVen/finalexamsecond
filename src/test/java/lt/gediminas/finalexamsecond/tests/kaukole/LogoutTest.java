package lt.gediminas.finalexamsecond.tests.kaukole;

import lt.gediminas.finalexamsecond.pages.kaukole.LoginPage;
import lt.gediminas.finalexamsecond.pages.kaukole.LogoutPage;
import lt.gediminas.finalexamsecond.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LogoutPage.openChrome("https://kaukole.lt/index.php?route=account/account");
    }
    @DataProvider(name = "dataForLogin")
        public Object[][] provideData() {
            return new Object[][]{
                    {"venslovaitisgediminas@yahoo.lt", "Abc123!@#1"}
            };
        }
    @Test (dataProvider = "dataForLogin")
        public void testLogoutAfterLoggedIn(String email, String password) {
            String expectedResult = "Atsijungimas";
            String actualResult = "";

        LogoutPage.enterEmail(email);
        LogoutPage.enterPassword(password);
        LogoutPage.clickOnFinalPrisijungti();
        LogoutPage.clickOnAccount();
        LogoutPage.clickOnAtsijungti();

        actualResult = LogoutPage.confirmLogout();

            Assert.assertTrue(
                    actualResult.contains(expectedResult),
                    "\nActual: %s, \nExpected: %s".formatted(
                            actualResult, expectedResult
                    )
            );
        }
}
