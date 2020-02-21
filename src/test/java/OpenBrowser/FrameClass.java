package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {
    @Test
    public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("http://www.freecrm.com/");
        wd.manage().window().maximize();
        wd.manage().deleteAllCookies();

        wd.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
        //wd.switchTo().frame()




    }
}
