package tests.BlogSectionTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class BlogSectionTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(BlogSectionTest.class);


    @Test
    public void blogSection() {
        sleep(2000);

        LOG.info("Consent");
        registerPage.acceptConsent();
        sleep(2000);

        LOG.info("Click 'blog'button");
        blogSectionPage.clickBlogSection();
        sleep(1000);

        LOG.info("Click 'personalitati si inspiratie' button");
        blogSectionPage.clickPersonalitatiSiInspiratie();
        sleep(500);

        LOG.info("Click 'Usain Bolt....' article");
        blogSectionPage.clickUsainArticle();
        sleep(700);

        LOG.info("Return to homepage");
        blogSectionPage.returnToHomePage();
        sleep(1000);
    }

}




