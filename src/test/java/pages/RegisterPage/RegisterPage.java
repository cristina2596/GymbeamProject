package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By creatiCont = By.xpath("//div[@class='block block-new-customer']//a[@class='action create primary']");
    private By consent = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private By prenumeBox = By.id("firstname");
    private By numeBox = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By passwordConfimation = By.id("password-confirmation");
    private By dateOfBirth = By.id("dob");
    private By genderDropdownBox = By.id("gender");
    private By createAccountButton = By.xpath("//button[@class='action submit primary']");
    private By errorMessage=By.xpath("//div[@class='message-error error message']");


    public void createContButton() {
        LOG.info("Press 'creati-va cont'button");
        driver.findElement(creatiCont).click();
    }

    public void acceptConsent() {
        LOG.info("Accept consent");
        driver.findElement(consent).click();
    }

    public void fillPrenumeBox(String prenume) {
        LOG.info("Insert prenume");
        driver.findElement(prenumeBox).sendKeys(prenume);
    }

    public void fillNumeBox(String nume) {
        LOG.info("Insert nume");
        driver.findElement(numeBox).sendKeys(nume);
    }

    public void fillEmailField(String email) {
        LOG.info("Insert email address");
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillPasswordField(String password) {
        LOG.info("Insert password");
        driver.findElement(passwordField).sendKeys(password);
    }

    public void fillPasswordConfirmation(String passwordConfirmation) {
        LOG.info("Insert password confirmation");
        driver.findElement(passwordConfimation).sendKeys(passwordConfirmation);
    }

    public void setDateOfBirth(String date) {
        LOG.info("Selecting date of birth");
        driver.findElement(dateOfBirth).click();
        driver.findElement(dateOfBirth).sendKeys(date);
        driver.findElement(dateOfBirth).sendKeys(Keys.ENTER);

    }

    public void setGender(String gender) {
        LOG.info("Selecting gender");
        driver.findElement(genderDropdownBox).click();
        driver.findElement(genderDropdownBox).sendKeys(gender);
        driver.findElement(genderDropdownBox).sendKeys(Keys.ENTER);
    }
    public void clickCreateAccount(){
        LOG.info("Click create account");
        driver.findElement(createAccountButton).click();
    }
    public boolean isErrorMessageDisplayed(){
        LOG.info("error message");
        return driver.findElement(errorMessage).isDisplayed();
    }
}

