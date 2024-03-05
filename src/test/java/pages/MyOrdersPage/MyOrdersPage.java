package pages.MyOrdersPage;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MyOrdersPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(MyOrdersPage.class);
    public static MyOrdersPage instance;

    private MyOrdersPage() {

    }

    public static MyOrdersPage getInstance() {
        if (instance == null) {
            instance = new MyOrdersPage();
        }
        return instance;

    }

    private By gymBeamLogo = By.xpath("//img[@alt='GymBeam s.r.o.']");
    private By accountIcon = By.xpath("//a[@title='Autentificare']");
    private By myOrders = By.xpath("//li[.='Comenzile mele']");
    private By viewOrder = By.xpath("//a[@href='https://gymbeam.ro/sales/order/view/order_id/28589554/']/span[.='Vedeți comanda']");
    private By backAction = By.xpath("//a[@class='action back']");
    private By goHomePage = By.xpath("//img[@alt='GymBeam s.r.o.']");

    public void clickHomePage() {
        LOG.info("Go to homepage");
        driver.findElement(gymBeamLogo).click();
    }

    public void clickAccountIcon() {
        driver.findElement(accountIcon).click();
    }

    public void clickMyOrders() {
        driver.findElement(myOrders).click();
    }

    public void clickViewOrder() {
        driver.findElement(viewOrder).click();
    }

    public void clickBackAction() {
        driver.findElement(backAction).click();


    }
    public void clickHomePageButton() {
            driver.findElement(goHomePage).click();
    }
}
