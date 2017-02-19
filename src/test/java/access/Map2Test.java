package access;

import dms.dmsHome;
import dms.dmsHome2;
import map2.NotifyEditor;
import map2.MAP2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import testcase.TestBase;

/**
 * Created by Irina on 19.02.2017.
 */
public class Map2Test extends TestBase {

    // protected dmsHome dmsHome;
    @Test(groups = "dms")
    public void addWidget() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //  dmsHome = PageFactory.initElements(driver, dmsHome.class);
        dmsHome2 dmsHome2 = dmsHome.loginToDms();
        wait.until(jsLoad);
        MAP2 map2 = dmsHome2.clickOnMap2Menu();
        wait.until(jsLoad);
        map2.clickNotifyTab();
        Thread.sleep(1000);
        NotifyEditor editor = map2.clickAddPage();
        editor.setPageName();
        Thread.sleep(1000);
        editor.addWidget();
        editor.activatePage();
        Thread.sleep(2000);
        MAP2 map21 = editor.backToMap();
        Thread.sleep(1000);
        map21.deletePage();
        Thread.sleep(1000);
    }

    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
        @Override
        public Boolean apply(WebDriver driver) {
            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
        }
    };


}
