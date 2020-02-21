package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessDropDown {

    @Test
    public void openChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver wd = new ChromeDriver();
//        wd.get("http://demo.guru99.com/test/newtours/register.php");
//
//        Select dropCountry= new Select(wd.findElement(By.name("country")));
//        //Thread.sleep(3000);
//        dropCountry.selectByVisibleText("ANTARTICA");


        wd.get("http://jsbin.com/osebed/2");
        Select fruits= new Select(wd.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        //fruits.selectByIndex(0);
        Thread.sleep(3000);

        wd.quit();








    }
}
