package OpenBrowser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RunBrowser {

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
        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("aashrarayamajhi@gmail.com");



        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();

        Thread.sleep(3000);

        wd.findElement(By.name("password")).sendKeys("");

        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();

        Thread.sleep(5000);

        //wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("aashrarayamajhi@gmail.com");

        //wait for 5 sec
        //Thread.sleep(5000);



        //Close browser
        wd.quit();

    }


   // @Test
    public void openInternetExplorer() throws InterruptedException {


        //set chrome browser driver instance

        System.setProperty("webdriver.IEdriver", "IEdriver.exe");

        //create ChromeDriver Instance
        WebDriver wd = new InternetExplorerDriver();

        //Open browser
        wd.get("http://www.gmail.com");

        //Maximize browser
        wd.manage().window().maximize();
        //wd.findElement(By.id("identifierId")).sendKeys("aashrarayamajhi@gmail.com");


        //wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("aashrarayamajhi@gmail.com");

        //wait for 5 sec
        Thread.sleep(5000);

    }


    }

//    @Test
//    public void openFirefoxBrowser() throws InterruptedException {
//
//        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//
//        //create ChromeDriver Instance
//        WebDriver wd1= new FirefoxDriver();
//
//        //Open browser
//        wd1.get("http://www.gmail.com");
//
//        //Maximize browser
//        wd1.manage().window().maximize();
//
//        //wait for 5 sec
//        Thread.sleep(5000);
//
//       // Close browser
//        wd1.quit();


