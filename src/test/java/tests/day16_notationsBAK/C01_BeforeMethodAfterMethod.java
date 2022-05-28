package tests.day16_notationsBAK;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethodAfterMethod extends TestBase {
    // @BeforeMethod ve @AfterMethod  notasyonlari
    // JUnit'deki @Before ve @After gibidir
    // her test method'undan once ve sonra calisirlar
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
    }
}


