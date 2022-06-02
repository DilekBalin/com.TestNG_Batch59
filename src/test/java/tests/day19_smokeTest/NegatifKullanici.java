package day19_smokeTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifKullanici {
    BrcPage brcPage=new BrcPage();
   @Test
    public void dogruMailYanlisSifre(){

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brcPage.ilkLoginButonu.click();
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        brcPage.ikinciLoginButonu.click();
        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

    }
@Test
    public void dogruSifreYanlisMail(){
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
       brcPage.ilkLoginButonu.click();
       brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongMail"));
       brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
       brcPage.ikinciLoginButonu.click();
    Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());
    Driver.closeDriver();
    }
}
