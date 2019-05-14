package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.MainNavigation;
import co.pragra.dd.framework.pageobject.PhoneSystem;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PhoneSystemTest {

    PhoneSystem phone;
    WebDriver driver;
   // MainNavigation navigation;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://zoom.us/phonesystem");
       // navigation=new MainNavigation(driver);

    }

    @Test
    public void plansTest(){
       // plansAndPricing=navigation.clickPlansNPricing();
        phone=new PhoneSystem(driver);
        String title=phone.phoneTopTitle();
        //WebDriver driver=driver.findElement(By.id("top-title"));

        Assert.assertEquals(title,"Zoom Phone");
    }
    @AfterSuite
    public void destroySetup(){
        sleep(2000);

        driver.quit();
    }
    public void sleep( long sleepTime){
        try{
            Thread.sleep(sleepTime);
        }catch (InterruptedException ex){

        }

    }

}
