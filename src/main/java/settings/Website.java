package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;

/**
 * Created by Irina on 19.02.2017.
 */
public class Website extends Page {

    public Website(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "tab2")
    private WebElement leadsEmailTab;

    public LeadsEmailnNotify clickOnLeadsTab(){
        leadsEmailTab.click();
        return PageFactory.initElements(driver, LeadsEmailnNotify.class);
    }
}
