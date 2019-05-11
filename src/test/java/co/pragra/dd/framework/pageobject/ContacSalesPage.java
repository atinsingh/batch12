package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContacSalesPage {
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

    public ContacSalesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public ContacSalesPage keyInFirstName(String name){
        this.firstName.sendKeys(name);
        return this;
    }


    public ContacSalesPage keyInEmail(String email){
        this.workEmail.sendKeys(email);
        return this;
    }


    public ContacSalesPage keyInLastName(String name){
        this.lastName.sendKeys(name);
        return this;
    }


    public ContacSalesPage keyInCompany(String company){
        this.companyName.sendKeys(company);
        return this;
    }

    public ContacSalesPage selectEmployeeByIndex(int index){
        Select select = new Select(this.employeeCount);
        select.selectByIndex(index);
        return this;
    }

    public ContacSalesPage keyInPhone(String phone){
        this.phoneNumber.sendKeys(phone);
        return this;
    }

    public ContacSalesPage selectCountryByValue(String value){
        Select select = new Select(this.country);
        select.selectByValue(value);
        return this;
    }

    public ContacSalesPage selectState(int index){
        if(this.country.getAttribute("value").equalsIgnoreCase("US")) {
            this.state = driver.findElement(By.id("state"));
            Select select = new Select(this.state);
            select.selectByIndex(index);
        }
        return this;
    }


    public ContacSalesPage keyInAdditonalInfo(String info){
        this.addInfo.sendKeys(info);
        return this;
    }

    public WebElement subMitClick(){
        this.subBtn.click();
        return driver.findElement(By.cssSelector("#support_contact> div[class~='hideme']>p"));
    }



}

