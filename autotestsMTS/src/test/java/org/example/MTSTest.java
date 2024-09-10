package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MTSTest {
    WebDriver driver;
    StorePage storePage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://shop.mts.by/phones/");
        storePage = new StorePage(driver);
        storePage.clickCookieAgree();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(description = "Проверка работы фильтра по бренду товара. Бренд Xiaomi")
    public void brendFiltertest1() {
        storePage.clickFilterBrend();
        storePage.clickFilterXiaomiCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Бренд: Xiaomi"));
    }

    @Test(description = "Проверка работы фильтра по бренду товара. Бренд Samsung")
    public void brendFiltertest2() {
        storePage.clickFilterBrend();
        storePage.clickFilterSamsungCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Бренд: Samsung"));
    }

    @Test(description = "Проверка работы фильтра по цвету товара. Цвет: Черный")
    public void colorFiltertest1() {
        storePage.clickFilterColor();
        storePage.clickFilterBlackCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Цвет: Черный"));
    }

    @Test(description = "Проверка работы фильтра по цвету товара. Цвет: Синий")
    public void colorFiltertest2() {
        storePage.clickFilterColor();
        storePage.clickFilterBlueCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Цвет: Синий"));
    }

    @Test(description = "Проверка работы фильтра по операционной системе товара. Операционная система: iOS")
    public void OSFiltertest1() {
        storePage.clickFilterOS();
        storePage.clickFilterIOSCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Операционная система: iOS"));
    }

    @Test(description = "Проверка работы фильтра по операционной системе товара. Операционная система: Android")
    public void OSFiltertest2() {
        storePage.clickFilterOS();
        storePage.clickFilterAndroidCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Операционная система: Android"));
    }

    @Test(description = "Проверка работы фильтра по Производителю вашего устройства. Производитель вашего устройства: Huawei")
    public void yourPhoneFiltertest1(){
        storePage.clickFilterYourPhone();
        storePage.clickFilterYourPhoneHuaweiCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Производитель вашего устройства: Huawei"));
    }

    @Test(description = "Проверка работы фильтра по Производителю вашего устройства. Производитель вашего устройства: POCO")
    public void yourPhoneFiltertest2(){
        storePage.clickFilterYourPhone();
        storePage.clickFilterYourPhonePOCOCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Производитель вашего устройства: POCO"));
    }

    @Test(description = "Проверка работы фильтра по классу износа. Класс износа: A")
    public void damageClassFiltertest1(){
        storePage.clickFilterDamage();
        storePage.clickFilterADamageCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Класс износа: A"));
    }

    @Test(description = "Проверка работы фильтра по классу износа. Класс износа: В")
    public void damageClassFiltertest2(){
        storePage.clickFilterDamage();
        storePage.clickFilterBDamageCheckBox();
        Assert.assertTrue(storePage.checkFilterTitle("Класс износа: B"));
    }
}
