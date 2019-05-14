package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlansAndPricing {

    WebDriver driver;

    @FindBy(id="top-title")
    private WebElement pageText;

    //creating constructor
    public PlansAndPricing(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public  String topTitle(){

        return this.pageText.getText();

        //return this;

    }





}
