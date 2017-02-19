package elements;
import org.testng.Assert;
import org.testng.annotations.*;




/**
 * Created by Irina Mudryak on 28.01.2017.
 */
public class IsElemensDisplayedTrucks extends IsElementDisplayedVehicle {


    //BLOCKED FIELDS: check if the fields Body Style, Make and Model are disabled by opening the form
    @Test(groups = "dws")
    public void bodyStyleDisabled() {
        Assert.assertEquals(notifyMe.getBodyStyleDisabled(), "true");
    }

    // Tests for elements  of the Type
    @Test(groups = "dws")
    public void labelTypeDisplayed() {
        Assert.assertTrue(notifyMe.isLabelTypeDisplayed());
    }
    @Test(groups = "dws")
    public void typeSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isTypeSelectorDisplayed());
    }


    // Tests for elements  of the Body Style
    @Test(groups = "dws")
    public void labelBodyStyleDisplayed() {
        Assert.assertTrue(notifyMe.isLabelBodyStyleDisplayed());
    }
    @Test(groups = "dws")
    public void bodyStyleSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isBodyStyleSelectorDisplayed());
    }

    // Tests for elements  of the Odometer: check if label and input fields are displayed
    @Test(groups = "dws")
    public void labelOdometerDisplayed() {
        Assert.assertTrue(notifyMe.isLabelOdometerDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minOdometerInputDisplayed() {
        Assert.assertTrue(notifyMe.isMinOdometerInputDisplayed());
    }// check if input field for min Odometer is displayed
    @Test(groups = "dws")
    public void maxOdometerInputDisplayed() {
        Assert.assertTrue(notifyMe.isMaxOdometerInputDisplayed());
    }// check if input field for max Odometer is displayed


    //Tests for elements  of the Transmission: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeTransmissionDisplayed() {
        Assert.assertTrue(notifyMe.isLabelTransmissionDisplayed());
    }
    @Test(groups = "dws")
    public void transmissionSelectorDisplayed() {
        Assert.assertTrue(notifyMe.isTransmissionSelectorDisplayed());
    }

}



