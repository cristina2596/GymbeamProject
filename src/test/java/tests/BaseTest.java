package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.AddToCartPopUpPage.AddToCartPopUpPage;
import pages.BasePage;
import pages.BlogSectionPage.BlogSectionPage;
import pages.MakeAnOrderPage.MakeAnOrderWithAccountPage;
import pages.MyOrdersPage.MyOrdersPage;
import pages.RegisterPage.RegisterPage;
import pages.RemoveProductPage.RemoveProductPage;
import pages.SearchBarPage.SearchBarPage;
import pages.SignInPage.ForgotPasswordPage;
import pages.SignInPage.SignInPage;
import pages.SubscribePage.SubscribePage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public ForgotPasswordPage forgotPasswordPage = ForgotPasswordPage.getInstance();
    public SubscribePage subscribePage = SubscribePage.getInstance();
    public BlogSectionPage blogSectionPage = BlogSectionPage.getInstance();
    public MyOrdersPage myOrdersPage = MyOrdersPage.getInstance();
    public RemoveProductPage removeProductPage = RemoveProductPage.getInstance();
    public SearchBarPage searchBarPage = SearchBarPage.getInstance();
    public AddToCartPopUpPage addToCartPopUpPage = AddToCartPopUpPage.getInstance();
    public MakeAnOrderWithAccountPage makeAnOrderWithAccountPage = MakeAnOrderWithAccountPage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUP();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}