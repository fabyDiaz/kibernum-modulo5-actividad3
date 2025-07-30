package cl.kibernumacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{
    private WebDriver driver;

    //localizadores
    private By usernameField =  By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By welcomeMessage = By.id("message");
    

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void ingresarUserName(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void ingresarPasword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public String getWelcomeMessage(){
        return driver.findElement(welcomeMessage).getText();
    }

    public void login(String username, String password){
        ingresarUserName(username);
        ingresarPasword(password);
        clickLoginButton();
    }
}