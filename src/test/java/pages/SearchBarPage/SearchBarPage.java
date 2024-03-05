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

    public void setSearchBar(String item1){
        LOG.info("Click 'search bar'");
        driver.findElement(searchBar).click();
        driver.findElement(searchBar).sendKeys(item1);
    }
    public void setShakerNegru(){
        LOG.info("Search 'shaker'");
        driver.findElement(shakerNegru).click();
    }
}
