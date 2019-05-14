package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.Education;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EducationTest {

    WebDriver driver;
    Education ed;

    @BeforeSuite
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\khasaria\\Downloads\\chromedriver_win32(74)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://zoom.us/education");
    }

    @Test
    public void getTitle()
    {
        ed = new Education(driver);
        ed.keytitle();
        Assert.assertEquals(ed.keytitle(),"Zoom for Education");
    }
}
