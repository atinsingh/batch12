package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.config.AppConfig;
import co.pragra.dd.framework.drivermanger.DriverManager;
import co.pragra.dd.framework.listeners.ScreenShotListener;
import co.pragra.dd.framework.pageobject.ContactSalesPage;
import co.pragra.dd.framework.pageobject.MainNavigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ScreenShotListener.class})
public class ContactPageTest {

    WebDriver driver = DriverManager.getDriverInstance();
    Logger logger = LogManager.getLogger(ContactPageTest.class);

    MainNavigation navigation;
    ContactSalesPage contactSalesPage;

    @BeforeSuite
    public void setUp(){
        logger.log(Level.INFO, "Opening URL  {}  with driver", AppConfig.getProperty("url") );
        driver.get(AppConfig.getProperty("url"));
        navigation = new MainNavigation(driver);
    }


    @Test
    public void contactTest(){
         contactSalesPage = navigation.clickContactSales();

        WebElement element = contactSalesPage.keyInFirstName("Test")
                .keyInLastName("Singh")
                .keyInCompany("Test Inc")
                .keyInEmail("test@test.com")
                .selectEmployeeByIndex(2)
                .selectCountryByValue("US")
                .selectState(3)
                .keyInPhone("64626362623")
                .keyInAdditonalInfo("This is just for fun")
                .subMitClick();

        Assert.assertEquals(element.getText(),"Thank you for contacting Zoom! We will be in touch soon.");
    }



}
