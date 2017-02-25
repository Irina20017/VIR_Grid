package testcase;

import dms.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.*;
import utility.PropertyLoader;
import webdriver.WebDriverFactory;
import dmsAuction.AdminGridPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class TestBase {


    protected WebDriver driver;
    public String baseUrl;
        protected LoginPage loginPage;
    protected AdminGridPage gridPage;


    @BeforeClass
    @Parameters({ "browserName" })
    public void setup(String browserName) throws Exception {

        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        baseUrl = PropertyLoader.loadProperty("site.url");
        driver.get(PropertyLoader.loadProperty("dms.url"));
        loginPage = PageFactory.initElements(driver, LoginPage.class);

    }
    @Test
    public void testLogin2() throws Exception {
        Thread.sleep(6000);
    }



    @AfterClass
    public void tearDown() {
        if (driver != null) {
                  WebDriverFactory.killDriverInstance();
        }
    }

    protected String getBaseUrl() {
        return baseUrl;
    }

    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
        @Override
        public Boolean apply(WebDriver driver) {
            try {
                return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
            }
            catch (Exception e) {
                // no jQuery present
                return true;
            }
        }
    };


}
