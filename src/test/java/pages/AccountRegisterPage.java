package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountRegisterPage {

    By FirstName = By.id("input-firstname");
    By LastName = By.id("input-lastname");
    By E_Mail = By.id("input-email");
    By Telephone = By.id("input-telephone");
    By Password = By.id("input-password");
    By PasswordConfirm = By.id("input-confirm");
    By chakeBox = By.xpath("//label[@for='input-agree']");
    By submint = By.xpath("//input[@value='Continue']");

    WebDriver driver;

    public AccountRegisterPage(WebDriver driver){
        this.driver =driver;
    }


    public AccountRegisterPage enterFistName (String name){
        driver.findElement(FirstName).sendKeys(name);
        return this;
    }

    public AccountRegisterPage enterLastName (String Lname){
        driver.findElement(LastName).sendKeys(Lname);
        return this;
    }

    public AccountRegisterPage enterEmail (String mail){
        driver.findElement(E_Mail).sendKeys(mail);
        return  this;

    }

    public AccountRegisterPage enterPhone (String Phone){
        driver.findElement(Telephone).sendKeys(Phone);
        return this;
    }

    public  AccountRegisterPage enterPass(String Pass){
        driver.findElement(Password).sendKeys(Pass);
        return this;
    }

    public  AccountRegisterPage enterConPass(String ConPass){
        driver.findElement(PasswordConfirm).sendKeys(ConPass);
        return this;
    }

    public AccountRegisterPage chakeBox (){
        driver.findElement(chakeBox).click();
        return this;
    }

    public AccountPage submin (){
        driver.findElement(submint).click();
        return new AccountPage(driver);
    }





}
