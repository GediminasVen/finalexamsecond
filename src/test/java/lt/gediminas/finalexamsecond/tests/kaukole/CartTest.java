package lt.gediminas.finalexamsecond.tests.kaukole;

import lt.gediminas.finalexamsecond.pages.kaukole.CartPage;
import lt.gediminas.finalexamsecond.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        CartPage.openChrome("https://kaukole.lt/papuosalai/auskarai/auskarai-alien-predator-black");
    }
    @Test
        public void testAddToCart() {
            String expectedResult = "1";
            String actualResult = "";

            CartPage.clickAddToCart();
            CartPage.clickPurchase();
            actualResult = CartPage.getConfirmationAddedToCart();

            Assert.assertTrue(
                    actualResult.contains(expectedResult),
                    "\nActual: %s, \nExpected: %s".formatted(
                            actualResult, expectedResult
                    )
            );
        }

    @Test
    public void testRemoveFromCart() {
        String expectedResult = "1";
        String actualResult;

        CartPage.clickAddToCart();
        CartPage.clickPurchase();
        CartPage.removeFromCart();
        actualResult = CartPage.getConfirmationEmptyCart();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
