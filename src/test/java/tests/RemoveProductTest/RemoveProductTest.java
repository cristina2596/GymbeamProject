package tests.RemoveProductTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class RemoveProductTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RemoveProductTest.class);


    @Test
    public void removeProduct() {
        String size = "L";

        sleep(5000);
        LOG.info("Consent");
        registerPage.acceptConsent();
        sleep(3000);

        LOG.info("Click 'fitness clothes' category");
        removeProductPage.clickFitnessClothes();
        sleep(2000);

        LOG.info("Click 'fitness leggings' item");
        removeProductPage.clickFitnessLeggings();
        sleep(3000);

        LOG.info("Select size");
        removeProductPage.setSizeDropdown(size);
        sleep(3500);

        LOG.info("Select quantity");
        removeProductPage.setQuantity();
        sleep(1500);

        LOG.info("Click 'add to cart' button");
        removeProductPage.addToCartButton();
        sleep(3000);

        LOG.info("Verify if confirmation message is displayed");
        Assert.assertTrue(removeProductPage.isConfirmationMessageDisplatyed(), "Confirmation message is displayed");
        sleep(3000);

        LOG.info("Click cart icon");
        removeProductPage.clickCartIcon();
        sleep(3000);

        LOG.info("Remove item from the cart");
        removeProductPage.clickRemoveItem();
        sleep(4000);

        LOG.info("No products in the cart");
        Assert.assertTrue(removeProductPage.isNoProductsInTheCartMessageDisplayed(), "No products in the cart message displayed");
        sleep(4000);

        LOG.info("Click 'aici' button");
        removeProductPage.clickAiciButton();
        sleep(2000);
    }
}