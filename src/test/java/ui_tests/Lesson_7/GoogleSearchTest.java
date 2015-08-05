package ui_tests.Lesson_7;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class GoogleSearchTest extends TestBase{
  private   String googoleWebSite = "https://www.google.com";
  private   String searchText = "Selenium";

    @Test
    public void seleniumSearchTest(){
        GoogleSearchPage onGoogleSearchPage = new GoogleSearchPage(webDriver);
        onGoogleSearchPage.open(googoleWebSite);
        onGoogleSearchPage.searchText(searchText);
        onGoogleSearchPage.clickButton().click();
        assertTrue(onGoogleSearchPage.findURLElement().getText().toLowerCase().contains(searchText.toLowerCase()));

    }

}
