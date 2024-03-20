package pages.BlogSectionPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class BlogSectionPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BlogSectionPage.class);
    public static BlogSectionPage instance;

    private BlogSectionPage() {

    }

    public static BlogSectionPage getInstance() {
        if (instance == null) {
            instance = new BlogSectionPage();
        }
        return instance;

    }

    private By blogSection = By.xpath("//span[.='Blog']");
    private By persInspo = By.xpath("//a[.='Personalități și inspirație']");
    private By usainArticle = By.xpath("//a[contains(.,'Usain Bolt: Un sprinter jamaican care a captivat întreaga lume cu performanțele')]");
    private By logoButton = By.xpath("//img[@alt='GymBeam Blog']");

    public void clickBlogSection() {
        LOG.info("Click 'blog' button");
        driver.findElement(blogSection).click();
    }

    public void clickPersonalitatiSiInspiratie() {
        LOG.info("Click 'personalitati si inspiratie' button");
        driver.findElement(persInspo).click();
    }

    public void clickUsainArticle() {
        LOG.info("Click 'Usain Bolt....' article");
        driver.findElement(usainArticle).click();

    }

    public void returnToHomePage() {
        LOG.info("Click 'logo' button to return to homepage");
        driver.findElement(logoButton).click();
    }

}

