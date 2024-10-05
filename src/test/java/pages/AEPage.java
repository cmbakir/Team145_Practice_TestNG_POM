package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AEPage {
    public AEPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Signup / Login")
    public WebElement singupLink;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement signupName;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement signupMail;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[@data-qa='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@data-qa='last_name']")
    public WebElement lastName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@data-qa='address']")
    public WebElement address;
    @FindBy(xpath = "//*[@data-qa='state']")
    public WebElement state;
    @FindBy(xpath = "//*[@data-qa='city']")
    public WebElement city;
    @FindBy(xpath = "//*[@data-qa='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//*[@data-qa='mobile_number']")
    public WebElement mobileNumber;


}
