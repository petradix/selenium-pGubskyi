package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchPage extends TestBase {

    private WebElement searchField;
    private WebElement searchLink;
    private WebElement searchButton;



    public GoogleSearchPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void open (String URL) {webDriver.get(URL);}

    public void searchText(String searchText){
        searchField = webDriver.findElement(By.id("lst-ib"));
        searchField.sendKeys(searchText);

    }

    public WebElement findURLElement(){
        searchLink = webDriver.findElement(By.xpath(".//*[@id='rso']/div[2]/div[1]/div/h3/a"));

        return searchLink;
    }

    public WebElement clickButton(){
      searchButton = webDriver.findElement(By.xpath(".//*[@id='sblsbb']/button"));
        return searchButton;

    }


}
