package positiveTests;

import org.testng.Assert;
import org.testng.annotations.*;
import testcase.TestBase2;

import java.io.IOException;

/**
 * Created by Irina Mudryak on 07.02.2017.
 */
public class PositiveTestTruckMode extends PositiveTestVehicleMode {


    @Test(groups = "dws", priority = 4)//select Limousine
    public void selectBodyStyle() {
        notifyMe.setBodyStyle("4");
        notifyMe.setType("1"); //select New
        notifyMe.fillMinOdometer("10"); //enter min Price
        notifyMe.fillMaxOdometer("120000"); //enter max Odometer
        notifyMe.setTransmission("11885"); //select Transmission
           }
    @Test(groups = "dws", priority = 5)
    public void simpleWaitToWatch() throws InterruptedException, IOException {
        Thread.sleep(2000);
    } //simple Wait
}
