package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioClass {

    @Test
    public void openChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("http://demo.guru99.com/test/radio.html");

        WebElement radio1= wd.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
        WebElement radio2= wd.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));


        radio1.click();
        System.out.println("Radio button option 1 is selected");

        Thread.sleep(3000);

        radio2.click();
        System.out.println("Radio Button 2 is selected");

        Thread.sleep(3000);

        WebElement option1= wd.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));
        WebElement option2= wd.findElement(By.xpath("//*[@id=\"vfb-6-1\"]"));

        option1.click();
        if (option1.isSelected()) {
            System.out.println("Option 1 is selected");
        }
        else {
            System.out.println("Option 2 is selected");
        }

        Thread.sleep(3000);


        wd.quit();
    }
}
