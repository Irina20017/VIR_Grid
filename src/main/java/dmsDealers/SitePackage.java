package dmsDealers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class SitePackage extends Page{

    public SitePackage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how= How.XPATH, using ="//div[@aria-labelledby='ui-dialog-title-site_package_editor']")
    private WebElement sitePackWindow;

    @FindBy(how= How.ID, using ="dws_notify_me")
    private WebElement notifyWidgetCheckbox;

    @FindBy(how= How.ID, using ="page_notify")
    private WebElement notifyPageCheckbox;

    @FindBy(how= How.XPATH, using ="(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']/span[contains(text(),'Ok')])[2]")
    private WebElement okBtn;

    public Dealers turnOnAccess2(){
        if(notifyWidgetCheckbox.getAttribute("checked") == null){
            notifyWidgetCheckbox.click();
        }
        if(notifyPageCheckbox.getAttribute("checked") == null){
            notifyPageCheckbox.click();
        }
        okBtn.click();
        return PageFactory.initElements(driver, Dealers.class);
    }

}
