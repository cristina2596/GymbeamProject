package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    @Test
    public void register() {
        LOG.info("Click 'account' icon");
        signInPage.clickAccountIcon();

//        LOG.info("Click 'creati-va un cont' button");
//        registerPage.createContButton();


    }


}
