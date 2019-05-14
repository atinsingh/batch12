package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneSystem {


    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"phone\"]/section[1]/div/div/div/h1")
    private WebElement phonePageText;

    //creating constructor
    public PhoneSystem(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public  String phoneTopTitle(){

        return this.phonePageText.getText();

        //return this;

    }


}
