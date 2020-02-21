package OpenBrowser;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

    @Test
    public void openChromeBrowser() throws InterruptedException {


        //set chrome browser driver instance

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //create ChromeDriver Instance
        WebDriver wd = new ChromeDriver();

        //Open browser
        wd.get("http://www.gmail.com");


        //Maximize browser
        wd.manage().window().maximize();

        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmail.com");

        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();

        Thread.sleep(3000);

        wd.findElement(By.name("password")).sendKeys("Test@12");

        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

        //wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("");

        Thread.sleep(5000);
        WebElement text= wd.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        String expectedString= "Wrong password.Try again or click Forgot password to rest it";

        Assert.assertEquals(expectedString,text.getText());


        wd.quit();




//    @Test
//  public void openFirefoxBrowser() throws InterruptedException {
//
//        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//
//        //create ChromeDriver Instance
//        WebDriver wd1= new FirefoxDriver();
//
//        //Open browser
//        wd1.get("http://www.gmail.com");
////
////        //Maximize browser
//        wd1.manage().window().maximize();
////
////        //wait for 5 sec
//        Thread.sleep(5000);
//
//        wd1.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmai.com");
//
//        wd1.findElement(By.xpath("        wd.findElement(By.xpath(//*[@id=\"identifierNext\"]))\n")).click();
//
//        Thread.sleep(3000);
//
//        wd1.findElement(By.name("password")).sendKeys("Test@123");
//
//        wd1.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
//
//        Thread.sleep(3000);
////
////       // Close browser
//       wd1.quit();



        }
}
