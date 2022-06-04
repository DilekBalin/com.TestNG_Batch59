package day21_reusableMethods_HTMLReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class C01_WindowHandleReusableMethod {
    @Test
    public void test01() {
        ////● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowhandle = Driver.getDriver().getWindowHandle();
        //  Click Here butonuna basiniz
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();

        String ikinciSayfaWindowHandle = "";
        for (String each : windowHandleSeti
        ) {
            if (each.equals(ilkSayfaWindowhandle)) {
                ikinciSayfaWindowHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandle);
        System.out.println(Driver.getDriver().getTitle());

        //acilan yeni tabin "The Internet" oldugunu test edin

        String expectedTitle = "The Internet";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test
    public void test02() {
        ////● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowhandle = Driver.getDriver().getWindowHandle();
        //  Click Here butonuna basiniz
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();

        //acilan yeni tabin "The Internet" oldugunu test edin
        ReusableMethods.switchToWindow("The Internet");//yeni windowa,basligi referans gosstererek gectik

        String expectedTitle = "The Internet";
        String actualTitle = Driver.getDriver().getTitle();

        ReusableMethods.waitFor(5);
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();
    }

}


