package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigation {

    @Test
    public void openChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);


        wd.get("https://www.googl.com");
        wd.navigate().to("http://www.amazon.com");
        wd.navigate().back();//googgle page
        Thread.sleep(2000);
        wd.navigate().forward();//amazon
        Thread.sleep(2000);
        wd.navigate().back();
        Thread.sleep(2000);
        wd.navigate().refresh();

        wd.quit();








    }
}
