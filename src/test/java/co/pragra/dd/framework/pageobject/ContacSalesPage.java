package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContacSalesPage {

    WebDriver driver ;

    @FindBy(id="email")
    private WebElement workEmailAddress;

    @FindBy(id="company")
    private WebElement companyname;

    @FindBy(id="first_name")
    private WebElement firstname;

    @FindBy(id="employee_count")
    private WebElement employeeCount;

    @FindBy(id="country")
    private WebElement country;

    @FindBy(id="city")
    private WebElement zip;



    public  ContacSalesPage(WebDriver driver)
    {
        this.driver  = driver;
        PageFactory.initElements(driver,this);

    }
}


