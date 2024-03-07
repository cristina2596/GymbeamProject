package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);


    @Test
    public void searchBarTest() {
        String item1 = "shaker";
        String item2 = "fier";
        sleep(6000);
        LOG.info("Consent");
        registerPage.acceptConsent();
        sleep(2500);

        LOG.info("Search first item");
        searchBarPage.setSearchBar(item1);
        sleep(2000);



        LOG.info("Search shaker negru");
        searchBarPage.setShakerNegru();
        sleep(1000);

        LOG.info("Add shaker to cart");
        searchBarPage.addShakerToCart();
        sleep(3000);

        LOG.info("Verify if product is added to the cart");
        Assert.assertTrue(searchBarPage.verifyConfirmationMessage(), "Product is added to the cart");
        sleep(2000);

        LOG.info("Search item 2");
        searchBarPage.searchBarItem2(item2);
        sleep(3000);

        LOG.info("Item 2 page");
        searchBarPage.searchFier();
        sleep(1000);

        LOG.info("Add item2 to the cart");
        searchBarPage.addFierToCart();
        sleep(3000);

        LOG.info("Item 2 added to the cart confirmation message");
        Assert.assertTrue(searchBarPage.fierConfirmationMessage(),"The item is addded to the cart");
        sleep(2000);

        LOG.info("Click cart icon");
        removeProductPage.clickCartIcon();
        sleep(2000);

        LOG.info("Verify if summary box is displayed");
        Assert.assertTrue(searchBarPage.isSummaryBoxDisplayed(),"Order summary box is displayed");
        sleep(2000);
    }
}
