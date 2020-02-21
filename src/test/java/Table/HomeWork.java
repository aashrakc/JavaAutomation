package Table;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    WebDriver wd;


    @Before
    public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://www.toolsqa.com/automation-practice-form/");

    }

    @Test
    public void FirstName() throws InterruptedException {

        wd.findElement(By.name("firstname")).sendKeys("Aashra");
        Thread.sleep(2000);


       //@Test
        //public void LastName() throws InterruptedException{
            wd.findElement(By.id("lastname")).sendKeys("kc");
            Thread.sleep(2000);

           wd.quit();
        }

        @Test
    public void Female() throws InterruptedException {
            JavascriptExecutor js = (JavascriptExecutor) wd;
            js.executeScript("window.scrollBy(0,800)");
//
            //wd.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
            WebElement radio = wd.findElement(By.xpath("//*[@id=\"sex-1\"]"));

            Actions action = new Actions(wd);
            action.moveToElement(radio).click().build().perform();
            Thread.sleep(5000);
        }

       //6. Year of experience should be 5 only
            @Test
            public void Year () throws InterruptedException{
            JavascriptExecutor js= (JavascriptExecutor) wd;
            js.executeScript("window.scrollBy(0,800)");
            WebElement radio2=wd.findElement(By.xpath("//*[@id=\"exp-4\"]"));
            Actions actions=new Actions(wd);
            actions.moveToElement(radio2).click().build().perform();
            Thread.sleep(3000);


            //7.put date of todays date,read system date

                DateFormat dateFormat= new SimpleDateFormat("MM/DD/YYYY");
                Date date2= new Date();

                String today= dateFormat.format(date2);
                 wd.findElement(By.id("datepicker")).sendKeys(today);
                 Thread.sleep(3000);






//                    WebElement datebox= wd.findElement(By.xpath("//*[@id=\\\"datepicker\\"));
//                    datebox.sendKeys("02202020");
//                    datebox.sendKeys(Keys.TAB);
//                    Thread.sleep(3000);




//                wd.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("2/19/2020");
//                Thread.sleep(5000);

                //8.Proffesional should be manaual and automation both

               WebElement target= wd.findElement(By.id("profession-0"));
               target.click();

               WebElement arrangement= wd.findElement(By.id("profession-1"));
               arrangement.click();

               wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

               //wd.quit();


               //9. Browse a pic and verify the file that has been attached



                //10.Verify download links for both links(for selenium automation hybrid framework)

                String expected="Selenium Automation Hybrid Framework";
                String actual= wd.findElement(By.linkText("Selenium Automation Hybrid Framework")).getText();
                Thread.sleep(3000);
                System.out.println(actual);
                Assert.assertEquals(actual,expected);

                String expect= "Test File to Download";
                String actuals= wd.findElement(By.linkText("Test File to Download")).getText();
                Thread.sleep(3000);
                Assert.assertEquals(expect,actuals);

                //2nd way;

//                WebElement linkName= wd.findElement(By.linkText("Selenium Automation Hybrid Framework"));
//
//                if(linkName.isDisplayed())
//                {
//                    System.out.println("Yes link is there");
//                }
//                else {
//                    System.out.println("No link is there");
//                }


                //11. Automation tool should be QTP and Selenium Webdriver;

                JavascriptExecutor g= (JavascriptExecutor) wd;
                js.executeScript("window.scrollBy(0,500)");
               WebElement Automation=  wd.findElement(By.id("tool-0"));
               Automation.click();
               Thread.sleep(3000);
               WebElement Selenium= wd.findElement(By.id("tool-2"));
               Selenium.click();

               //12. Continent should be north america and europe

                Select drpCountry= new Select(wd.findElement(By.id("continents")));
                drpCountry.selectByVisibleText("Europe");

                Thread.sleep(3000);
                Select drp= new Select(wd.findElement(By.id("continentsmultiple")));
                drp.selectByVisibleText("Europe");
                drp.selectByIndex(5);
                Thread.sleep(3000);


                //13. Selenium commands should All in the list

//              WebElement allselect= wd.findElement(By.xpath("//*[@id=\"selenium_commands\"]"));
//               List<WebElement> options= allselect.findElements(By.tagName("option"));

                WebElement drop_down =wd.findElement(By.id("selenium_commands"));
                Select se = new Select(drop_down);
                for(int i=0 ;i<se.getOptions().size(); i++)
                    System.out.println(se.getOptions().get(i).getAttribute("value"));
    }


    //14.   Dont click just verify 4 buttons are present and click button 3


    }

  // @Test
//         public void Assert() {
//
//        //verify the partial link text exists and it link to /automation/practice.form
//
//        //wd.findElement(By.linkText("Partial Link Test")).isDisplayed();
//
//
//        String Actualelement = wd.findElement(By.partialLinkText("Partial")).getText();
//        String expectedTitle = "Partial Link Test";
//        System.out.println(Actualelement);
//        Assert.assertEquals(expectedTitle, Actualelement);
//
//        //Verify link text exists and links to/aut0mation/practice.form.
//
//
//        String expect = wd.findElement(By.linkText("Link Test")).getText();
//        String actual = "Link Test";
//        System.out.println(actual);
//        Assert.assertEquals(actual, expect);
////












