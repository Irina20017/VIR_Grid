package grid;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testcase.TestBase;
import dmsAuction.AdminGridPage;
import org.openqa.selenium.Keys;
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
        waitForJSandJQueryToLoad();
        driver.get(baseUrl+"/dms/auctions/admin#grading");
        gridPage = PageFactory.initElements(driver, AdminGridPage.class);
        waitForJSandJQueryToLoad();

    }

    @Test(groups = "dms")
    public void exteriorCheck() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions action = new Actions(driver);
        int virsection = 1;

       do {

            num1 = Integer.toString(virsection);
            gridPage.virSection(num1).click();  // selected Vir section
            waitForJSandJQueryToLoad();


           int size = gridPage.elementsInVirSection(num1).size(); //определить количество элементоа в выпадающем списке VIR секции

           int i = 1;
            do {

                num = Integer.toString(i);
                WebElement gridElement = gridPage.exteriorElement(num, num1);
                action.moveToElement(gridElement).perform();
                gridElement.click(); //кликнуть на элемент VIR секции
                waitForJSandJQueryToLoad();


                List<WebElement> tablesList = gridPage.getTableList(num, num1);
                int sizerT = tablesList.size(); // оределить количество таблиц в <li>
                WebElement table = tablesList.get(sizerT-1); //последняя таблица в <li>
                id = table.getAttribute("id"); //id таблицы
                int sizer = gridPage.getTableRows(id); // оределить количество рядов в открывшейся таблице
                int sizec = gridPage.getTableCells(id); // оределить количество столбцов в открывшейся таблице


                int row =2; //начинаем со второго ряда - там первая ячейка с полем инпут
               do {
                   num2 = Integer.toString(row); // переводим номер ряда в строку для использования при  формировании хpath ячейки
                   WebElement cellElement = gridPage.cell(id, num2, "1");
                   action.moveToElement(cellElement).perform();
                 //    JOptionPane.showMessageDialog(null, "move to element");

                   int cell = 2; // начинаем со второго столбца - там первая ячейка с полем инпут
                   do {

                        num3 = Integer.toString(cell); // переводим номер столбца в строку для использования при  формировании хpath ячейки
                        cellElement = gridPage.cell(id, num2, num3); // вебэлемент -ячейка
                        String title = cellElement.getAttribute("title"); // получаем атрибут ячейки "title"
                         boolean titleEmpty = title.isEmpty(); //проверяем если ячейка пустая

                       if (titleEmpty != true) {    // если ячейка таблицы не пустая, то

                           waitForJSandJQueryToLoad();
                           cellElement.click(); // кликаем на ячейку
                         WebElement cellinput = gridPage.inputCell(id, num2, num3);
                           cellinput.sendKeys(Keys.ENTER); // кликаем Enter
                           waitForJSandJQueryToLoad();
                       }
                      cell = cell+1; // колисемтво проёденных ячеек
                   } while (cell <= sizec);

                row = row+1; // переходим на следующий ряд
               } while (row <= sizer);

                gridPage.exteriorElement(num, num1).click(); //закрываем элемент секции грид, с прокликаной таблицей
                i = i + 1; // переходим к следующему элементу секции
            } while (i <= size );

           gridPage.virSection(num1).click(); // сворачиваем дерево пройденной секции
           waitForJSandJQueryToLoad();
           virsection = virsection+1; //переходим к следующей секции
        } while (virsection<6); // тест для первых пяти секций грид
    }


    public boolean waitForJSandJQueryToLoad() {

        WebDriverWait wait = new WebDriverWait(driver, 30);

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

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }


}


