package dms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;
import utility.PropertyLoader;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class LoginPage extends Page {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    String login = PropertyLoader.loadProperty("super.login");

    @FindBy(how= How.ID, using ="login")
    private WebElement loginInput;

    @FindBy(how= How.ID, using ="password")
    private WebElement pwInput;

    @FindBy(how= How.ID, using ="login2")
    private WebElement signInButton;

    public void loginToDms(){
        loginInput.sendKeys(login);
        pwInput.sendKeys(PropertyLoader.loadProperty("super.pw"));
        signInButton.click();

            }

}
