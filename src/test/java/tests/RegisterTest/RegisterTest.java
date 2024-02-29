package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    @Test
    public void register() {
        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();

        sleep(3000L);

        LOG.info("Click consent");
        registerPage.acceptConsent();


        sleep(3000L);

        LOG.info("Click 'creati-va un cont' button");
        registerPage.createContButton();


    }


}
