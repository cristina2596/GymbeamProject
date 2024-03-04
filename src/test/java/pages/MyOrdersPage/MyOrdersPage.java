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

    public void clickHomePage() {
        LOG.info("Go to homepage");
        driver.findElement(gymBeamLogo).click();
    }
}
