package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class meetingsAndChat {

    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'Zoom Meetings')]")
    private WebElement meetingsTitle;


    public meetingsAndChat(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String keytitle()
    {

        String meetingtext = this.meetingsTitle.getText();
        return meetingtext;
    }

}
