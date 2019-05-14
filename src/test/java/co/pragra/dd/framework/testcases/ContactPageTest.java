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
    WebDriver driver;
    MainNavigation navigation;
    ContacSalesPage contacSalesPage;

    @BeforeSuite
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\khasaria\\Downloads\\chromedriver_win32(74)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://zoom.us/contactsales");
        navigation = new MainNavigation(driver);
    }

    @Test
    public void contactTest()
    {
        contacSalesPage=navigation.clickContactSales();

        WebElement element = (WebElement) contacSalesPage.keyemail("ac@gmail.com")
                .keycompany("bb")
                .keyname("navjot")
                .keylastname("kaur")
                .keyemployeecount(3)
                .keyphone("566988988")
                .keycountry("Canada")
                .keystate(3)
                .keyzip("l6r3r5")
                .keydescription("this is just for practice")
                .subMitClick();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertEquals(element.getText(),"Thank you for contacting Zoom! We will be in touch soon.");

    }
}
