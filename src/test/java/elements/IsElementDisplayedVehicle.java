package elements;

import org.testng.Assert;
import org.testng.annotations.*;
import testcase.TestBase2;


/**
 * Created by Irina Mudryak on 09.02.2017.
 */
public class IsElementDisplayedVehicle extends TestBase2{

    @BeforeClass
    public void openNotifyPage() {
        driver.get(baseUrl+"/notify");

    }



    //Tests for elements  of the First Name (label, input field, asterisk)
    @Test(groups = "dws")
    public void firstNameInputDisplayed() {
        Assert.assertTrue(notifyMe.isFirstNameInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelFirstNameDisplayed() {
        Assert.assertTrue(notifyMe.isLabelFirstNameDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskFirstNameDisplayed() {
        Assert.assertTrue(notifyMe.isAsteriskFirstNameDisplayed());
    }


    // Tests for elements  of the Last Name (label, input field, asterisk)
    @Test(groups = "dws")
    public void lastNameInputDisplayed() {
        Assert.assertTrue(notifyMe.isLastNameInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelLastNameDisplayed() {
        Assert.assertTrue(notifyMe.isLabelLastNameDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskLastNameDisplayed() {
        Assert.assertTrue(notifyMe.isAsteriskLastNameDisplayed());
    }


    // Tests for elements  of the Phone (label, input field, asterisk)
    @Test(groups = "dws")
    public void phoneNumInputDisplayed() {
        Assert.assertTrue(notifyMe.isPhoneNumInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelPhoneDisplayed() {
        Assert.assertTrue(notifyMe.isLabelPhoneDiaplayed());
    }
    @Test(groups = "dws")
    public void asteriskPhoneDisplayed() {
        Assert.assertTrue(notifyMe.isAsteriskPhoneDiaplayed());
    }


    // Tests for elements  of the Email Address (label, input field, asterisk)
    @Test(groups = "dws")
    public void emailInputDisplayed() {
        Assert.assertTrue(notifyMe.isEmailInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelEmailAddressDisplayed() {
        Assert.assertTrue(notifyMe.isLabelEmailAddressDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskEmailAddressDisplayed() {
        Assert.assertTrue(notifyMe.isAsteriskEmailAddressDisplayed());
    }


    //Widget title
    @Test(groups = "dws")
    public void widgetTitleDisplayed() {
        Assert.assertTrue(notifyMe.isWidgetTitleDisplayed());
    }

    //BLOCKED FIELDS: check if the fields Body Style, Make and Model are disabled by opening the form
    @Test(groups = "dws")
    public void makeDisabled() {
        Assert.assertEquals(notifyMe.getMakeDisabled(), "true");
    }
    @Test(groups = "dws")
    public void modelDisabled() {
        Assert.assertEquals(notifyMe.getModelDisabled(), "true");
    }


    // Tests for elements  of the Motorized Type
    @Test(groups = "dws")
    public void labelMotorizedTypeDisplayed() {
        Assert.assertTrue(notifyMe.isLabelMotorizedTypeDisplayed());
    }
    @Test(groups = "dws")
    public void motorizedTypeSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isMotorizedTypeSelectorDisplayed());
    }

    // Tests for elements  of the Make check if label and selector displayed
    @Test(groups = "dws")
    public void labelMakeDisplayed() {
        Assert.assertTrue(notifyMe.isLabelMakeDisplayed());
    }
    @Test(groups = "dws")
    public void makeSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isMakeSelectorDisplayed());
    }

    //Tests for elements  of the Model: check if label and selector are displayed
    @Test(groups = "dws")
    public void labelModelDisplayed() {
        Assert.assertTrue(notifyMe.isLabelModelDisplayed());
    }
    @Test(groups = "dws")
    public void modelSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isModelSelectorDisplayed());
    }

    // Tests for elements  of the Year: check if label and selectors are displayed
    @Test(groups = "dws")
    public void labelYearDisplayed() {
        Assert.assertTrue(notifyMe.isLabelYearDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minYearSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isMinYearSelectorDisplayed());
    }// check if selector for min Year is displayed

    @Test(groups = "dws")
    public void maxYearSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isMaxYearSelectorDisplayed());
    }    // check if selector for max Year is displayed

    // Tests for elements  of the Price: check if label and input fields are displayed
    @Test(groups = "dws")
    public void labelPriceDisplayed() {
        Assert.assertTrue(notifyMe.isLabelPriceDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minPriceInputDisplayed() {Assert.assertTrue(notifyMe.isMinPriceInputDisplayed());
    }// check if input field for min Price is displayed

    @Test(groups = "dws")
    public void maxPriceInputDisplayed() {Assert.assertTrue(notifyMe.isMaxPriceInputDisplayed());
    }// check if input field for max Price is displayed

     //Tests for elements  of the Frequency: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeFrequencyDisplayed() {
        Assert.assertTrue(notifyMe.isLabelFrequencyDisplayed());
    }
    @Test(groups = "dws")
    public void frequencySelectorDisplayed() {
        Assert.assertTrue(notifyMe.isFrequencySelectorDisplayed());
    }

    //Tests for elements  of the Expires: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeExpiresDisplayed() {
        Assert.assertTrue(notifyMe.isLabelExpiresDisplayed());
    }
    @Test(groups = "dws")
    public void expiresSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isExpiresSelectorDisplayed());
    }

}

  /*  @Test(groups = "dws")
    public void asteriskTextDisplayed () {
        Assert.assertTrue(notifyMe.isAsteriskTextDisplayed());
    }

    @Test(groups = "dws")
    public void asteriskNoteDisplayed () { Assert.assertTrue(notifyMe.isAsteriskNoteDisplayed()); }*/




   /* @Test(groups = "dws")
    public void securityTitleDisplayed () {
        Assert.assertTrue(notifyMe.isSecurityTitleDisplayed());
    }

    @Test(groups = "dws")
    public void asteriskCaptchaDisplayed () {
      Assert.assertTrue(notifyMe.isAsteriskCaptchaDisplayed());
    }
    */





