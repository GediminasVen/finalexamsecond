package lt.gediminas.finalexamsecond.tests.kaukole;

import lt.gediminas.finalexamsecond.pages.Locator;
import lt.gediminas.finalexamsecond.pages.kaukole.SearchPage;
import lt.gediminas.finalexamsecond.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        SearchPage.openChrome("https://kaukole.lt/index.php?route=common/home");
    }
    @Test
        public void testSearchBox() {
            String expectedResult = "Ring";
            String actualResult = "";
            String searchValue = "Ring";

        SearchPage.enterSearchValue(searchValue);
        SearchPage.clickOnSearch();
        actualResult = SearchPage.getConfirmationAfterSearch();

            Assert.assertTrue(
                    actualResult.contains(expectedResult),
                    "\nActual: %s, \nExpected: %s".formatted(
                            actualResult, expectedResult
                    )
            );
        }
    @Test
    public void testSearchBoxFood() {
        String expectedResult = "Burger";
        String actualResult;
        String searchValue = "Burger";

        SearchPage.enterSearchValue(searchValue);
        SearchPage.clickOnSearch();
        actualResult = SearchPage.getConfirmationAfterSearch();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }

    @Test
    public void testSearchBoxInvalidData() {
        String expectedResult = "!@#!@#!";
        String actualResult;
        String searchValue = "!@#!@#!";

        SearchPage.enterSearchValue(searchValue);
        SearchPage.clickOnSearch();
        actualResult = SearchPage.getConfirmationAfterSearch();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
