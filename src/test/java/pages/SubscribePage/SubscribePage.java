package pages.SubscribePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SubscribePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SubscribePage.class);
    public static SubscribePage instance;

    private SubscribePage() {

    }

    public static SubscribePage getInstance() {
        if (instance == null) {
            instance = new SubscribePage();
        }
        return instance;
    }

    private By inputEmail = By.id("subscriberEmail");
    private By sendButton = By.xpath("//button[@title='TRIMITE']");
    private By confirmation = By.xpath("//div[@class='message-success success message']");

    public void inputEmailAddress(String EmailSubscribe) {
        LOG.info("Insert 'email ' address");
        driver.findElement(inputEmail).sendKeys(EmailSubscribe);
    }

    public void clickSendButton() {
        LOG.info("Click 'trimite' button");
        driver.findElement(sendButton).click();
    }

    public boolean confirmationMessageDisplayed() {
        return driver.findElement(confirmation).isDisplayed();
    }


}
