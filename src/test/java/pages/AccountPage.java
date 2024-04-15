package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    By Conyinu = By.xpath("//a[@class='btn btn-primary']");

    WebDriver driver;

    public AccountPage (WebDriver driver){
        this.driver=driver;
    }

public AccountPage (){
        driver.findElement(Conyinu).click();
}


}
