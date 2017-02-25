package dmsAuction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.Page;

import java.util.List;

/**
 * Created by Home on 21.02.2017.
 */
public class AdminGridPage extends Page {

    public AdminGridPage (WebDriver webDriver) {
        super(webDriver);
    }



     public WebElement exteriorElement (String num, String num1) { //  Элемент в Vir секции
        String xpath = "//*[@id='main-vir-sections']/li[" +num1+"]//ul/li[" +num+" ]/div[1]";
        WebElement elementExterior = driver.findElement(By.xpath(xpath));
        return elementExterior;
    }

    public WebElement rowElemwnt (String num, String num1, String num2) {
        WebElement elementRow = driver.findElement(By.xpath("//*[@id='main-vir-sections']/li[" +num1+"]//li[" +num+"]//tbody[1]/tr[" +num2+ "]"));
        return elementRow;
    }

    public int getTableRows ( String id) {
     // List<WebElement> tablerows = driver.findElements(By.xpath("//*[@id='main-vir-sections']/li[" +num1+"]//ul/li[" +num+"]//tabl[@id=" +id+ "]/tbody[1]/tr"));
        List<WebElement> tablerows = driver.findElements(By.xpath("//*[@id='" +id+ "']/tbody[1]/tr"));
        int sizer = tablerows.size();
        return sizer;
    }

    public List<WebElement> getTableList (String num, String num1) {
        List<WebElement> tableList = driver.findElements(By.xpath("//*[@id='main-vir-sections']/li[" +num1+"]//li[" +num+"]//table"));
        return tableList;
    }

    public int getTableCells (String id) {
        List<WebElement> tablecells = driver.findElements(By.xpath("//*[@id='" +id+ "']/tbody[1]/tr[2]/td"));
        int sizec = tablecells.size();
        return sizec;
    }

    public WebElement cell( String id, String num2, String num3) {
     //  WebElement cellElement = driver.findElement(By.xpath("//*[@id='main-vir-sections']/li[" +num1+"]//li[" +num+"]//tbody[1]/tr[" +num2+ "]/td[" +num3+ "]"));
        WebElement cellElement = driver.findElement(By.xpath("//*[@id='" +id+ "']/tbody[1]/tr[" +num2+ "]/td[" +num3+ "]"));
        return cellElement;
    }

    public String cellxpath( String id, String num2, String num3) {
        String cellxpath = "//*[@id='" +id+ "']/tbody[1]/tr[" +num2+ "]/td[" +num3+ "]";
        return cellxpath;
    }

    public WebElement inputCell (String id, String num2, String num3) {
        WebElement inputcell =  driver.findElement(By.xpath("//*[@id='" +id+ "']/tbody[1]/tr[" +num2+ "]/td[" +num3+ "]/input[1]"));
        return inputcell;
    }






    //*[@id='main-vir-sections']/li[1]//li[1]//tbody[1]/tr[2]/td[2] tabl's cell xpath





    public List<WebElement> elementsInVirSection (String num1) {
        List<WebElement> elementsInSection = driver.findElements(By.xpath("//*[@id='main-vir-sections']/li[" +num1+" ]//ul/li/div[1]"));
        return elementsInSection;
    }


    public WebElement virSection (String num1) {
        String xpath1 = "//*[@id='main-vir-sections']/li[" +num1+" ]/div[1]";
        WebElement elementVir = driver.findElement(By.xpath(xpath1));
        return elementVir;
    }


}
