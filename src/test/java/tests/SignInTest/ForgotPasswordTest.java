package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ForgotPasswordTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(ForgotPasswordTest.class);

    @Test
    public void forgotPassword() {
        String Email = "jisijoh912@hidelux.com";
        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();

        LOG.info("Click 'v-ati uitat parola' button");
        forgotPasswordPage.clickForgotPassword();

        LOG.info("Insert email");
        forgotPasswordPage.completeEmailField(Email);


        LOG.info("Reset password");
        forgotPasswordPage.resetPasswordButton();
//nu merge butonul reseteaza parola.
    }
}
