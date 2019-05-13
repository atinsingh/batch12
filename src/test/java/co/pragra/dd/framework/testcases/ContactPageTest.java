package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.ContacSalesPage;
import co.pragra.dd.framework.pageobject.MainNavigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ContactPageTest {
    WebDriver driver;
    MainNavigation navigation;
    ContacSalesPage contacSalesPage;

    @BeforeSuite
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://zoom.us/contactsales");
        navigation = new MainNavigation(driver);
    }

    @Test
    public void contactTest()
    {

        WebElement element = (WebElement) contacSalesPage.keyemail("abc@gmail.com")
                .keycompany("bb")
                .keyname("navjot")
                .keylastname("kaur")
                .keyemployeecount(3)
                .keyphone("566988988")
                .keycountry("Canada")
                .keystate(3);



    }
}
