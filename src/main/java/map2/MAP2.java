package map2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class MAP2 extends Page {
    public MAP2(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how= How.XPATH, using ="//div[@data-page='notify']")
    private WebElement notifyTab;

    @FindBy(how= How.XPATH, using ="//div[@class='map-link pull-right']")
    private WebElement addPageBtn;

    @FindBy(how= How.XPATH, using ="(//span[@class='ui-button ui-state-default'])[last()]")
    private WebElement deleteLastPageBtn;



    public void clickNotifyTab(){

        notifyTab.click();
    }
    public NotifyEditor clickAddPage(

    ){
        addPageBtn.click();
        return PageFactory.initElements(driver, NotifyEditor.class);
    }

    public void deletePage(){
        deleteLastPageBtn.click();
        driver.switchTo().alert().accept();
    }

    public boolean isNotifyTabExists(){
        return notifyTab.isDisplayed();
    }


}
