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

        String email = "cosmeci40@gmail.com";
        String password = "6esjFgjnJ#XVWQi";

        LOG.info("Hover 'account icon'");
        signInPage.hoverAccountIcon();

        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();
        sleep(1000);

        sleep(4000);
        LOG.info("Consent");
        registerPage.acceptConsent();

        LOG.info("Insert 'Email Login'");
        signInPage.insertEmailLogin(email);

        LOG.info("Insert 'password'login");
        signInPage.insertPasswordLogin(password);

        LOG.info("Click 'conectatiVa' button");
        signInPage.clickConectatiVa();
        sleep(4000);

        LOG.info("Click homepage logo");
        myOrdersPage.clickHomePage();
        sleep(3000);

        LOG.info("Click 'account' icon");
        myOrdersPage.clickAccountIcon();
        sleep(2000);
        LOG.info("Click 'my orders'");
        myOrdersPage.clickMyOrders();
        sleep(1000);

        LOG.info("Click 'view order'");
        myOrdersPage.clickViewOrder();
        sleep(1000);

        LOG.info("Click 'back to my orders' button");
        myOrdersPage.clickBackAction();
        sleep(1000);

        LOG.info("Click 'homepage' logo button");
        myOrdersPage.clickHomePageButton();
    }
}