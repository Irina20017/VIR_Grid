package notifyMePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import page.Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Home on 28.01.2017.
 */
public class NotifyMe extends Page {

    public NotifyMe(WebDriver webDriver) {
        super(webDriver);
    }

//Widget Title
    @FindBy(how= How.XPATH, using ="//div[@class='panel-heading']") // title ein widget heading
    private WebElement widgetTitle;

   //Firsr Name input and label
    @FindBy(how= How.NAME, using ="first_name")
    private WebElement firstNameInput;
    @FindBy(how=How.XPATH, using ="//label[text()='First Name:']")
    private  WebElement labelFirstName;
    @FindBy(how=How.XPATH, using="//form[@class=\"form-horizontal notify_form\"]//div[input[@name=\"first_name\"]]/span")
    private WebElement asteriskFirstName;

   //Last Name input and label
    @FindBy(how= How.NAME, using ="last_name")
    private WebElement lastNameInput;
    @FindBy(how=How.XPATH, using ="//label[text()='Last Name:']")
    private  WebElement labelLastName;
    @FindBy(how=How.XPATH, using="//form[@class=\"form-horizontal notify_form\"]//div[input[@name=\"last_name\"]]/span")
    private WebElement asteriskLastName;

    //Phone input and label
    @FindBy(how= How.NAME, using ="phone")
    private WebElement phoneNumInput;
    @FindBy(how=How.XPATH, using ="//label[text()='Phone:']")
    private  WebElement labelPhone;
    @FindBy(how=How.XPATH, using="//form[@class=\"form-horizontal notify_form\"]//div[input[@name=\"phone\"]]/span")
    private WebElement asteriskPhone;

    //Email input and label
    @FindBy(how= How.NAME, using ="email")
        private WebElement emailInput;
    @FindBy(how=How.XPATH, using ="//label[text()='Email Address:']")
    private  WebElement labelEmailAddress;
    @FindBy(how=How.XPATH, using="//form[@class=\"form-horizontal notify_form\"]//div[input[@name=\"email\"]]/span")
    private WebElement asteriskEmailAddress;

    //Motorized Type elements
    @FindBy(how=How.NAME, using ="motorized_type")
    private  WebElement motorizedTypeSelector;
    @FindBy(how= How.XPATH, using ="//label[text()='Motorized Type:']")
    private WebElement labelMotorizedType;
    // Dropdown element for Motorized Type, for such elements can't be used @FindBy
    private Select motorizeTypeDropdown() {
        return new Select(driver.findElement(By.name("motorized_type")));
    }


    // Type elements
    @FindBy(how= How.XPATH, using ="//label[text()='Type:']")
    private WebElement labelType;
    @FindBy(how= How.NAME, using ="type")
    private WebElement typeSelector;
    // Dropdown element for Type, for such elements can't be used @FindBy
    private Select typeDropdown() {
        return new Select(driver.findElement(By.name("type")));
    }


    //Body Style elements
    @FindBy(how= How.XPATH, using ="//label[text()='Body Style :']")
    private WebElement labelBodyStyle;
    @FindBy(how=How.NAME, using="body_style")
    private WebElement bodyStyleSelector;
    // Dropdown element for Body Style, for such elements can't be used @FindBy
    private Select bodyStyleDropdown() {
        return new Select(driver.findElement(By.name("body_style")));
    }

    //Make elements
    @FindBy(how= How.XPATH, using ="//label[text()='Make:']")
    private WebElement labelMake;
    @FindBy(how=How.NAME, using="make")
    private WebElement makeSelector;
    // Dropdown element for Make, for such elements can't be used @FindBy
    private Select makeDropdown() {
        return new Select(driver.findElement(By.name("make")));
    }


    //Model elements
    @FindBy(how= How.XPATH, using ="//label[text()='Model:']")
    private WebElement labelModel;
    @FindBy(how=How.NAME, using="model")
    private WebElement modelSelector;
    // Dropdown element for Make, for such elements can't be used @FindBy
    private Select modelDropdown() {
        return new Select(driver.findElement(By.name("model")));
    }

