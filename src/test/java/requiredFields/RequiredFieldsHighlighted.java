package requiredFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import testcase.TestBase2;
import org.testng.annotations.Parameters;
import notifyMePage.NotifyMe;
import webdriver.WebDriverFactory;

import java.io.IOException;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.IE;
import static webdriver.WebDriverFactory.FIREFOX;


/**
 * Created by Home on 29.01.2017.
 */
public class RequiredFieldsHighlighted extends TestBase2 {

    String borderColor;
    String labelColor;
    String borderColorFirstName;
    String asteriskColor;


    @BeforeClass
    @Parameters({ "browserName" })
    public void preparation(String browserName){
       driver.get(baseUrl+"/notify");
       notifyMe.clickOnSubmit();

       if(CHROME.equals(browserName)) {
           borderColor = "rgb(169, 68, 66)";
           labelColor = "rgba(169, 68, 66, 1)";
           borderColorFirstName = "rgb(169, 68, 66)";
           asteriskColor = "rgba(169, 68, 66, 1)";
       }

           else if(FIREFOX.equals(browserName)) {
           borderColor = "#a94442";
           labelColor = "#a94442";
           borderColorFirstName = "#a94442";
           asteriskColor = "#a94442";
       }
            else if (WebDriverFactory.IE.equals(browserName)){
           borderColor = "#a94442";
           labelColor = "rgba(169, 68, 66, 1)";
           borderColorFirstName = "#843534";
           asteriskColor = "rgba(169, 68, 66, 1)";
       }



        //  WebDriverWait wait = new WebDriverWait(driver, 10);
        //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("first_name"))));
    }

    @Test (groups = "dws")
    public void firstNameClass () {

        Assert.assertEquals(notifyMe.getFirstNameInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void lastNameClass () {
        Assert.assertEquals(notifyMe.getLastNameInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void emailNameClass () {
        Assert.assertEquals(notifyMe.getEmailInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void phoneNumNameClass () {
        Assert.assertEquals(notifyMe.getPhoneNumInputClass(), "form-control text-uppercase error"); }

    //First Name Highlight for input border and label
    @Test (groups = "dws")
    public void firstNameHighlight () {
        Assert.assertEquals(notifyMe.getFirstNameInputBorderColor(),  borderColorFirstName); }
    @Test (groups = "dws")
    public void labelFirstNameHighlight () {
        Assert.assertEquals(notifyMe.getLabelFirstNameColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskFirstNameColor () {
        Assert.assertEquals(notifyMe.getAsteriskFirstNameColor(), asteriskColor);
    }

   //Last Name Highlight for input border and label
    @Test (groups = "dws")
    public void lastNameHighlight () {
        Assert.assertEquals(notifyMe.getLastNameInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelLastNameHighlight () {
        Assert.assertEquals(notifyMe.getLabelLastNameColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskLastNameColor () {
        Assert.assertEquals(notifyMe.getAsteriskLastNameColor(), asteriskColor);
    }

    //Phone Highlight for input border and label
    @Test (groups = "dws")
    public void phoneHighlight () {
        Assert.assertEquals(notifyMe.getPhoneNumInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelPhoneHighlight () {
        Assert.assertEquals(notifyMe.getLabelPhoneColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskPhoneColor () {
        Assert.assertEquals(notifyMe.getAsteriskPhoneColor(), asteriskColor);
    }

    //Email Address Highlight for input border and label
    @Test (groups = "dws")
    public void emailHighlight () {
        Assert.assertEquals(notifyMe.getEmailInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelEmailAddressHighlight () {
        Assert.assertEquals(notifyMe.getLabelEmailAddressColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskEmailAddressColor () {
        Assert.assertEquals(notifyMe.getAsteriskEmailAddressColor(), asteriskColor);
    }
  /*  @Test (groups = "dws")
    public void asteriskNoteColor () {
        Assert.assertEquals(notifyMe.getAsteriskNoteColor(), asteriskColor);
    } */


}
