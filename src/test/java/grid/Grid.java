package grid;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testcase.TestBase;
import dmsAuction.AdminGridPage;
import org.openqa.selenium.Keys;

import javax.swing.*;
import java.util.List;


/**
 * Created by Home on 21.02.2017.
 */
public class Grid extends TestBase  {
    private int rows;
    private int cells;
    private String num;
    private int i;
    private String num1;
    private String num2;
    private String num3;
    private WebElement cellelEment;
    private WebElement table;
    private List<WebElement> tabelsList;
    private String id;



    @BeforeClass
    public void openGridPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        loginPage.loginToDms();
        wait.until(jsLoad);
        Thread.sleep(1000);
        driver.get(baseUrl+"/dms/auctions/admin#grading");
        gridPage = PageFactory.initElements(driver, AdminGridPage.class);
        wait.until(jsLoad);
        wait.until(jQueryLoad );
        Thread.sleep(1000);


    }

    @Test(groups = "dms")
    public void exteriorCheck() throws InterruptedException {
        Actions action = new Actions(driver);
        int virsection = 1;

       do {
           Thread.sleep(2000);
            num1 = Integer.toString(virsection);
            gridPage.virSection(num1).click();  // selected Vir section
            Thread.sleep(2000);



           int size = gridPage.elementsInVirSection(num1).size(); //определить количество элементоа в выпадающем списке VIR секции
        //   JOptionPane.showMessageDialog(null, "size ="+ size);
           int i = 1;
            do {

                num = Integer.toString(i);
                gridPage.exteriorElement(num, num1).click(); //кликнуть на элемент VIR секции
                Thread.sleep(1000);

                List<WebElement> tablesList = gridPage.getTableList(num, num1);
                int sizerT = tablesList.size(); // оределить количество таблиц
              //  JOptionPane.showMessageDialog(null, "Количество таблиц в ДОМ ="+ sizerT); //вывод на экран количества рядов
                WebElement table = tablesList.get(sizerT-1);
               // JOptionPane.showMessageDialog(null, "последняя таблица ="+ table);

                id = table.getAttribute("id");
             //   JOptionPane.showMessageDialog(null, "id таблицы ="+ id);


                int sizer = gridPage.getTableRows(id); // оределить количество рядов в открывшейся таблице
              //  JOptionPane.showMessageDialog(null, "rows ="+ sizer); //вывод на экран количества рядов
                int sizec = gridPage.getTableCells(id); // оределить количество столбцов в открывшейся таблице
              //  JOptionPane.showMessageDialog(null, "cells ="+sizec); //вывод на экран количества столбцов

                String xpathofwrapper = "//*[@id='main-vir-sections']/li[" +num1+"]//li[" +num+"]/div[3]/div[@class='expand-wrapper']";

                int row =2; //начинаем со второго ряда - там первая ячейка с полем инпут
               do {
                   num2 = Integer.toString(row); // переводим номер ряда в строку для использования при  формировании хpath ячейки
                   WebElement Element = gridPage.cell(id, num2, "2");
                   action.moveToElement(Element).perform();
                     JOptionPane.showMessageDialog(null, "move to element");
                   Thread.sleep(2000);

                   int cell = 2; // начинаем со второго столбца - там первая ячейка с полем инпут
                   do {

                       num3 = Integer.toString(cell); // переводим номер столбца в строку для использования при  формировании хpath ячейки
                       //   JOptionPane.showMessageDialog(null, "row and cell =" + row + "and" + cell);

                       WebElement cellElement = gridPage.cell(id, num2, num3); // вебэлемент -ячейка
                        String title = cellElement.getAttribute("title"); // получаем атрибут ячейки "title"
                         boolean titleEmpty = title.isEmpty(); //проверяем если ячейка пустая

                       if (titleEmpty != true) {    // если ячейка таблицы не пустая, то

                           Thread.sleep(700);
                           cellElement.click(); // кликаем на ячейку
                           WebElement cellinput = gridPage.inputCell(id, num2, num3);
                           Thread.sleep(700);
                           cellinput.sendKeys(Keys.ENTER); // кликаем Enter

                       }

                      cell = cell+1; // колисемтво проёденных ячеек

                   } while (cell <= sizec);


                row = row+1; // переходим на следующий ряд



              //     scrollTable3(xpathofwrapper);



               } while (row <= sizer);

                gridPage.exteriorElement(num, num1).click(); //закрываем элемент секции грид, с прокликаной таблицей
                i = i + 1; // переходим к следующему элементу секции

            } while (i < size );

           gridPage.virSection(num1).click(); // сворачиваем дерево пройденной секции
           Thread.sleep(1000);
           virsection = virsection+1; //переходим к следующей секции

        } while (virsection<6); // тест для первых пяти секций грид
    }



        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

       private void scrollTable2(WebElement table) {
           ((JavascriptExecutor)driver).executeScript("table.scrollLeft = 20;");


       }

       private WebElement scrollTable(WebElement cellelEment, String xpathofcell) throws InterruptedException {

          // ((JavascriptExecutor)driver).executeScript("('#" +id+ "').scrollLeft(+100);");
           ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                   ,cellelEment);
         cellelEment = (new WebDriverWait(driver, 10))
                 .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathofcell)));
                 return cellelEment;

       }

    // wait for jQuery to load
    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
        @Override
        public Boolean apply(WebDriver driver) {
            try {
                return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
            }
            catch (Exception e) {
                // no jQuery present
                return true;
            }
        }
    };

    private void scrollTable3( String xpath) throws InterruptedException {

        WebElement element = driver.findElement(By.xpath(xpath));

        ((JavascriptExecutor) driver).executeScript("element.scrollLeft(+100);");
    }

}


