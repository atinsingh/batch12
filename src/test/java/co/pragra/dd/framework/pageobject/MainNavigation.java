package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainNavigation {

    WebDriver driver;

    @FindBy(id = "btnSolutions")
    private WebElement solutions;

    @FindBy(className = "top-pricing")
    private WebElement planNPricing;

    @FindBy(css = "a[href='/contactsales']")
    private WebElement contactSales;

    @FindBy(id = "btnJoinMeeting")
    private WebElement joinMeeting;

    @FindBy(id = "btnHostMeeting")
    private WebElement hostMeeting;

    @FindBy(css = ".signin>a")
    private WebElement signin;

    @FindBy(className = "signupfree")
    private WebElement signUp;

    @FindBy(css = "a[href='https://zoom.us/meetings']")
    private WebElement meetingsAndChat;

    @FindBy(css="a[href='https://zoom.us/education']")
    private WebElement education;


    public MainNavigation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public ContacSalesPage clickContactSales(){
        this.contactSales.click();
        return new ContacSalesPage(this.driver);
    }


    public MainNavigation keysolutionsmeeting()
    {
        Actions ac= new Actions(driver);
        ac.moveToElement(this.solutions).moveToElement(this.meetingsAndChat).click();
        return  this;

    }
    public MainNavigation keyeducation()
    {
        Actions ac= new Actions(driver);
        ac.moveToElement(this.education).click().build().perform();
        return this;
    }




    public ContactSalesPage clickContactSales(){
        this.contactSales.click();

    }


    public PlansAndPricing clickPlansNPricing(){
        this.planNPricing.click();
        return new PlansAndPricing(this.driver);
    }

    public void hoverSolutions(){

    }

}
