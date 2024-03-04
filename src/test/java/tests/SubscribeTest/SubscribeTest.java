package tests.SubscribeTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;

public class SubscribeTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SubscribeTest.class);

    @Test
    public void subscribe() {
        String emailAddress = "jisijoh912@hidelux.com";
        sleep(1000);
        LOG.info("Consent");
        registerPage.acceptConsent();

        LOG.info("Insert email address");
        subscribePage.inputEmailAddress(emailAddress);

        LOG.info("Click 'trimite' button");
        subscribePage.clickSendButton();
        sleep(3000);

        LOG.info("Verify if 'confirmation message for subscription'  is displayed");
        Assert.assertTrue(subscribePage.confirmationMessageDisplayed(), "Confirmation message is displayed");
        sleep(3000);
    }
}