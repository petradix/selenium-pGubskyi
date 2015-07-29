package ui_tests.HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class Stylus {
    private WebDriver driver;
    private WebElement searchField;
    private String searchText;
    private WebElement searchLink;


    @BeforeTest
    public void setUp(){
        searchText = "Sony Xperia Z2";
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.stylus.com.ua");

    }


    @Test
    public void seleniumSearchTest(){

        searchField = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/form/input[1]"));
        searchField.sendKeys(searchText);
        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/form/input[2]")).click();

        searchLink = driver.findElement(By.xpath(".//*[@id='search-list']/ul/li[2]/a/span"));

        assertTrue(searchLink.getText().contains(searchText));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
