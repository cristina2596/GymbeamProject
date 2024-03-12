package pages.AddToCartPopUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class AddToCartPopUpPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AddToCartPopUpPage.class);
    public static AddToCartPopUpPage instance;

    private AddToCartPopUpPage() {

    }

    public static AddToCartPopUpPage getInstance() {
        if (instance == null) {
            instance = new AddToCartPopUpPage();
        }
        return instance;

    }

    private By addToCartIcon = By.xpath("/html/body/div[4]/main/div/div/div/div[4]/div/div/div/div/div/div/ol/li[6]/div/div[1]/div[2]/div/form/button");
    private By addToCartConfirmation = By.xpath("//div[@class='message-success success message']");

    public void clickAddToCartIcon() {
        LOG.info("Click add to cart icon");
        driver.findElement(addToCartIcon).click();

    }

    public boolean isAddToCartConfirmationMessageDisplayed() {
        LOG.info("Is confirmation message displayed for add product to cart");
        return driver.findElement(addToCartConfirmation).isDisplayed();


    }

}