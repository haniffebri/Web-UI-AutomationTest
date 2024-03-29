package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPage {

    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String Password){
        driver.findElement(passwordInputText).sendKeys(Password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void validateErrorAppear(String errorMessages){
        assertTrue(driver.getPageSource().contains(errorMessages));
    }
}
