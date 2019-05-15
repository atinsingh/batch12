package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.Government;
import co.pragra.dd.framework.pageobject.PhoneSystem;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GovernmentTest {

    Government govt;
    WebDriver driver;
    // MainNavigation navigation;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://zoom.us/government");
        // navigation=new MainNavigation(driver);

    }

    @Test
    public void govtTest(){
        // plansAndPricing=navigation.clickPlansNPricing();
        govt=new Government(driver);
        String title=govt.govtTopTitle();
        //WebDriver driver=driver.findElement(By.id("top-title"));

        Assert.assertEquals(title,"Zoom for Government");
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
