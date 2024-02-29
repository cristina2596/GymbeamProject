package pages.RegisterPage;

import org.openqa.selenium.By;
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

    public void createContButton() {
        LOG.info("Press 'creati-va cont'button");
        driver.findElement(creatiCont).click();
    }

    public void acceptConsent() {
        LOG.info("Accept consent");
        driver.findElement(consent).click();
    }
}

////div[@class='block block-new-customer']//a[@class='action create primary']-locator "creativa cont"
//nu merge locatorul
//(//a[@class='action create primary'])[1]"