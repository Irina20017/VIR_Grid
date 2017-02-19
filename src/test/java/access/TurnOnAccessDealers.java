package access;

import dms.dmsHome2;
import dmsDealers.Dealers;
import dmsDealers.SitePackage;
import map2.NotifyEditor;
import map2.MAP2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testcase.TestBase;

/**
 * Created by Home on 19.02.2017.
 */
public class TurnOnAccessDealers extends TestBase{

    protected NotifyEditor notifyEditor;
    protected MAP2 map2;
    WebDriverWait wait;



    @Test(groups = "dms")
    public void pageExists() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //   dmsHome = PageFactory.initElements(driver, dmsHome.class);
        dmsHome2 dmsHome2 = dmsHome.loginToDms();
        wait.until(jsLoad);
        Dealers dealers = dmsHome2.clickOnDealersMenu();

        wait.until(jsLoad);
        SitePackage editor = dealers.turnOnAccess();
        wait.until(jsLoad);
        Dealers dealers2 = editor.turnOnAccess2();
        dealers2.clickSave();
        //   wait.until(jsLoad);
        Thread.sleep(12000);
        MAP2 map2 = dealers2.goToMAP2();
        Assert.assertTrue(map2.isNotifyTabExists());

    }

    /*@Test (dependsOnMethods = {"pageExists"})
            public void widgetExists(){
        contactEditor = PageFactory.initElements(driver, NotifyEditor.class);
Assert.assertTrue(notifyEditor.isNotifyWidgetExists());
    }*/

    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
        @Override
        public Boolean apply(WebDriver driver) {
            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
        }
    };
}
