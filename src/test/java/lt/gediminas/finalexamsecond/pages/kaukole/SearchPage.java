package lt.gediminas.finalexamsecond.pages.kaukole;

import lt.gediminas.finalexamsecond.pages.Common;
import lt.gediminas.finalexamsecond.pages.Locator;

public class SearchPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterSearchValue(String searchValue) {
        Common.sendKeysWithActions(Locator.Kaukole.Search.searchValueRing, searchValue);
    }

    public static void clickOnSearch() {
        Common.clickOnElement(Locator.Kaukole.Search.clickOnSearch);
    }

    public static String getConfirmationAfterSearch() {
        return Common.getTextFromElement(Locator.Kaukole.Search.getTextConfirmation);
    }
}
