package Table;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FirstName {
    WebDriver wd;


    @Before
    public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://www.toolsqa.com/automation-practice-form/");

    }

    @Test
    public void FirstName() throws InterruptedException {
        Actions actions= new Actions(wd);
        actions.moveToElement(wd.findElement(By.linkText("Partial Link Test"))).build().perform();
        wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

}
