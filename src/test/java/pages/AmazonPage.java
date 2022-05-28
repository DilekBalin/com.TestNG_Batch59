package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){  //constructor olusturmak zoundayiz class ismiyle ayni ve mehod gibi () 'i var
        PageFactory.initElements(Driver.getDriver(),this);  //Bu class;taki driver aslinda Driver class'indaki getdriver'dan gelen driverd'dir demek
    }
    @FindBy(id="twotabsearchtextbox")//driver.findElement yerine FindBy kullanilacak
    public WebElement aramaKutusu;  //bundan sonra amazon'la ilgili arama kutusu locate etmeey ihtiyac yok cunku surekli buradan kullanacagiz

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

}