    //Year elements
    @FindBy(how= How.XPATH, using ="//label[text()='Year:']")
    private WebElement labelYear;
    @FindBy(how=How.NAME, using="min_year")
    private WebElement minYearSelector;
    // Dropdown element for min Year, for such elements can't be used @FindBy
    private Select minYearDropdown() {
        return new Select(driver.findElement(By.name("min_year")));
    }
    @FindBy(how=How.NAME, using="max_year")
    private WebElement maxYearSelector;
    // Dropdown element for max Year, for such elements can't be used @FindBy
    private Select maxYearDropdown() {
        return new Select(driver.findElement(By.name("max_year")));
    }

    //Price elements
    @FindBy(how= How.XPATH, using ="//label[text()='Price:']")
    private WebElement labelPrice;
    @FindBy(how=How.NAME, using="min_price")
    private WebElement minPriceInput;
    @FindBy(how=How.NAME, using="max_price")
    private WebElement maxPriceInput;

    //Odometer elements
    @FindBy(how= How.XPATH, using ="//label[text()='Odometer:']")
    private WebElement labelOdometer;
    @FindBy(how=How.NAME, using="min_odometer")
    private WebElement minOdometerInput;
    @FindBy(how=How.NAME, using="max_odometer")
    private WebElement maxOdometerInput;

    //Transmission elements
   @FindBy(how= How.XPATH, using ="//label[text()='Transmission:']")
 private WebElement labelTransmission;
 @FindBy(how=How.NAME, using="transmission")
 private WebElement transmissionSelector;
 // Dropdown element for Transmission, for such elements can't be used @FindBy
 private Select transmissionDropdown() {
  return new Select(driver.findElement(By.name("transmission")));
 }


 //Frequency elements
    @FindBy(how= How.XPATH, using ="//label[text()='Frequency:']")
    private WebElement labelFrequency;
    @FindBy(how=How.NAME, using="frequency")
    private WebElement frequencySelector;
    // Dropdown element for Frequency, for such elements can't be used @FindBy
    private Select frequencyDropdown() {
        return new Select(driver.findElement(By.name("frequency")));
    }

    //Expires elements
    @FindBy(how= How.XPATH, using ="//label[text()='Expires:']")
    private WebElement labelExpires;
    @FindBy(how=How.NAME, using="expires")
    private WebElement expiresSelector;
    // Dropdown element for Expires, for such elements can't be used @FindBy
    private Select expiresDropdown() {
        return new Select(driver.findElement(By.name("expires")));
    }



    @FindBy(how= How.XPATH, using ="//p[@class='text-muted text-center']")
    private WebElement asteriskText; // paragraph with the text "- indicates required fields " in the bottom of the form
    @FindBy(how= How.XPATH, using ="//span[@class='glyphicon glyphicon-asterisk text-danger']")
    private WebElement asteriskNote; // sign"*" before - indicates required fields

    @FindBy(how= How.XPATH, using ="//legend[contains(text(), 'Security')]")
    private WebElement securityTitle; //title "Security" before Module Captcha
    @FindBy(how= How.XPATH, using ="//span[@class='glyphicon glyphicon-asterisk text-danger pull-right']")
    private WebElement asteriskCaptcha; //sign "*" right of the ReCaptcha V2, there is no yet for Captcha "Captcha"



    /*@FindBy(how= How.XPATH, using ="//p[@class='text-muted text-center']")
    private WebElement captcha;*/

    @FindBy(how= How.XPATH, using ="//button[@class='btn btn-primary center-block btn-submit']")
    private WebElement submitButton;




    //isElementDisplayed methods
    public boolean isWidgetTitleDisplayed(){
        return widgetTitle.isDisplayed();
    }

