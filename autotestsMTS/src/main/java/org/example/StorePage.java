package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage {
    public WebDriver driver;

    public StorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement cookieAgree;

    @FindBy(xpath = "//*[@data-ga-item-index='1']")
    private WebElement product_1;

    @FindBy(xpath = "//div[contains(text(), 'Бренд')]")
    private WebElement filterBrend;

    @FindBy(xpath = "//div[contains(text(), 'Операционная система')]")
    private WebElement filterOS;

    @FindBy(xpath = "//div[contains(text(), 'Цвет')]")
    private WebElement filterColor;

    @FindBy(xpath = "//div[contains(@class, 'products-filters__section--active')]//span[contains(text(),'Xiaomi')]")
    private WebElement filterXiaomiCheckBox;

    @FindBy(xpath = "//div[contains(@class, 'products-filters__section__body__inner')]//span[contains(text(),'Черный')]")
    private WebElement filterBlackCheckBox;

    public void clickCookieAgree() {
        cookieAgree.click();
    }

    public void clickFilterBrend(){
        filterBrend.click();
    }

    public void clickFilterOS(){
        filterOS.click();
    }

    public void clickFilterColor(){
        filterColor.click();
    }

    public void clickFilterXiaomiCheckBox(){
        filterXiaomiCheckBox.click();
    }

    public void clickFilterBlackCheckBox(){
        filterBlackCheckBox.click();
    }
}
