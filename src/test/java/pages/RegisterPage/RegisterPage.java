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

    private By creatiCont = By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span");


    public void createContButton() {
        LOG.info("Press 'creati-va cont'button");
        driver.findElement(creatiCont).click();
    }


}

////div[@class='block block-new-customer']//a[@class='action create primary']-locator "creativa cont"
//nu merge locatorul