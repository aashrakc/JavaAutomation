package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {
    @Test
    public void openChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://html.com/input-type-file/");

        wd.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\aashr\\Desktop");


    }
}
