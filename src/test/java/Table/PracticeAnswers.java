package Table;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAnswers {

    @Test
    public void openChromeBrowser() throws InterruptedException {


        //set chrome browser driver instance

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //create ChromeDriver Instance
        WebDriver wd = new ChromeDriver();

        //Open browser
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");


        //Maximize browser
        wd.manage().window().maximize();
        String before_xpath = "//*[@id=\"main\"]/div[6]/table/tbody/tr[";
        String after_xpath = "]/td[2]";

        for (int i = 2; i <= 6; i++) {
            String name = wd.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println(name);
        }

        wd.quit();

    }
}
