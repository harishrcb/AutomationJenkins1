package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstAutomationTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }
    @Test
    public void loginTest(){
        driver.get("https://www.letskodeit.com/practice");
        Assert.assertTrue(driver.getTitle().contains("Practice Page"),"Title not matched");
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
