package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ui_tests.TestData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestBase {
    protected  WebDriver webDriver;
    protected static WebDriverWait wait;

    @BeforeSuite
    public void setUp() throws IOException{
        webDriver = WebDriverFactory.getWebDriver(TestData.BROWSER_NAME);
        wait = new WebDriverWait(webDriver, 50);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterSuite
    public void tearDown(){
        webDriver.quit();
    }


}
