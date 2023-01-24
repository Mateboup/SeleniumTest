package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class basePage {

    WebDriver driver;

    public  basePage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void scrollDown(By locator){
        driver.findElement(locator).sendKeys(Keys.DOWN);
        driver.findElement(locator).sendKeys(Keys.RETURN);}


    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public String getText (WebElement element){
        return element.getText();
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }
    //para escribir
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void visit(String url){
        driver.get(url);
    }


}
