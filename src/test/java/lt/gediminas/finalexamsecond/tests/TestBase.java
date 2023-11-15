package lt.gediminas.finalexamsecond.tests;

import lt.gediminas.finalexamsecond.utilities.TestListenerScreenshot;
import lt.gediminas.finalexamsecond.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListenerScreenshot.class)
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();


    @AfterMethod
    public void tearDown() {
        Common.quitDriver();
    }
}
