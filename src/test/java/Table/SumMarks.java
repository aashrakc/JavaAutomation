package Table;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class SumMarks {
    WebDriver wd;
    @Before
    public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");


    }

            @Test
          public void SumTable(){


            double sum = 0.00;
            double expected = 90.35;


                List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
            for (WebElement row : rows) {
                double no = Double.parseDouble(row.getText());
                sum = sum + no;
            }


            Assert.assertEquals(sum, expected, 2);
            // delta is the 2 decimal place value

        }

          @After
                public void exit () {
        wd.quit();
        }

    }

