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

<<<<<<< HEAD
    @FindBy(xpath = "//a[contains(@class,'top-sales')]")
=======
    @FindBy(xpath = "//a[contains(@class,'sales')]")
>>>>>>> a2544cb362ab6427cc85e922dae494b4e85eb9c3
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



    public ContactSalesPage clickContactSales(){
        this.contactSales.click();
<<<<<<< HEAD
        return new ContactSalesPage(this.driver);
=======
        return new ContacSalesPage(this.driver);
>>>>>>> a2544cb362ab6427cc85e922dae494b4e85eb9c3
    }


    public PlansAndPricing clickPlansNPricing(){
        this.planNPricing.click();
        return new PlansAndPricing(this.driver);
    }

    public void hoverSolutions(){

    }

}
