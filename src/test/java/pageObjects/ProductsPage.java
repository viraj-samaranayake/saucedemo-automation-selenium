package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    public WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    private final By pageTitle = By.cssSelector("span.title");
    private final By hamBurgerIcon = By.cssSelector("button#react-burger-menu-btn");
    private final By logoutIcon = By.cssSelector("a#logout_sidebar_link");


    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public boolean verifyPageTitle(){
        String title = "Products";
        return title.equals(getPageTitle());
    }

    public boolean verifyUrl(){
        return driver.getCurrentUrl().contains("inventory");
    }

    public void clickHamburgerIcon(){
        driver.findElement(hamBurgerIcon).click();
    }

    public void clickLogout(){
        driver.findElement(logoutIcon).click();
    }


}
