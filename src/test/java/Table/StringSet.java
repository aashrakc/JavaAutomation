package Table;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StringSet {


    WebDriver wd;

    //@Before
    public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");

    }

   // @Test
    public void String() {
        //List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));

        //*[@id="main"]/div[6]/table/tbody/tr[2]/td[2]
        //*[@id="main"]/div[6]/table/tbody/tr[3]/td[2]
        //*[@id="main"]/div[6]/table/tbody/tr[4]/td[2]
        //*[@id="main"]/div[6]/table/tbody/tr[5]/td[2]
        //*[@id="main"]/div[6]/table/tbody/tr[6]/td[2]

        String before_xpath = "//*[@id=\"main\"]/div[6]/table/tbody/tr[";
        String after_xpath = "]/td[2]";

        for (int i = 2; i <= 6; i++) {
            String name = wd.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println(name);
        }
    }
    @After
         public void happy(){
    wd.quit();
    }
}











