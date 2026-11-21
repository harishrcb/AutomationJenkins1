package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstAutomationTest {

    WebDriver driver;
    @Test
    public void loginTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        Assert.assertTrue(driver.getTitle().contains("Practice Page"),"Title not matched");
    }
}
