package dms;

import dmsDealers.Dealers;
import map2.MAP2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;
import settings.Website;

/**
 * Created by Home on 19.02.2017.
 */
public class dmsHome2 extends Page{

       public dmsHome2(WebDriver webDriver) {
            super(webDriver);
        }

        @FindBy(how = How.XPATH, using = "//a[@href='/dms/admin']")
        private WebElement adminMenuItem;

        @FindBy(how = How.XPATH, using = "//a[@href='/dms/admin/dealers']")
        private WebElement dealersMenuItem;

        @FindBy(how = How.XPATH, using = "//a[@href='/dms/tools']")
        private WebElement toolsMenuItem;

        @FindBy(how = How.XPATH, using = "//a[@href='/dms/tools/make_a_page_2']")
        private WebElement map2MenuItem;

        @FindBy(how = How.XPATH, using = "//a[@href='/dms/settings']")
        private WebElement settingsMenuItem;

        @FindBy(how = How.XPATH, using = "//a[@href='/dms/settings/website']")
        private WebElement websiteMenuItem;



        public Dealers clickOnDealersMenu() {
            Actions action = new Actions(driver);
            Action moveToElem = action.moveToElement(adminMenuItem).build();
            moveToElem.perform();
            dealersMenuItem.click();
            return PageFactory.initElements(driver, Dealers.class);
        }

        public MAP2 clickOnMap2Menu() {
            Actions action = new Actions(driver);
            Action moveToElem = action.moveToElement(toolsMenuItem).build();
            moveToElem.perform();
            map2MenuItem.click();
            return PageFactory.initElements(driver, MAP2.class);
        }

        public Website clickOnWebsiteMenu() {
            Actions action = new Actions(driver);
            Action moveToElem = action.moveToElement(settingsMenuItem).build();
            moveToElem.perform();
            websiteMenuItem.click();
            return PageFactory.initElements(driver, Website.class);
        }

}
