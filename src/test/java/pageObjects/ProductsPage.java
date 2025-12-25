package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    public WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    private final By pageTitle = By.cssSelector("span.title");

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }
}
