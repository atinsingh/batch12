package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

public class ContacSalesPage {

    WebDriver driver;

    @FindBy(id = "email")
    private WebElement workEmailAddress;

    @FindBy(id = "company")
    private WebElement companyname;

    @FindBy(id = "first_name")
    private WebElement firstname;

    @FindBy(id="last_name")
    private WebElement lastname;

    @FindBy(id = "employee_count")
    private WebElement employeeCount;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id="phone")
    private WebElement phone;

    @FindBy(id = "city")
    private WebElement zip;

    @FindBy(id="description")
    private  WebElement description;


    public ContacSalesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContacSalesPage keyemail(String email)
    {
        this.workEmailAddress.sendKeys(email);
        return this;
    }

    public ContacSalesPage keycompany(String company)
    {
        this.companyname.sendKeys(company);
        return this;
    }

    public ContacSalesPage keyname(String name)
    {
        this.firstname.sendKeys(name);
        return this;

    }

    public ContacSalesPage keylastname(String lastname)
    {
        this.lastname.sendKeys(lastname);
        return this;
    }

    public ContacSalesPage keyphone(String phone)
    {
        this.phone.sendKeys(phone);
        return this;
    }
    public ContacSalesPage keyemployeecount(int index)
    {
        Select select = new Select(this.employeeCount);
        select.selectByIndex(index);
        return this;
    }

    public ContacSalesPage keycountry(String country)
    {
        Select select = new Select(this.country);
        select.selectByVisibleText(country);
        return this;
    }

    public ContacSalesPage keystate(int index)
    {
        Select select = new Select(this.state);
        select.selectByIndex(3);
        return this;
    }

    public ContacSalesPage keyzip(String hqzip)
    {
        this.zip.sendKeys(hqzip);
        return this;
    }
    public ContacSalesPage keydescription(String description)
    {
        this.description.sendKeys(description);
        return this;
    }
}