package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.ContacSalesPage;
import co.pragra.dd.framework.pageobject.MainNavigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ContactPageTest {

    WebDriver driver ;

    MainNavigation navigation;
    ContactSalesPage contactSalesPage;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://zoom.us");
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
