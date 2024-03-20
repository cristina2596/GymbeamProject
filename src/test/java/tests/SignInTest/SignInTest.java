package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);


    @Test
    public void signIn() {
        String email = "cosmeci40@gmail.com";
        String password = "6esjFgjnJ#XVWQi";

        LOG.info("Hover 'account icon'");
        signInPage.hoverAccountIcon();

        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();
        sleep(4000);

        LOG.info("Consent");
        registerPage.acceptConsent();
        sleep(1500);

        LOG.info("Insert 'Email Login'");
        signInPage.insertEmailLogin(email);
        sleep(1500);

        LOG.info("Insert 'password'login");
        signInPage.insertPasswordLogin(password);
        sleep(1500);

        LOG.info("Click 'conectatiVa' button");
        signInPage.clickConectatiVa();
        sleep(1500);


        LOG.info("Verify if 'logo home page' button is displayed");
        Assert.assertTrue(signInPage.islogoHomePageDisplayed(), "Logo home page button is displayed");
        sleep(3000);
    }
}