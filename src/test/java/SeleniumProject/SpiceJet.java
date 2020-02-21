package SeleniumProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {
    WebDriver wd;


    @Before
    public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://www.spicejet.com/");

    }
    @Test
    public void openChromeBrowser1() throws InterruptedException {

       // wd.findElement(B)

    }
}