    //check if input field, label and asterisk of First Name is displayed
    public boolean isFirstNameInputDisplayed(){
        return firstNameInput.isDisplayed();
    }
    public boolean isLabelFirstNameDisplayed() {return  labelFirstName.isDisplayed();}
    public boolean isAsteriskFirstNameDisplayed() {return  asteriskFirstName.isDisplayed();}

    //check if input field, label and asterisk of Last Name is displayed
    public boolean isLastNameInputDisplayed(){
        return lastNameInput.isDisplayed();
    }
    public boolean isLabelLastNameDisplayed() {return  labelLastName.isDisplayed();}
    public boolean isAsteriskLastNameDisplayed() {return  asteriskLastName.isDisplayed();}

    //check if input field, label and asterisk of Phone is displayed
    public boolean isPhoneNumInputDisplayed(){
        return phoneNumInput.isDisplayed();
    }
    public boolean isLabelPhoneDiaplayed() {return  labelPhone.isDisplayed();}
    public boolean isAsteriskPhoneDiaplayed() {return  asteriskPhone.isDisplayed();}

    //check if input field, label and asterisk of Email Address are displayed
    public boolean isEmailInputDisplayed(){
        return emailInput.isDisplayed();
    }
    public boolean isLabelEmailAddressDisplayed() {return  labelEmailAddress.isDisplayed();}
    public boolean isAsteriskEmailAddressDisplayed() {return  asteriskEmailAddress.isDisplayed();}

    //check if Motorized Type elements are displayed
    public boolean isLabelMotorizedTypeDisplayed() { return labelMotorizedType.isDisplayed();}
    public boolean isMotorizedTypeSelectorDisplayed() {return motorizedTypeSelector.isDisplayed();}

    //check if Type elements are displayed
    public boolean isLabelTypeDisplayed() { return  labelType.isDisplayed();}
    public  boolean isTypeSelectorDisplayed() {return typeSelector.isDisplayed(); }

    //check if Body Style elements are displayed
    public boolean isLabelBodyStyleDisplayed() {return labelBodyStyle.isDisplayed();}
    public boolean isBodyStyleSelectorDisplayed() {return bodyStyleSelector.isDisplayed();}

     //check if Make elements are  displayed
    public boolean isLabelMakeDisplayed() {return labelMake.isDisplayed();}
    public boolean isMakeSelectorDisplayed() {return makeSelector.isDisplayed();}

    //check if Model elements  are displayed
    public boolean isLabelModelDisplayed() {return labelModel.isDisplayed();}
    public boolean isModelSelectorDisplayed() {return modelSelector.isDisplayed();}

    //check if Year elements  are displayed
    public boolean isLabelYearDisplayed() {return labelYear.isDisplayed();}
    public boolean isMinYearSelectorDisplayed() {return minYearSelector.isDisplayed();}
    public boolean isMaxYearSelectorDisplayed() {return maxYearSelector.isDisplayed();}

   //check if Price elements  are displayed
   public boolean isLabelPriceDisplayed() {return labelPrice.isDisplayed();}
   public boolean isMinPriceInputDisplayed() {return minPriceInput.isDisplayed();}
   public boolean isMaxPriceInputDisplayed() {return maxPriceInput.isDisplayed();}

   //check if Odometer elements  are displayed
   public boolean isLabelOdometerDisplayed() {return labelOdometer.isDisplayed();}
   public boolean isMinOdometerInputDisplayed() {return minOdometerInput.isDisplayed();}
   public boolean isMaxOdometerInputDisplayed() {return maxOdometerInput.isDisplayed();}

   //check if Transmission elements are  displayed
   public boolean isLabelTransmissionDisplayed() {return labelTransmission.isDisplayed();}
   public boolean isTransmissionSelectorDisplayed() {return transmissionSelector.isDisplayed();}

