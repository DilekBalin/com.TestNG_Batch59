package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    PageObjectModel (POM) 'de Driver icin TestBase class'ina extends etmek yerine
    Driver class'indan static method'lar kullanarak
    driver olusturup ilgili ayarlarin yapilmasi ve
    en sonda driver'in kapatilmasi tercih edilmistir.
     */
    static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){  //eger driver'a yeni bir deger atanmamissa yani driver null ise alttaki degerleri ata
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        }

        return driver;//driver'a daha once chrome degeri atanmissa if body'si calismayacak var olan degeri dondurecek
        //cunku driver sttaic oldugu icin son deger neyse onu aklinda tutar
    }


    public static void closeDriver(){
        if(driver!=null){ // driver null degilse yani bir degeri varsa  driver'i close yap
            driver.close();
            driver=null;// kapattiktan sonra driver'i yeniden null yapmaliyiz ki sonraki acmalarda sorun olmasin yani if icindeki ozellikler calissin
        }

    }

}
