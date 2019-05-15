package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.MainNavigation;
import co.pragra.dd.framework.pageobject.PlansAndPricing;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PlansNPrizingTest {


    WebDriver driver;

    MainNavigation navigation;
    PlansAndPricing plansAndPricing;

    @BeforeSuite
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://zoom.us");
        navigation=new MainNavigation(driver);

    }

    @Test
    public void plansTest(){
        plansAndPricing=navigation.clickPlansNPricing();

       String title=plansAndPricing.topTitle();
                //WebDriver driver=driver.findElement(By.id("top-title"));

        Assert.assertEquals(title,"Zoom Meeting Plans for Your Business");
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