   //check if Frequency elements are  displayed
   public boolean isLabelFrequencyDisplayed() {return labelFrequency.isDisplayed();}
   public boolean isFrequencySelectorDisplayed() {return frequencySelector.isDisplayed();}

   //check if Expires elements are  displayed
   public boolean isLabelExpiresDisplayed() {return labelExpires.isDisplayed();}
   public boolean isExpiresSelectorDisplayed() {return expiresSelector.isDisplayed();}










 public boolean isSecurityTitleDisplayed(){
        return securityTitle.isDisplayed();
    }

    public boolean isAsteriskTextDisplayed(){
        return asteriskText.isDisplayed();
    }

    public boolean isAsteriskCaptchaDisplayed(){
        return asteriskCaptcha.isDisplayed();
    }

    public boolean isAsteriskNoteDisplayed(){
        return asteriskNote.isDisplayed();
    }

    public void clickOnSubmit(){
        submitButton.click();
    }

    /*  public void getInputBorderColor(){
        ArrayList<Object> requiredFieldsArray = new ArrayList<Object>();
        Iterator iterator = requiredFieldsArray.iterator();

        requiredFieldsArray.add(firstNameInput);
        requiredFieldsArray.add(lastNameInput);
        requiredFieldsArray.add(phoneNumInput);
        requiredFieldsArray.add(emailInput);
        requiredFieldsArray.add(zipInput);

        for (int i=0; i<requiredFieldsArray.size(); i++){

        }
        while(iterator.hasNext()){

        }
        firstNameInput.getCssValue("border-color");
    }*/
    //GET COLOR of the LABELS OF the REQUIRED FIELDS
    public String getLabelFirstNameColor() {return  labelFirstName.getCssValue("color");}
    public String getLabelLastNameColor() {return  labelLastName.getCssValue("color");}
    public String getLabelPhoneColor() {return  labelPhone.getCssValue("color");}
    public String getLabelEmailAddressColor() {return  labelEmailAddress.getCssValue("color");}

    //GET BORDER-COLOR of the INPUTS FOR REQUIRED FIELDS
    public String getFirstNameInputBorderColor() {
        return firstNameInput.getCssValue("border-color");
    }
    public String getLastNameInputBorderColor() { return lastNameInput.getCssValue("border-color"); }
    public String getPhoneNumInputBorderColor() {
        return phoneNumInput.getCssValue("border-color");
    }
    public String getEmailInputBorderColor() {
        return emailInput.getCssValue("border-color");
    }

    //GET INPUTS CLASS
    public String getFirstNameInputClass() {return firstNameInput.getAttribute("class"); }
    public String getEmailInputClass() {
        return emailInput.getAttribute("class");
    }
    public String getLastNameInputClass() {
        return lastNameInput.getAttribute("class");
    }
    public String getPhoneNumInputClass() {
        return phoneNumInput.getAttribute("class");
    }

    //GET COLOR OF ASTERISK OF THE REQUIRED FIELDS
    public String getAsteriskFirstNameColor() {return  asteriskFirstName.getCssValue("color");}
    public String getAsteriskLastNameColor() {return  asteriskLastName.getCssValue("color");}
    public String getAsteriskPhoneColor() {return  asteriskPhone.getCssValue("color");}
    public String getAsteriskEmailAddressColor() {return  asteriskEmailAddress.getCssValue("color");}
    public String getAsteriskNoteColor() {return  asteriskNote.getCssValue("color");}


    //DROPDOWN DISABLED
    public String getBodyStyleDisabled() { return bodyStyleSelector.getAttribute("disabled");}
    public String getMakeDisabled() { return makeSelector.getAttribute("disabled");}
    public String getModelDisabled() { return modelSelector.getAttribute("disabled");}


   //Selected methods
    public boolean isFirstNameSelected(){
        return firstNameInput.isSelected();
    }
    public boolean isLastNameSelected(){return lastNameInput.isSelected(); }
    public boolean isPhoneNumSelected(){
        return phoneNumInput.isSelected();
    }
    public boolean isEmailSelected(){
        return emailInput.isSelected();
    }

