package co.pragra.dd.framework.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActiionsTest {

    WebDriver driver ;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://pragra.co/sel.html");
    }



    @Test(enabled = false)
    public void test1(){

        Actions actions = new Actions(driver);
        WebElement topLvlLink = driver.findElement(By.id("_602644b1e61b9a_repMainNav_topLevelLink_0"));
        WebElement grainLink = driver.findElement(By.id("_602644b1e61b9a_repMainNav_repSecondLevel_0_secondLevelLink_6"));


        WebElement element = driver.findElement(By.id("_602644b1e61b9a_repMainNav_repSecondLevel_0_repThirdLevel_6_thirdLevelLink_0"));
        actions.moveToElement(topLvlLink).moveToElement(grainLink).moveToElement(element).click().build().perform();


    }

    @Test
    public void doubleClickTest(){
        WebElement element = driver.findElement(By.id("dblclik"));
        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();
        driver.switchTo().alert().dismiss();
        WebElement span = driver.findElement(By.id("msg"));
        Assert.assertEquals(span.getText(), "Just Double Clicked");
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
