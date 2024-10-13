package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AkakcePage {
    public AkakcePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='q']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//*[@title='Cep Telefonu'])[1]")
    public WebElement ceptelefonuSekmesi;

    @FindBy (xpath = "//*[@class='a']")
    public WebElement markasiYazisi;

    @FindBy (xpath = "(//*[@class='fl-ac'])[3]")
    public WebElement dahiliHafiza;

    @FindBy (xpath = "//*[@id='c109306']")
    public WebElement checkBox256gb;

    @FindBy (xpath = "//*[@id='c134091']")
    public WebElement apple;

    @FindBy (xpath = "//*[@id='FF_v8']")
    public WebElement solTaraftakiForm;

    @FindBy (xpath = "//*[@class='pt_v8']")
    public WebElement urunFiyatlari;

    @FindBy (xpath = "//span[@class='pt_v8']")
    public WebElement iphone16SatisFiyatlari;

    @FindBy (xpath = "//*[@alt='Pttavm']")
    public WebElement iphoneSaticilari;


}
