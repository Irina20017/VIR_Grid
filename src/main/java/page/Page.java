package page;

import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;


/**
 * Created by Home on 28.01.2017.
 */
public class Page {

    //объявление класса
    //   private static final Logger LOG = LogFactory.getLogger(Page.class);

    protected WebDriver driver; //объявление переменной driver класса WebDriver доступна классам потомкам

	/*
	 * Constructor injecting the WebDriver interface
	 *
	 * @param webDriver
	 */

    public Page(WebDriver webDriver) {
        this.driver = webDriver;
    } //конструктор класса принимает на входе переменную класса WebDriver возвращает класс

    public WebDriver getWebDriver() {
        return driver;
    } //метод getWebDriver() возвращает переменную driver

    public String getTitle() {
        return driver.getTitle();
    } //метод getTitle() возвращает заголовок страницы

    public String getPageUrl() {               //метод getPageUrl() возвращает текуший URL
        String pageUrl = driver.getCurrentUrl();
        //      LOG.info("Current page url is: " + pageUrl);
        return pageUrl;
    }
}