    //Select elements in Dropdown Motorized Type
    public void setMotorisedType (String motorizedType) { //method to select motorized type,
        motorizeTypeDropdown().selectByValue(motorizedType); //as attribute need the motorized type value number as a string
    }
    //Select elements in Dropdown Type
    public void setType (String type) { //method to select  type,
        typeDropdown().selectByValue(type); //as attribute need the type value number as a string
    }

    //Select elements in Dropdown BodyStyle
    public void setBodyStyle (String bodyStyle) { //method to select Body Style,
        /*WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.name("body_style"))); */

        bodyStyleDropdown().selectByValue(bodyStyle); //as attribute need the Body Style value number as a string
    }

    //Select elements in Dropdown Make
    public void setMake (String make) { //method to select Make,
           makeDropdown().selectByValue(make); //as attribute need the Make value number as a string
    }

    //Select elements in Dropdown Model
    public void setModel (String make) { //method to select Model,
        modelDropdown().selectByValue(make); //as attribute need the Model value number as a string
    }

    //Select elements in MIN YEAR
    public void setMinYear (String minYear) { //method to select MIN YEAR,
     minYearDropdown().selectByValue(minYear); //as attribute need the MIN YEAR value number as a string
    }

   //Select elements in MAX YEAR
    public void setMaxYear (String maxYear) { //method to select MAX YEAR,
    maxYearDropdown().selectByValue(maxYear); //as attribute need the MAX YEAR value number as a string
   }

    //Select elements in Transmission
    public void setTransmission (String transmission) { //method to select Transmission,
    transmissionDropdown().selectByValue(transmission); //as attribute need the Transmission value number as a string
    }

    //Select elements in Frequency
    public void setFrequency (String frequency) { //method to select Transmission,
    frequencyDropdown().selectByValue(frequency); //as attribute need the Transmission value number as a string
   }

   //Select elements in Expires
   public void setExpires (String expires) { //method to select Transmission,
    expiresDropdown().selectByValue(expires); //as attribute need the Transmission value number as a string
   }

    public NotifyMe fillFirstName(String firstName){
     firstNameInput.sendKeys(firstName);
     return this;
    }


    public NotifyMe fillLastName(String lastName) {
       lastNameInput.sendKeys(lastName);
        return this;
    }

    public NotifyMe fillEmail(String emailAddress) {
        emailInput.sendKeys(emailAddress);
        return this;
    }


    public NotifyMe fillPhoneField(String phoneNumber) {
     phoneNumInput.click();
     phoneNumInput.sendKeys(Keys.HOME);
     phoneNumInput.sendKeys(phoneNumber);
     return this;

    }

    public NotifyMe fillMinPrice(String minPrice) {
     minPriceInput.sendKeys(minPrice);
     return this;
    }

    public NotifyMe fillMaxPrice(String maxPrice) {
     maxPriceInput.sendKeys(maxPrice);
     return this;
    }

    public NotifyMe fillMinOdometer(String minOdometer) {
     minOdometerInput.sendKeys(minOdometer);
     return this;
    }

    public NotifyMe  fillMaxOdometer(String maxOdometer) {
     maxOdometerInput.sendKeys(maxOdometer);
     return this;
    }



    @FindAll(@FindBy( how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='dotted_note3'][contains(text(), 'test_4@dxloo.com')]"))
    private List<WebElement> emailContexts; //list of all emails for the form Notify

    public List<String> getRandomElements(final int amount, final List<String> list) {
        ArrayList<String> returnList = new ArrayList<String>(list);

        Collections.shuffle(returnList); // тут делаем рандом
        if (returnList.size() > amount) { // отрезаем не нужную часть
            // тут отрезаем не нужную часть
            list.subList(returnList.size() - amount, returnList.size()).clear();
          }
            return returnList;
        }



}
