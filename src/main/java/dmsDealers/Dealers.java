package dmsDealers;
import dms.dmsHome2;
import map2.MAP2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class Dealers extends Page {
    public Dealers(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how= How.ID, using ="dealer_5")
    private WebElement domainInTree;

    @FindBy(how= How.ID, using ="site_package_editor_open")
    private WebElement sitePackEditBtn;

    @FindBy(how= How.ID, using ="dealer_save")
    private WebElement saveBtn;

    @FindBy(how = How.XPATH, using = "//a[@href='/dms/tools']")
    private WebElement toolsMenuItem;

    @FindBy(how = How.XPATH, using = "//a[@href='/dms/tools/make_a_page_2']")
    private WebElement map2MenuItem;

    public SitePackage turnOnAccess() throws InterruptedException {
        Actions action = new Actions(driver);
        Action dblclick = action.doubleClick(domainInTree).build();
        dblclick.perform();
        Thread.sleep(1000);
        sitePackEditBtn.click();
        return PageFactory.initElements(driver, SitePackage.class);

    }

    public void clickSave(){
        saveBtn.click();
    }

    public MAP2 goToMAP2(){
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(toolsMenuItem).build();
        moveToElem.perform();
        map2MenuItem.click();
        return PageFactory.initElements(driver, MAP2.class);
    }
}
