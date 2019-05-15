package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactSalesPage {
    WebDriver driver;


    @FindBy(id = "email")
    private WebElement workEmail;

    @FindBy(id = "company")
    private WebElement companyName;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "employee_count")
    private WebElement employeeCount;

    @FindBy(id ="last_name")
    private WebElement lastName;

    @FindBy(id ="phone")
    private WebElement phoneNumber;


    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "city")
    private WebElement headquater;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "description")
    private WebElement addInfo;

    @FindBy(id = "btnSubmit")
    private WebElement subBtn;

    public ContactSalesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public ContactSalesPage keyInFirstName(String name){
        this.firstName.sendKeys(name);
        return this;
    }


    public ContactSalesPage keyInEmail(String email){
        this.workEmail.sendKeys(email);
        return this;
    }


    public ContactSalesPage keyInLastName(String name){
        this.lastName.sendKeys(name);
        return this;
    }


    public ContactSalesPage keyInCompany(String company){
        this.companyName.sendKeys(company);
        return this;
    }

    public ContactSalesPage selectEmployeeByIndex(int index){
        Select select = new Select(this.employeeCount);
        select.selectByIndex(index);
        return this;
    }

    public ContactSalesPage keyInPhone(String phone){
        this.phoneNumber.sendKeys(phone);
        return this;
    }

    public ContactSalesPage selectCountryByValue(String value){
        Select select = new Select(this.country);
        select.selectByValue(value);
        return this;
    }

    public ContactSalesPage selectState(int index){
        if(this.country.getAttribute("value").equalsIgnoreCase("US")) {
            this.state = driver.findElement(By.id("state"));
            Select select = new Select(this.state);
            select.selectByIndex(index);
        }
        return this;
    }


    public ContactSalesPage keyInAdditonalInfo(String info){
        this.addInfo.sendKeys(info);
        return this;
    }

    public WebElement subMitClick(){
        this.subBtn.click();
        return driver.findElement(By.cssSelector("#support_contact> div[class~='hideme']>p"));
    }



}

