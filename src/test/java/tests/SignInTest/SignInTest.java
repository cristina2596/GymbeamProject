package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {
//correct id & password-TEST

        LOG.info("Hover 'account icon'");
        signInPage.hoverAccountIcon();

        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();

        String email = "cosmeci40@gmail.com";
        String password = "6esjFgjnJ#XVWQi";

        LOG.info("Insert 'Email Login'");
        signInPage.insertEmailLogin(email);

        LOG.info("Insert 'password'login");
        signInPage.insertPasswordLogin(password);

        LOG.info("Click 'conectatiVa' button");
        signInPage.clickConectatiVa();

    }
}