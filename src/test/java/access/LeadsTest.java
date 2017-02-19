package access;

import dms.dmsHome2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import settings.LeadsEmailnNotify;
import settings.Website;
import testcase.TestBase;

/**
 * Created by Home on 19.02.2017.
 */
public class LeadsTest extends TestBase {

    @Test(groups = "dms")
    public void addLeadsEmail() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //   dmsHome = PageFactory.initElements(driver, dmsHome.class);
        dmsHome2 dmsHome2 = dmsHome.loginToDms();
        wait.until(jsLoad);
        Website website = dmsHome2.clickOnWebsiteMenu();
        Thread.sleep(1000);
        LeadsEmailnNotify leads = website.clickOnLeadsTab();
        Thread.sleep(1000);
        leads.ifEmailPresent();
    }

    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
        @Override
        public Boolean apply(WebDriver driver) {
            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
        }
    };
}
