package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Government {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"government-vertical\"]/section[1]/div/div/div/h1")
    private WebElement govtPageText;

    //creating constructor
    public Government(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public  String govtTopTitle(){

        return this.govtPageText.getText();

        //return this;

    }

}
