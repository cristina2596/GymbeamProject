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
    private By emailLogin = By.id("email");
    private By passwordLogin = By.id("pass");
    private By conectati = By.xpath("//*[@id=\"send2\"]\n");
    private By logoHomePage = By.xpath("//a[@class='logo no-lozad']");

    public void hoverAccountIcon() {

        Actions actions = new Actions(driver);
        LOG.info("Hover 'account' icon");
        WebElement hoverAccountIcon = driver.findElement(accountIcon);
        actions.moveToElement(hoverAccountIcon).perform();
    }

    public void clickAccountIcon() {
        LOG.info("Click 'account' icon");
        driver.findElement(accountIcon).click();
    }

    public void insertEmailLogin(String EmailLogin) {
        LOG.info("Insert 'email login' address");
        driver.findElement(emailLogin).sendKeys(EmailLogin);
    }

    public void insertPasswordLogin(String PasswordLogin) {
        LOG.info("Insert 'password login'");
        driver.findElement(passwordLogin).sendKeys(PasswordLogin);
    }

    public void clickConectatiVa() {
        LOG.info("Click 'conectatiVa' button");
        driver.findElement(conectati).click();
    }

    public boolean islogoHomePageDisplayed() {
        LOG.info("Verify if 'logo home page'button is displayed");
        return driver.findElement(logoHomePage).isDisplayed();
    }
}