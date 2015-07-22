package Lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by petr
 * Date: 22.07.2015
 * Time: 20:58.
 */
public class GoogleTest {

    private WebDriver driver;
    private WebElement searchField;
    private String searchText;
    private WebElement searchLink;

    @BeforeTest
    public void setUp(){
        searchText = "Selenium";
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }


    @Test
        public void seleniumSearchTest(){

        searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys(searchText);
        searchLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a"));

        assertTrue(searchLink.getText().contains(searchText));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
