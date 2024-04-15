package pages.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.AccountRegisterPage;

import java.time.Duration;

public class Task1RegisterAccountTest {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");


        AccountRegisterPage RegisterPage = new AccountRegisterPage(driver);

        AccountPage accountPage = RegisterPage
                .enterFistName("Abdullah")
                .enterLastName("Alshaker")
                .enterEmail("Abbbb@gmail.com")
                .enterPhone("0555674561")
                .enterPass("Abbbb")
                .enterConPass("Abbbb")
                .chakeBox()
                .submin();






    }
}
