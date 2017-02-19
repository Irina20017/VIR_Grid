package map2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;


/**
 * Created by Home on 19.02.2017.
 */
public class CreateNewPage extends Page{
    @FindBy(how= How.ID, using ="input-pg-name")
    private WebElement nameInput;

    @FindBy(how= How.ID, using ="input-pg-url")
    private WebElement pageURLInput;

    @FindBy(how= How.ID, using ="input-pg-title")
    private WebElement titleInput;

    @FindBy(how= How.XPATH, using ="(//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all  ui-draggable']//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[1]")
    private WebElement createBtn;

    public CreateNewPage(WebDriver webDriver) {
        super(webDriver);
    }

    public NotifyEditor createPage(){
        nameInput.sendKeys("notifyauto");
        pageURLInput.sendKeys("notifyauto");
        titleInput.sendKeys("notifyauto");
        createBtn.click();
        return PageFactory.initElements(driver, NotifyEditor.class);
    }

}
