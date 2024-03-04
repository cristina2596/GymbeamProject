package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class ForgotPasswordTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(ForgotPasswordTest.class);

    @Test
    public void forgotPassword() {
        String Email = "jisijoh912@hidelux.com";
        sleep(1000);
        LOG.info("Consent");
        registerPage.acceptConsent();

        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();


        LOG.info("Click 'v-ati uitat parola' button");
        forgotPasswordPage.clickForgotPassword();

        LOG.info("Insert email");
        forgotPasswordPage.completeEmailField(Email);


        sleep(2000);

        LOG.info("Reset password");
        forgotPasswordPage.resetPasswordButton();
        sleep(3000);

        LOG.info("Verify if error message is displayed");
        Assert.assertTrue(registerPage.isErrorMessageDisplayed(), "Error message is displayed");

    }
}
