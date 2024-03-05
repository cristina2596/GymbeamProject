package pages.SearchBarPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchBarPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarPage.class);
    public static SearchBarPage instance;

    private SearchBarPage() {

    }

    public static SearchBarPage getInstance() {
        if (instance == null) {
            instance = new SearchBarPage();
        }
        return instance;

    }

    private By searchBar = By.id("search");
    private By shakerNegru=By.xpath("//span[contains(.,'Shaker negru 700 ml - GymBeam')]");
    private By shakerItemPage=By.id("product-addtocart-button");
    private By itemAddedConfirmationMessage=By.xpath("//div[@class='message-success success message']");
    private By fierNow=By.xpath("//a[@title='Fier 18 mg - NOW Foods']");
    private By orderSummaryBox=By.xpath("//tr[@class='totals sub']/th[@class='mark']");

    public void setSearchBar(String item1){
        LOG.info("Click 'search bar'");
        driver.findElement(searchBar).click();
        driver.findElement(searchBar).sendKeys(item1);
    }
    public void setShakerNegru(){
        LOG.info("Search 'shaker'");
        driver.findElement(shakerNegru).click();
    }

    public void addShakerToCart() {
        LOG.info("Add shaker to cart");
        driver.findElement(shakerItemPage).click();
    }
        public boolean verifyConfirmationMessage(){
         LOG.info("Verify if item is added to the cart");
         return driver.findElement(itemAddedConfirmationMessage).isDisplayed();
        }

    public void searchBarItem2(String item2){
        LOG.info("Search 'fier") ;
        driver.findElement(searchBar).click();
        driver.findElement(searchBar).sendKeys(item2);
    }
    public void searchFier(){
        LOG.info("Fier item page");
        driver.findElement(fierNow).click();
    }
    public void addFierToCart(){
        LOG.info("Add 'fier' to cart");
        driver.findElement(shakerItemPage).click();

    }
    public boolean fierConfirmationMessage(){
        LOG.info("Fier added to the cart confirmation message");
        return driver.findElement(itemAddedConfirmationMessage).isDisplayed();
    }
    public boolean isSummaryBoxDisplayed(){
        LOG.info("Verify if order summary box is displayed");
    return  driver.findElement(orderSummaryBox).isDisplayed();
    }
}
