package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.pageobject.meetingsAndChat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class meetingsAndChatTest {

    WebDriver driver;
    meetingsAndChat chat;
    @BeforeSuite
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\khasaria\\Downloads\\chromedriver_win32(74)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://zoom.us/meetings");

    }

    @Test
    public void validateTitle()
    {
        chat = new meetingsAndChat(driver);
        chat.keytitle();
        Assert.assertEquals(chat.keytitle(),"Zoom Meetings & Chat");
    }
}
