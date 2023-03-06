package Steps.glue;

import com.codeborne.selenide.*;
import io.cucumber.java.ru.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.By;

import javax.management.ValueExp;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class StepDefinition {

    @Когда("Открываем админпанель и авторизовываемся")
    public void открываем_админпанель_и_авторизовываемся() {
        Configuration.headless = false;
        open("http://192.168.100.39/");
        $(By.id("username")).setValue("rzhulin");
        $(By.id("password")).setValue("voodoo");
        $(By.id("kc-login")).click();


    }
    @Когда("Вводим в поле {string} значение {string} нажимаем искать")
    public void вводим_в_поле_значения_и_ищем(String Pole, String value) {
        $(By.name(Pole)).setValue(value);
        $(".css-1hw9j7s").click();
    }
    @И ("Найдено записей {string}")
    public void найдено_записей(String CountElement) {
        Assert.assertEquals(CountElement, $(".MuiTablePagination-displayedRows").text());
    }

    @Также("Подождать {int} миллисекунд")
    public void ждать_миллисекунд(int arg0) throws InterruptedException {
            Thread.sleep(arg0);
    }

    @И ("Переходим на вкладку № {int}")
    public void переходим_на_вкладку(Integer Vkladka){
 //       $(".MuiButtonBase-root").shouldHave(text(Vkladka)).click();
        String selector = ".MuiButtonBase-root.MuiTab-root.MuiTab-labelIcon:nth-child("+Integer.toString(Vkladka)+")";
        $(selector).click();
    }

    @Когда ("Вводим значение {string}")
    public void  когда_вводим_значение(String value) throws InterruptedException {
        Thread.sleep(1000);
        $(By.name("code")).sendKeys(value);
    //    Thread.sleep(5000);
        $(".MuiCollapse-wrapperInner").click();



     //   $(By.className("css-105mfs8")).click();
      //  $(By.className(":r2k:-treeitem_103")).click();
      //  $(By.className(":r2k:-3175")).click();


     //   $(".MuiTreeItem-root css-105mfs8").click();

    }
}
