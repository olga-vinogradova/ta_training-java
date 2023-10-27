package com.epam.training.student_Olga_Vinogradova.fundamentals2.emailGeneratorPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmailGeneratorPage {
    public WebDriver driver;

    public EmailGeneratorPage(WebDriver driver) {
        this.driver = driver;
    }

    private By copyEmailButton = By.xpath("//button[p='Copy email']");
    private By openEmail = By.xpath("//p[contains(., 'New Compute User')]");
    private By priceInEmail = By.xpath("//td/*[starts-with(text(),'USD')]");
    public WebElement getEmailButton() {
        return driver.findElement(copyEmailButton);
    }
    public WebElement getOpenEmail(){return driver.findElement(openEmail);}
    public WebElement getPriceFromEmail(){return driver.findElement(priceInEmail);}
    public WebElement waitToClickTheElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void clickCopyEmailButton() {
        WebElement copyEmailButton = getEmailButton();
        waitToClickTheElement(copyEmailButton).click();
    }
    public void openReceivedEmail(){
        WebElement openEmail = getOpenEmail();
        waitToClickTheElement(openEmail).click();
    }
    public String findPriceInEmail(){
        return getPriceFromEmail().getText();
    }



}
