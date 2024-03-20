package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ForgotPasswordPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ForgotPasswordPage.class);
    public static ForgotPasswordPage instance;

    private ForgotPasswordPage() {

    }

    public static ForgotPasswordPage getInstance() {
        if (instance == null) {
            instance = new ForgotPasswordPage();
        }
        return instance;
    }

    private By fortgotPassword = By.xpath("//a[@class='action remind']");
    private By emailField = By.xpath("//input[@alt='email']");
    private By resetPassword = By.xpath("//div[@class='primary']//button[@class='action submit primary']");

    public void clickForgotPassword() {
        LOG.info("Click' v-ati uitat parola' button");
        driver.findElement(fortgotPassword).click();
    }

    public void completeEmailField(String Email) {
        LOG.info("Complete e-mail field");
        driver.findElement(emailField).sendKeys(Email);

    }

    public void resetPasswordButton() {
        LOG.info("Click 'reseteaza parola' button");
        driver.findElement(resetPassword).click();
    }
}


