package pages;


import core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui_tests.Lesson_2.PrimeTest;

public class StylusBasePage extends TestBase{

    private WebElement searchField;
    private WebElement searchLink;
    private WebDriver driver;

    public StylusBasePage(WebDriver driver){
        this.driver = driver;
    }
}
