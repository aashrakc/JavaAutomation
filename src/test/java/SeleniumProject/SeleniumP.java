package SeleniumProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumP {


    WebDriver wd;


    @Before
    public void openFireFoxBrowser() throws InterruptedException {

        System.setProperty("webdriver.firefox driver", "geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.get("http://www.demo.guru99.com/V4/");

    }
    @Test
    public void openFirefoxbrowser1() throws InterruptedException {
         wd.findElement(By.name("uid")).sendKeys("test.world25ford@gmail.com");
         Thread.sleep(3000);

         wd.findElement(By.name("password")).sendKeys("Happy1234?");
         Thread.sleep(3000);

         wd.findElement(By.name("btnLogin")).click();
         Thread.sleep(2000);

         wd.quit();


    }
}
