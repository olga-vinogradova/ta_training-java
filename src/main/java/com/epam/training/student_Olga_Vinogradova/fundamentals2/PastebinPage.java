package com.epam.training.student_Olga_Vinogradova.fundamentals2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PastebinPage {
    public WebDriver driver;

    public PastebinPage(WebDriver driver) {
        this.driver = driver;
    }

    private By textArea = By.id("postform-text");
    private By expirationDropdown = By.id("select2-postform-expiration-container");
    private By tenMinutesOption = By.xpath("//li[normalize-space()='10 Minutes']");
    private By pasteName = By.id("postform-name");
    private By createButton = By.xpath("//button[@class='btn -big']");

    public WebElement getTextArea() {
        return driver.findElement(textArea);
    }

    public WebElement getExpirationDropdown() {
        return driver.findElement(expirationDropdown);
    }

    public WebElement getTenMinutesOption() {
        return driver.findElement(tenMinutesOption);
    }

    public WebElement getPasteName() {
        return driver.findElement(pasteName);
    }

    public WebElement getCreateButton() {
        return driver.findElement(createButton);
    }

    public void setText(String text) {
        getTextArea().sendKeys(text);
    }

    public void selectExpiration() {
        getExpirationDropdown().click();
        getTenMinutesOption().click();
    }

    public void setPasteName(String name) {
        getPasteName().sendKeys(name);
    }

    public void createNewPaste() {
        getCreateButton().click();
    }
}