package lt.gediminas.finalexamsecond.pages.kaukole;

import lt.gediminas.finalexamsecond.pages.Common;
import lt.gediminas.finalexamsecond.pages.Locator;

public class CartPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickAddToCart() {
        Common.clickOnElement(Locator.Kaukole.Cart.AddToCart);
    }

    public static void clickPurchase() {
        Common.clickWithActions(Locator.Kaukole.Cart.Purchase);
    }

    public static String getConfirmationAddedToCart() {
        return Common.getTextFromElement(Locator.Kaukole.Cart.ConfirmCart);
    }

    public static void removeFromCart() {
        Common.clickWithActions(Locator.Kaukole.Cart.removeItem);
    }

    public static String getConfirmationEmptyCart() {
        return Common.getTextFromElement(Locator.Kaukole.Cart.confirmEmptyCart);
    }
}
