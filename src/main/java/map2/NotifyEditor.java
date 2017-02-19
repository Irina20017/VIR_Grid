package map2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;

/**
 * Created by Home on 19.02.2017.
 */
public class NotifyEditor extends Page {
    public NotifyEditor(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how= How.XPATH, using ="//input[@data-param='name']") //input field for page name
    private WebElement nameInput;

    @FindBy(how= How.XPATH, using ="//div[@data-tab='library']") //icon of the widgets library
    private WebElement libraryTab;

    @FindBy(how= How.XPATH, using ="//div[@class='ico-widget widget-notify_me']")//Notify widget in the widgets library
    private WebElement notifyIconTree;

    @FindBy(how= How.XPATH, using ="//div[@class='mapx-button-ico activate']") //button activate page
    private WebElement activateBtn;

    @FindBy(how= How.XPATH, using ="//div[@class='menu-launcher']") //button M-A-P for page-tree in top-menu
    private WebElement menuLauncher;

    public void setPageName(){
        nameInput.clear();
        nameInput.sendKeys("notifyauto");
    }

    public void addWidget(){
        libraryTab.click();
        ((JavascriptExecutor)driver).executeScript("map.pg.addWidget(\"notify_me\", {destination: \"body_0_0\"});");
    }

    public void activatePage(){
        activateBtn.click();


    }

    public MAP2 backToMap(){
        menuLauncher.click();
        return PageFactory.initElements(driver, MAP2.class);
    }

    public boolean isNotifyWidgetExists(){
        libraryTab.click();
        return notifyIconTree.isDisplayed();
    }
}
