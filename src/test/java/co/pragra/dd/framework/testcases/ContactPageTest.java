package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.ContactSalesPage;
import co.pragra.dd.framework.pageobject.MainNavigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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




        Assert.assertEquals(element.getText(),"Thank you for contacting Zoom! We will be in touch soon.");
    }

}
