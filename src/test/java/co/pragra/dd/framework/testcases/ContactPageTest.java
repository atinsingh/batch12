package co.pragra.dd.framework.testcases;

<<<<<<< HEAD
import co.pragra.dd.framework.pageobject.ContacSalesPage;
import co.pragra.dd.framework.pageobject.MainNavigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
=======
import co.pragra.dd.framework.pageobject.ContactSalesPage;
import co.pragra.dd.framework.pageobject.MainNavigation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> master
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ContactPageTest {
<<<<<<< HEAD
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
=======

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



>>>>>>> master
}
