package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainNavigation {

    WebDriver driver;

    @FindBy(id = "btnSolutions")
    private WebElement solutions;

    @FindBy(className = "top-pricing")
    private WebElement planNPricing;

    @FindBy(xpath = "//a[contains(@class,'sales')]")
    private WebElement contactSales;

    @FindBy(id = "btnJoinMeeting")
    private WebElement joinMeeting;

    @FindBy(id = "btnHostMeeting")
    private WebElement hostMeeting;

    @FindBy(css = ".signin>a")
    private WebElement signin;

    @FindBy(className = "signupfree")
    private WebElement signUp;


    public MainNavigation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public ContacSalesPage clickContactSales(){
        this.contactSales.click();
        return new ContacSalesPage(this.driver);
    }
}
