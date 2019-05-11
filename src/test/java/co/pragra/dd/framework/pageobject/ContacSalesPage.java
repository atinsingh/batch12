package co.pragra.dd.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(id = "city")
    private WebElement headquater;

    public ContacSalesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
