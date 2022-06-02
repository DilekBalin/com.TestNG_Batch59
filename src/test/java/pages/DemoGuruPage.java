package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuru {
    public DemoGuru(){//constr olustur
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
