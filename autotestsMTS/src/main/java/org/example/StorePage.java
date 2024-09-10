package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage {
    public WebDriver driver;
    WebDriverWait wait;

    public StorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    private String cookieAgreeXpath = "//*[@id='cookie-agree']";

    private String filterBrendXpath = "//div[contains(text(), 'Бренд')]";

    private String filterOSXpath = "//div[contains(text(), 'Операционная система')]";

    private String filterColorXpath = "//div[contains(text(), 'Цвет')]";

    private String filterYourPhoneXpath = "//div[contains(text(), 'Производитель вашего устройства')]";

    private String filterDamageXpath = "//div[contains(text(), 'Класс износа')]";

    private String filterXiaomiCheckBoxXpath = "//div[contains(@class, 'products-filters__section--active')]//span[contains(text(),'Xiaomi')]";

    private String filterSamsungCheckBoxXpath = "//div[contains(@class, 'products-filters__section--active')]//span[contains(text(),'Samsung')]";

    private String filterBlackCheckBoxXpath = "//div[contains(@class, 'products-filters__section__body__inner')]//span[contains(text(),'Черный')]";

    private String filterBlueCheckBoxXpath = "//div[contains(@class, 'products-filters__section__body__inner')]//span[contains(text(),'Синий')]";

    private String filterIOSCheckBoxXpath = "//div[contains(@class, 'products-filters__section__body__inner')]//span[contains(text(),'iOS')]";

    private String filterAndroidCheckBoxXpath = "//div[contains(@class, 'products-filters__section__body__inner')]//span[contains(text(),'Android')]";

    private String filterACheckBoxXpath = "//div[contains(@class, 'products-filters__section--active')]//span[contains(text(),'A')]";

    private String filterBCheckBoxXpath = "//div[contains(@class, 'products-filters__section--active')]//span[contains(text(),'B')]";

    private String filterHuaweiCheckBoxXpath = "//div[contains(@class, 'products-filters__section--active')]//span[contains(text(),'Huawei')]";

    private String filterPOCOCheckBoxXpath = "//div[contains(@class, 'products-filters__section--active')]//span[contains(text(),'POCO')]";

    private String filterTitleXpath  = "//div[@class='active-filters__unit__title']";

    public void clickCookieAgree() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cookieAgreeXpath))).click();
    }

    public void clickFilterBrend(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterBrendXpath))).click();
    }

    public void clickFilterOS(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterOSXpath))).click();
    }

    public void clickFilterColor(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterColorXpath))).click();
    }

    public void clickFilterYourPhone(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterYourPhoneXpath))).click();
    }

    public void clickFilterDamage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterDamageXpath))).click();
    }

    public void clickFilterXiaomiCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterXiaomiCheckBoxXpath))).click();
    }

    public void clickFilterSamsungCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterSamsungCheckBoxXpath))).click();
    }

    public void clickFilterBlackCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterBlackCheckBoxXpath))).click();
    }

    public void clickFilterBlueCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterBlueCheckBoxXpath))).click();
    }

    public void clickFilterIOSCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterIOSCheckBoxXpath))).click();
    }

    public void clickFilterAndroidCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterAndroidCheckBoxXpath))).click();
    }

    public void clickFilterYourPhoneHuaweiCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterHuaweiCheckBoxXpath))).click();
    }

    public void clickFilterYourPhonePOCOCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterPOCOCheckBoxXpath))).click();
    }

    public void clickFilterADamageCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterACheckBoxXpath))).click();
    }

    public void clickFilterBDamageCheckBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterBCheckBoxXpath))).click();
    }

    public boolean checkFilterTitle(String expectedTitle){
        String currentTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterTitleXpath))).getText();
        return currentTitle.equals(expectedTitle);
    }

}
