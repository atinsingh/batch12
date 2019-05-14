package co.pragra.dd.framework.testcases;

<<<<<<< HEAD
import co.pragra.dd.framework.pageobject.ContactSalesPage;
=======
import co.pragra.dd.framework.pageobject.ContacSalesPage;
>>>>>>> a2544cb362ab6427cc85e922dae494b4e85eb9c3
import co.pragra.dd.framework.pageobject.MainNavigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.PortUnreachableException;

public class ContactPageTest {

    WebDriver driver;

    MainNavigation navigation;
    ContactSalesPage contactSalesPage;

    @BeforeSuite
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://zoom.us");
        navigation=new MainNavigation(driver);

    }

    @Test
    public void contactTest(){
        contactSalesPage=navigation.clickContactSales();

       WebElement element= contactSalesPage.keyInEmail("pc@ckc.com")
               .keyInCompany("abc")
               .keyInFirstName("sdf")
               .keyInLastName("ffert")
               .keyInEmployeeByIndex(4)
               .keyInPhoneNumber("2342342342")
               .keyInCountry("CA")
               .selectState(1)
               .keyInInfo("sdfds")
               .keyInZip("M5V 2P2")
               .submitClick();



=======
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ContactPageTest {

    WebDriver driver ;

    MainNavigation navigation;
    ContacSalesPage contacSalesPage;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://zoom.us");
        navigation = new MainNavigation(driver);
    }


    @Test
    public void contactTest(){
         contacSalesPage = navigation.clickContactSales();

        WebElement element = contacSalesPage.keyInFirstName("Test")
                .keyInLastName("Singh")
                .keyInCompany("Test Inc")
                .keyInEmail("test@test.com")
                .selectEmployeeByIndex(2)
                .selectCountryByValue("US")
                .selectState(3)
                .keyInPhone("64626362623")
                .keyInAdditonalInfo("This is just for fun")
                .subMitClick();
>>>>>>> a2544cb362ab6427cc85e922dae494b4e85eb9c3

        Assert.assertEquals(element.getText(),"Thank you for contacting Zoom! We will be in touch soon.");
    }


<<<<<<< HEAD
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
=======

>>>>>>> a2544cb362ab6427cc85e922dae494b4e85eb9c3
}
