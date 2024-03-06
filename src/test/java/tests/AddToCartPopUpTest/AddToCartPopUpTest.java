package tests.AddToCartPopUpTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class AddToCartPopUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(AddToCartPopUpTest.class);


    @Test
    public void popUpTest() {
        sleep(4000);
        LOG.info("Consent");
        registerPage.acceptConsent();
        sleep(1500);

        LOG.info("Click add to cart icon");
        addToCartPopUpPage.clickAddToCartIcon();
        sleep(5000);

        LOG.info("Select quantity");
        removeProductPage.setQuantity();
        sleep(1500);

        LOG.info("Click 'add to cart' button");
        removeProductPage.addToCartButton();
        sleep(2500);

        LOG.info("Verify if the product was added to cart");
        Assert.assertTrue(addToCartPopUpPage.isAddToCartConfirmationMessageDisplayed(),"Confirmation message is displayed");
        sleep(3000);


        LOG.info("Click cart icon");
        removeProductPage.clickCartIcon();
        sleep(2000);

        LOG.info("Verify if summary box is displayed");
        Assert.assertTrue(searchBarPage.isSummaryBoxDisplayed(),"Order summary box is displayed");
        sleep(2000);

        LOG.info("Remove item from the cart");
        removeProductPage.clickRemoveItem();


        LOG.info("No products in the cart");
        Assert.assertTrue(removeProductPage.isNoProductsInTheCartMessageDisplayed(), "No products in the cart message displayed");
        sleep(2000);

        LOG.info("Click 'aici' button");
        removeProductPage.clickAiciButton();
        sleep(1000);
    }
}