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

        LOG.info("Click 'personalitati si inspiratie' button");
        blogSectionPage.clickPersonalitatiSiInspiratie();

        LOG.info("Click 'Usain Bolt....' article");
        blogSectionPage.clickUsainArticle();

        LOG.info("Return to homepage");
        blogSectionPage.returnToHomePage();
        sleep(1000);
    }


}




