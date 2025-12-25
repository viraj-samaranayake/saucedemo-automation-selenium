package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private final By username = By.name("user-name");
    private final By password = By.name("password");
    private final By loginBtn = By.name("login-button");
    private final By errorMsg = By.xpath("//h3[text() = 'Epic sadface: Username and password do not match any user in this service']");

    public void setUsername(String un){
        driver.findElement(username).sendKeys(un);
    }

    public void setPassword(String pw){
        driver.findElement(password).sendKeys(pw);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public String getErrorMsg() {
        return driver.findElement(errorMsg).getText();
    }
}
