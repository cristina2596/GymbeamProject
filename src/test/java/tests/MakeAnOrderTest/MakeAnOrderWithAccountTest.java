package tests.MakeAnOrderTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class MakeAnOrderWithAccountTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(MakeAnOrderWithAccountTest.class);


    @Test
    public void orderWithAccount() {
        String weight = "340";
        String flavour = "crocant";
        String wheyFlavour = "strawberry";
        String code="andra5";

        LOG.info("Hover 'account icon'");
        signInPage.hoverAccountIcon();

        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();
        sleep(4000);


        String email = "cosmeci40@gmail.com";
        String password = "6esjFgjnJ#XVWQi";

        sleep(4000);
        LOG.info("Consent");
        registerPage.acceptConsent();

        LOG.info("Insert 'Email Login'");
        signInPage.insertEmailLogin(email);

        LOG.info("Insert 'password'login");
        signInPage.insertPasswordLogin(password);
        sleep(1500);

        LOG.info("Click 'conectatiVa' button");
        signInPage.clickConectatiVa();
        sleep(1500);


        LOG.info("Verify if 'logo home page' button is displayed");
        Assert.assertTrue(signInPage.islogoHomePageDisplayed(), "Logo home page button is displayed");

        sleep(3000);

        LOG.info("Click 'Alimente sanatoase' Page");
        makeAnOrderWithAccountPage.clickAlimenteSanatoasePage();
        sleep(1500);

        LOG.info("Click 'unt de arahide'");
        makeAnOrderWithAccountPage.clickUntDeArahide();
        sleep(1000);

        LOG.info("Select weight");
        makeAnOrderWithAccountPage.selectWeight(weight);
        sleep(1500);

        LOG.info("Select flavour");
        makeAnOrderWithAccountPage.selectFlavour(flavour);
        sleep(1500);

        LOG.info("Click 'add to cart' button");
        removeProductPage.addToCartButton();
        sleep(3000);

        LOG.info("Click 'nutritie sportiva' tab");
        makeAnOrderWithAccountPage.clickNutritieSportivaTab();
        sleep(1500);

        LOG.info("Click 'yum beast pink' product");
        makeAnOrderWithAccountPage.clickYumBestPink();
        sleep(500);

        LOG.info("Select whey flavour");
        makeAnOrderWithAccountPage.selectWheyFlavour(wheyFlavour);
        sleep(500);

        LOG.info("Click 'add to cart' button");
        removeProductPage.addToCartButton();
        sleep(3000);

        LOG.info("Click cart icon");
        removeProductPage.clickCartIcon();
        sleep(2000);

        LOG.info("Insert coupon code");
        makeAnOrderWithAccountPage.insertCouponCode(code);
        sleep(3000);

        LOG.info("Submit code button");
        makeAnOrderWithAccountPage.clickSubmitCode();
        sleep(5000);

        LOG.info("Verify if discount code is applied");
        Assert.assertTrue(makeAnOrderWithAccountPage.isDiscountCodeApplied(),"Discount code is applied");
        sleep(3000);

        LOG.info("Click 'finish order' button");
        makeAnOrderWithAccountPage.clickFinishOrderButton();
        sleep(2000);

        LOG.info("Click dpd radio button");
        makeAnOrderWithAccountPage.clickDPDradioButton();
        sleep(1000);

        LOG.info("Click 'continue' button");
        makeAnOrderWithAccountPage.clickContinueButton();
        sleep(2000);
    }
}