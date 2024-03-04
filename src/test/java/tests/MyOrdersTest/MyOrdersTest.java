package tests.MyOrdersTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class MyOrdersTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(MyOrdersTest.class);


    @Test
    public void myOrdersSection() {
        LOG.info("Hover 'account icon'");
        signInPage.hoverAccountIcon();

        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();

        String email = "cosmeci40@gmail.com";
        String password = "6esjFgjnJ#XVWQi";

        sleep(4000);
        LOG.info("Consent");
        registerPage.acceptConsent();

        LOG.info("Insert 'Email Login'");
        signInPage.insertEmailLogin(email);

        LOG.info("Insert 'password'login");
        signInPage.insertPasswordLogin(password);

        LOG.info("Click 'conectatiVa' button");
        signInPage.clickConectatiVa();
        sleep(5000);

        LOG.info("Click homepage logo");
        myOrdersPage.clickHomePage();
        sleep(5000);
    }
}