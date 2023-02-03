package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerTest extends basePage {

    public registerTest(WebDriver driver) {
        super(driver);
    }

    By userName = By.name("usernameRegisterPage");
    By email = By.name("emailRegisterPage");
    By password = By.name("passwordRegisterPage");
    By confirmPassword = By.name("confirm_passwordRegisterPage");
    By acceptCheck = By.name("i_agree");
    By buttonRegister = By.id("register_btnundefined");

    public void Register(String user, String emailName, String passwordName, String confirmName) throws InterruptedException {
        Thread.sleep(1000);
        type(user, userName);
        Thread.sleep(1000);
        type(emailName, email);
        type(passwordName, password);
        type(confirmName, confirmPassword);
        click(acceptCheck);
        click(buttonRegister);
        Thread.sleep(3000);

    }

}


