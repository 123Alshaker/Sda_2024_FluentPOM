package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListLoginPage {

    WebDriver driver;
    By emailById = By.id("email");
    By passwordById = By.id("password");
    By submitById = By.id("submit");
    public ContactListLoginPage(WebDriver driver){

        this.driver = driver;
    }

    public ContactListLoginPage enterEmail(String email){
        driver.findElement(emailById).sendKeys(email);
        return this;
    }

    public ContactListLoginPage enterPass(String password){
        driver.findElement(passwordById).sendKeys(password);
        return this;
    }

    public ContactListHomePage submit(){
        driver.findElement(submitById).click();
        return new ContactListHomePage(driver);
    }



}
