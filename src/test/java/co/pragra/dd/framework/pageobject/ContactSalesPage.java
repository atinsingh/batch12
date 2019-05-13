package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactSalesPage {

    WebDriver driver;

    @FindBy(id="email")
    private WebElement workEmailAddress;

    @FindBy(id="company")
    private WebElement companyName;

    @FindBy(id="first_name")
    private WebElement firstName;

    @FindBy(id="last_name")
    private WebElement lastName;

    @FindBy(id="employee_count")
    private WebElement employeeCount;

    @FindBy(id="phone")
    private WebElement phone;

    @FindBy(id="country")
    private WebElement county;

    @FindBy(id="city")
    private WebElement zip;

    @FindBy(id="description")
    private WebElement additionalInfo;

    @FindBy(id="state")
    private WebElement state;


    @FindBy(id="btnSubmit")
    private WebElement submit;

    @FindBy(id="")
    private WebElement requestDemo;

    @FindBy(id="")
    private  WebElement partnerPrograms;

    public ContactSalesPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public ContactSalesPage keyInFirstName(String name){
        this.firstName.sendKeys(name);
        return this;
    }

    public ContactSalesPage keyInLastName(String lastName){
        this.lastName.sendKeys(lastName);
        return this;
    }


    public ContactSalesPage keyInCompany(String company){
        this.companyName.sendKeys(company);
        return this;
    }


    public ContactSalesPage keyInEmployeeByIndex(int index){

        Select select=new Select(this.employeeCount);
        select.selectByIndex(index);
        return this;
    }


    public ContactSalesPage keyInCountry(String value){
       Select select=new Select(this.county);
       select.selectByValue(value);
       return this;
    }

    public ContactSalesPage keyInPhoneNumber(String phone){
        this.phone.sendKeys(phone);
        return this;
    }

    public ContactSalesPage keyInEmail(String email){
        this.workEmailAddress.sendKeys(email);
        return this;
    }
    public ContactSalesPage keyInZip(String zip){
        this.zip.sendKeys(zip);
        return this;
    }

    public ContactSalesPage selectState(int index){
        if((this.county.getAttribute("value").equalsIgnoreCase("US")) || (this.county.getAttribute("value").equalsIgnoreCase("CA"))) {

            this.state = driver.findElement(By.id("state"));

            Select select = new Select(this.state);
            select.selectByIndex(index);
        }
        return this;
    }

    public ContactSalesPage keyInInfo(String info){
        this.additionalInfo.sendKeys(info);
        return this;
    }


    public WebElement submitClick() {
        this.submit.click();

        return driver.findElement(By.cssSelector("#support_contact> div[class~='hideme']>p"));
    }

}
