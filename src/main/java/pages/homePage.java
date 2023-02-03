package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends basePage{

    public homePage(WebDriver driver) {
        super(driver);
    }
        By account = By.id("menuUserLink");
        By createAccountRegister = By.className("create-new-account");


    public void createAccount () throws InterruptedException {
        Thread.sleep(2000);
        click(account);
        Thread.sleep(2000);
        click(createAccountRegister);
    }
}
