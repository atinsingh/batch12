package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Education {

    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'Zoom for Education')]")
    private WebElement zoomTitle;


    public Education(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String keytitle()
    {
        String text = this.zoomTitle.getText();
        return text;
    }
}
