package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListHomePage {

    WebDriver driver;
    By logoutById = By.id("logout");
    public ContactListHomePage(WebDriver driver){

        this.driver = driver;
    }

    public void logoutBotton (){
        driver.findElement(logoutById).click();
    }





}
