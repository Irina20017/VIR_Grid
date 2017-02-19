package settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import page.Page;

import java.util.List;



/**
 * Created by Irina M. on 19.02.2017.
 */
public class LeadsEmailnNotify extends Page {

    public LeadsEmailnNotify(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='dotted_note3'][contains(text(), 'test_6@dxloo.com')]")
    private WebElement emailContext;

    @FindAll(@FindBy( how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='dotted_note3'][contains(text(), 'test_6@dxloo.com')]"))
    private List<WebElement> emailContexts; //list of all emails for the form Notify

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//a[@class='button-style b_edit notranslate']")
    private WebElement contactEdit;// button Edit for Leads Email Notify Me

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//a[@class='button-style b_add']")
    private WebElement contactAdd; //button Add

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='email_row'][last()]//input[@class='leads_email my_form']")
    private WebElement contactInput; //new input field for email

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='email_row'][last()]//input[@class='leads_email_type_html']")
    private WebElement htmlChckbox; // HTML checkbox for new created contact

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//a[@class='button-style b_save']")
    private WebElement contactSave; // button "Save" in Editor


    public void ifEmailPresent(){
        String email = "test_6@dxloo.com";
        int k=0;
        for (int i=0; i<emailContexts.size();i++){
            //    emailContexts.get(i).getText();
            if(emailContexts.get(i).getText() == "test_6@dxloo.com") { // email present
                k = k++;
                contactEdit.click(); // open editor

                if(driver.findElement(By.xpath("//tr[@id=\'leads_email_notify\']//div[@class=\'email_row\']['"+i+"']//input[@class=\'leads_email_type_html\']")).getAttribute("checked") == null){
                    driver.findElement(By.xpath("//tr[@id=\'leads_email_notify\']//div[@class=\'email_row\']['"+i+"']//input[@class=\'leads_email_type_html\']")).click();
                } // check HTML-checkbox if it is not checked

            }

            if(k==0) { // if email test_4@dxloo.com not found add new contact with this email
                contactEdit.click();
                contactAdd.click();
                contactInput.sendKeys(email);
                htmlChckbox.click();
                contactSave.click();
            }
        }
     /*   if(emailContext.isDisplayed() == false){
contactEdit.click();
contactAdd.click();
htmlChckbox.click();
contactSave.click();
        }*/
    }

}
