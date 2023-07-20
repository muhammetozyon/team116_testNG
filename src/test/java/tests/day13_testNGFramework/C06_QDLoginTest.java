package tests.day13_testNGFramework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C06_QDLoginTest {

    @Test(groups = {"smoke","mini regression1","regression"})
    public void test01(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //2- login linkine basin
        QdPage qdPage = new QdPage();
        qdPage.ilkLoginLinki.click();

        // gelen cokie elementine click yaptim

       Driver.getDriver().findElement(By.xpath("//*[text()='Accept']")).click();



       // Driver.getDriver().manage().deleteAllCookies();   cookies leri kaldirmadi


        // 3- Kullanici email'i olarak valid email girin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));

        // 4- Kullanici sifresi olarak valid sifre girin
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        ReusableMethods.bekle(2);



        // 5- Login butonuna basarak login olun
        qdPage.loginButonu.click();

        // 6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(qdPage.basariliGirisKontrolElementi.isDisplayed());

        Driver.closeDriver();
    }
}