package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchPage extends TestBase {

    private WebElement searchField;
    private WebElement searchLink;
    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchText(String searchText){
        searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys(searchText);

    }

    public WebElement findURLElement(){
        searchLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/div[1]/div/h3/a"));
        return searchLink;
    }

    public void open(String URL){
        driver.get(URL);
    }
}
