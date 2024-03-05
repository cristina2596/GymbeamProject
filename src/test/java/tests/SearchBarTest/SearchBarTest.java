package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);


    @Test
    public void searchBarTest() {
        String item1 = "shaker";

        sleep(4000);
        LOG.info("Consent");
        registerPage.acceptConsent();
        sleep(500);

        LOG.info("Search first item");
        searchBarPage.setSearchBar(item1);
        sleep(1000);

        LOG.info("Search shaker negru");
        searchBarPage.setShakerNegru();
        sleep(3000);
    }
}
