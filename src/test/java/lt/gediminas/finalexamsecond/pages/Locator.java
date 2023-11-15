package lt.gediminas.finalexamsecond.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Kaukole{



        public static class Registration{

            public static By enterName = By.xpath("//*[@id=\"input-firstname\"]");
            public static By enterLastname = By.xpath("//*[@id=\"input-lastname\"]");
            public static By enterNumber = By.xpath("//*[@id=\"input-telephone\"]");
            public static By enterEmail = By.xpath("//*[@id=\"input-email\"]");
            public static By enterPassword = By.xpath("//*[@id=\"input-password\"]");
            public static By confirmPassword = By.xpath("//*[@id=\"input-confirm\"]");
            public static By agreeTermsConditions = By.xpath("//*[@id=\"content\"]/div/div/form/div[9]/div/label/input");
            public static By clickContinue = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/button");
            public static By readTextName = By.xpath("//*[@id=\"account\"]/button/span");
        }
        public static class Login{

            public static By enterEmail = By.xpath("//*[@id=\"input-email\"]");;
            public static By enterPassword = By.xpath("//*[@id=\"input-password\"]");
            public static By clickFinalLogin = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/form/button");
            public static By getConfirmationLoggedIn = By.xpath("//*[@id=\"account\"]/button/span");
        }
        public static class Logout{

            public static By provideEmail = By.xpath("//*[@id=\"input-email\"]");
            public static By enterPassword = By.xpath("//*[@id=\"input-password\"]");
            public static By clickFinalLogin = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/form/button");
            public static By clickAccount = By.xpath("//*[@id=\"account\"]/button/span");

            public static By clickLogout = By.xpath("//*[@id=\"account\"]/ul/li[4]/a");
            public static By getTextLogout = By.xpath("//*[@id=\"content\"]/h1");
        }
        public static class Search{

            public static By searchValueRing = By.xpath("//*[@id=\"search\"]/div/div[1]/input");
            public static By clickOnSearch = By.xpath("//*[@id=\"search\"]/div/div[1]/button[2]/i");
            public static By getTextConfirmation = By.xpath("//*[@id=\"content\"]/div/div[4]/div[1]/div/div[2]/a");
        }
        public static class Cart{

            public static By AddToCart = By.xpath("//*[@id=\"button-cart\"]/span");
            public static By Purchase = By.xpath("//*[@id=\"modal-cart\"]/div/div/div[2]/div[3]/a");
            public static By ConfirmCart = By.xpath("//*[@id=\"content\"]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/a");
            public static By removeItem = By.xpath("//*[@id=\"unicart\"]/div[1]/div/div/div[3]/i");
            public static By confirmEmptyCart = By.xpath("//*[@id=\"cart-total\"]");
        }
    }
}
