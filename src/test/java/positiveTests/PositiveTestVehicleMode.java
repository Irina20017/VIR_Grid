package positiveTests;

import org.testng.Assert;
import org.testng.annotations.*;
import testcase.TestBase2;

import java.io.IOException;

/**
 * Created by Irina Mudryak on 09.02.2017.
 */
public class PositiveTestVehicleMode extends TestBase2{
    @BeforeClass
    public void openNotifyPage() {
        driver.get(baseUrl+"/notify");

    }

    @Test(groups = "dws")
    public void enterFirstName() {
        notifyMe.setMinYear("2000"); //select min Year=2000
        notifyMe.setMaxYear("2017"); //select max Year=2017
        notifyMe.fillMinPrice("1000"); //enter min Price
        notifyMe.fillMaxPrice("200000"); //enter max Price
        notifyMe.fillFirstName("Sofie");
        notifyMe.fillLastName("Sonnenschein");
        notifyMe.fillPhoneField("333-333-4444");
        notifyMe.fillEmail("test_10@dxloo.com");
        notifyMe.setFrequency("3"); //select Frequency= Bi-Weekly
        notifyMe.setExpires("7"); //select Expires = 6 Weeks

    }

    @Test(groups = "dws", priority = 0)
    public void selectMotorizedType() {
        notifyMe.setMotorisedType("3");
    } //select Car&Trucks&Vans
    @Test(groups = "dws", priority = 1)
    public void simpleWait() throws InterruptedException, IOException {
        Thread.sleep(2000);
    } //simple Wait

    @Test(groups = "dws", priority = 2)//select Make "BMW"
    public void selectMake()  {
        notifyMe.setMake("10");
    }
    @Test(groups = "dws", priority = 3)
    public void selectModel() {
        notifyMe.setModel("271351"); //select Model
    }



}
