package OpenBrowser;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

    @Before



    @Test
    public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().deleteAllCookies();

        wd.get("https://jqueryui.com/droppable/");

        wd.switchTo().frame(0);// switch to frame if it is present

        Actions actions= new Actions(wd);

        actions.clickAndHold(wd.findElement(By.xpath("//*[@id=\"draggable\"]/p")))
                .moveToElement(wd.findElement(By.xpath("//*[@id=\"droppable\"]")))
                .release()
                .build()
                .perform();

        Thread.sleep(3000);

        wd.quit();

            }
        }







