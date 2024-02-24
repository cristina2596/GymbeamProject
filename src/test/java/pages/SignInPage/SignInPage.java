package pages.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;



    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }



    private By accountIcon = By.xpath("//label[@class=\"user-dropnav\"]");


    public void hoverAccountIcon() {

        Actions actions = new Actions(driver);
        LOG.info("Hover 'account' icon");
        WebElement hoverAccountIcon= driver.findElement(accountIcon);
        actions.moveToElement(hoverAccountIcon).perform();
    }


}