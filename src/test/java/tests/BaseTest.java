package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.ForgotPasswordPage;
import pages.SignInPage.SignInPage;
import pages.SubscribePage.SubscribePage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public ForgotPasswordPage forgotPasswordPage = ForgotPasswordPage.getInstance();
    public SubscribePage subscribePage = SubscribePage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUP();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}