package pages.MakeAnOrderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MakeAnOrderWithAccountPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(MakeAnOrderWithAccountPage.class);
    public static MakeAnOrderWithAccountPage instance;

    private MakeAnOrderWithAccountPage() {

    }

    public static MakeAnOrderWithAccountPage getInstance() {
        if (instance == null) {
            instance = new MakeAnOrderWithAccountPage();
        }
        return instance;

    }

    private By alimenteSanatoasePage = By.xpath("//nav[@class='navigation']//span[.='Alimente sănătoase']");
    private By untDeArahide = By.xpath("//div[@class='product-item-info']/a[@href='https://gymbeam.ro/unt-de-arahide-100-gymbeam.html']");
    private By weightDropdown = By.xpath("//select[@class='super-attribute-select']");
    private By flavourDropdown = By.id("attribute307");
    private By nutritieSportivaTab=By.xpath("//a[.='Nutriție sportivă']");
    private By yumBeastPink=By.xpath("//div[@class='product-item-info']/a[@href='https://gymbeam.ro/gold-standard-100-proteine-din-zer-optimum-nutrition.html']");
    private By discountCodeBox=By.id("coupon");
    private By discountApplied=By.xpath("//td[@data-th='Reducere']");
    private By submitDiscountButton=By.xpath("//button[@class='action add primary']");
    private By finishOrderButton=By.xpath("//div[@class='cart-container-bottom']//span[.='Mergeți la finalizarea comenzii']");
    private By courierButton=By.xpath("//label[@for='delivery_fancourier_delivery']");
    private By backButton=By.xpath("//div[@id='shipping-method-buttons-container']//a[contains(.,'Înapoi')]");
    private By emptyCart=By.xpath("//a[@title='Eliminați elementul']");
    private By homePage=By.xpath("//img[@alt='GymBeam s.r.o.']");

    public void clickAlimenteSanatoasePage() {
        LOG.info("Click 'Alimente sanatoase' page");
        driver.findElement(alimenteSanatoasePage).click();
    }

    public void clickUntDeArahide() {
        LOG.info("Click 'unt de arahide'");
        driver.findElement(untDeArahide).click();
    }

    public void selectWeight(String weight) {
        LOG.info("Select weight");
        driver.findElement(weightDropdown).click();
        driver.findElement(weightDropdown).sendKeys(weight);
        driver.findElement(weightDropdown).sendKeys(Keys.ENTER);
    }

    public void selectFlavour(String flavour) {
        LOG.info("Select Flavour");
        driver.findElement(flavourDropdown).click();
        driver.findElement(flavourDropdown).sendKeys(flavour);
        driver.findElement(flavourDropdown).sendKeys(Keys.ENTER);
    }

    public void clickNutritieSportivaTab(){
        LOG.info("Click 'nutritie sportiva' tab");
        driver.findElement(nutritieSportivaTab).click();
    }

    public void clickYumBestPink(){
        LOG.info("Click 'yum beast pink' product");
        driver.findElement(yumBeastPink).click();
    }

    public void selectWheyFlavour(String flavourWhey){
        LOG.info("Select whey flavour");
        driver.findElement(flavourDropdown).click();
        driver.findElement(flavourDropdown).sendKeys(flavourWhey);
        driver.findElement(flavourDropdown).sendKeys(Keys.ENTER);
    }

    public void insertCouponCode(String code){
        LOG.info("Insert coupon code");
        driver.findElement(discountCodeBox).sendKeys(code);

    }

    public boolean isDiscountCodeApplied(){
        LOG.info("Verify if discount code is applied");
        return driver.findElement(discountApplied).isDisplayed();
    }

    public void clickSubmitCode (){
        LOG.info("Click submit button");
        driver.findElement(submitDiscountButton).click();

    }
    public void clickFinishOrderButton (){
        LOG.info("Click 'finish order' button");
        driver.findElement(finishOrderButton).click();

    }

    public void clickcourierButton(){
        LOG.info("Select delivery method");
        driver.findElement(courierButton);
    }
    public void clickBackButton1(){
        LOG.info("Click 'dpd' as delivery method");
        driver.findElement(backButton).click();


    }
public void goBackToHomepage(){
        LOG.info("return to homepage");
        driver.findElement(homePage).click();
}

}

