package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    String prenume = "Matilda";
    String nume = "Soare";
    String email = "jisijoh912@hidelux.com";
    String password = "Casdja232o#";
    String passwordConfirmation = "Casdja232o#";
    String date = "23.04.1995";
    String gender = "Feminin";

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

        LOG.info("Fill prenume box");
        registerPage.fillPrenumeBox(prenume);

        LOG.info("Fill nume box");
        registerPage.fillNumeBox(nume);

        LOG.info("Fill email address");
        registerPage.fillEmailField(email);

        LOG.info("Fill passowrd field");
        registerPage.fillPasswordField(password);

        LOG.info("Fill password confirmation field");
        registerPage.fillPasswordConfirmation(passwordConfirmation);

        LOG.info("Selecting date of birth");
        registerPage.setDateOfBirth(date);

        LOG.info("Selecting gender");
        registerPage.setGender(gender);

        LOG.info("Click create account");
        registerPage.clickCreateAccount();

        sleep(2000);

        LOG.info("Verify if Error message displayed");
        Assert.assertTrue(registerPage.isErrorMessageDisplayed(), "Error message is displayed");

        sleep(5000);
    }


}
