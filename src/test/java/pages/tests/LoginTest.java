package pages.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListLoginPage;

import java.time.Duration;

public class LoginTest {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        ContactListLoginPage loginPage = new ContactListLoginPage(driver);
       //loginPage.enterEmail("sdatest@tester.com");
       //loginPage.enterPass("tester.123");
       //loginPage.submit();

        loginPage
                .enterEmail("sdatest@tester.com")
                .enterPass("tester.123")
                .submit()
                .logoutBotton();
    }

}
