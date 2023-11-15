package lt.gediminas.finalexamsecond.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static void setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        driver.get("chrome://settings/");
        ((JavascriptExecutor) driver).executeScript("chrome.settingsPrivate.setDefaultZoom(0.5)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    public static void setSafariDriver() {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}


