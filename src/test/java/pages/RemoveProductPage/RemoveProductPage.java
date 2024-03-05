package pages.RemoveProductPage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RemoveProductPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RemoveProductPage.class);
    public static RemoveProductPage instance;

    private RemoveProductPage() {

    }

    public static RemoveProductPage getInstance() {
        if (instance == null) {
            instance = new RemoveProductPage();
        }
        return instance;

    }

    private By fitnessClothes = By.xpath("//span[.='Îmbrăcăminte fitness']");
    private By fitnessLeggings = By.xpath("//a[@title='Colanți pentru femei Scrunch Black - GymBeam']");
    private By sizeDropdown = By.xpath("//select[@class='super-attribute-select']");
    private By plusIcon = By.xpath("//div[@class='action-plus']");
    private By addToCart = By.id("product-addtocart-button");
    private By confirmationMessage = By.xpath("//div[@class='message-success success message']/div[contains(.,'Ați adăugat Colanți pentru femei Scrunch Black - GymBeam în coșul de cumpărături')]");
    private By cartIcon = By.xpath("//span[@class='badge-wrapper']");
    private By removeItem = By.xpath("//a[@title='Eliminați elementul']");
    private By noProductsMessage = By.xpath("//div[@class='cart-empty']");
    private By aiciButton=By.xpath("//a[.='aici']");

    public void clickFitnessClothes() {
        LOG.info("Click 'fitness clothes ' category");
        driver.findElement(fitnessClothes).click();
    }

    public void clickFitnessLeggings() {
        LOG.info("Click 'fitness leggings' item");
        driver.findElement(fitnessLeggings).click();
    }

    public void setSizeDropdown(String size) {
        LOG.info("Select size");
        driver.findElement(sizeDropdown).click();
        driver.findElement(sizeDropdown).sendKeys(size);
        driver.findElement(sizeDropdown).sendKeys(Keys.ENTER);
    }

    public void setQuantity() {
        LOG.info("Select quantity");
        driver.findElement(plusIcon).click();
    }

    public void addToCartButton() {
        LOG.info("Click 'add to cart' button");
        driver.findElement(addToCart).click();
    }

    public boolean isConfirmationMessageDisplatyed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    public void clickCartIcon() {
        LOG.info("Go to cart ");
        driver.findElement(cartIcon).click();
    }

    public void clickRemoveItem() {
        LOG.info("Remove item from the cart");
        driver.findElement(removeItem).click();
    }
    public boolean isNoProductsInTheCartMessageDisplayed(){
        LOG.info("No products in the cart message displayed");
        return driver.findElement(noProductsMessage).isDisplayed();
    }
    public void clickAiciButton(){
        LOG.info("Click 'aici' button");
        driver.findElement(aiciButton).click();
    }

}
