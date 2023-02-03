package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.TouchScreen;
import pages.homePage;
import pages.registerTest;

public class loginPageTest {

    private WebDriver driver;
    homePage homePageT;
    registerTest  registerTestT;

    @Before
    public void setUp() throws Exception {
        homePageT = new homePage(driver);
        driver = homePageT.chromeDriverConnection();
        homePageT.visit("https://www.advantageonlineshopping.com/#/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void PageRegister() throws InterruptedException {
        homePageT.createAccount();
    }

    @Test
    public void Register() throws InterruptedException {
        registerTestT = new  registerTest(driver);
        homePageT.createAccount();
        Thread.sleep(2000);
        registerTestT.Register("fabian","fabi1@gmail.com","Qwe1234","Qwe1234");
    }
}
