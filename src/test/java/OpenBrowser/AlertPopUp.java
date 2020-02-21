package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

    @Test
    public void openChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("http://mail.rediff.com/cgi-bin/login.cgi");

        wd.findElement(By.name("proceed")).click();

        Thread.sleep(5000);

        //switching to that alert
        Alert alert= wd.switchTo().alert();

        //display alert message
        System.out.println(alert.getText());


        String text=alert.getText();

        if (text.equals("Please enter a valid user name")) {
            System.out.println("correct alert message");
        }
           else{
               System.out.println("incorrect alert");
        }

        alert.accept();//click on ok button

        //alert.dismiss();//cancel


        //wd.switchTo();

    }

}
