package testcase;

import notifyMePage.NotifyMe;
import dms.dmsHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import utility.PropertyLoader;
import webdriver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class TestBase {

    //  private static final Logger LOG = LogFactory.getLogger(TestBase.class);

    protected WebDriver driver;

    protected NotifyMe notifyMe;
    protected dmsHome dmsHome;

    @BeforeClass
    @Parameters({ "browserName" })
    public void setup(String browserName) throws Exception {

        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.get(PropertyLoader.loadProperty("dms.url"));
        dmsHome = PageFactory.initElements(driver, dmsHome.class);

    }
    @Test
    public void testLogin2() throws Exception {
        Thread.sleep(6000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            //   LOG.info("Killing web driver");
            WebDriverFactory.killDriverInstance();
        }
    }
}
