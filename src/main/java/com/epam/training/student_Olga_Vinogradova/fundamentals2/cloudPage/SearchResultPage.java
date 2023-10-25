package com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResultPage {
    private WebDriver driver;
    private String searchResultLinkText;

    public SearchResultPage(WebDriver driver, String searchResultLinkText) {
        this.driver = driver;
        this.searchResultLinkText = searchResultLinkText;
    }


    public void clickGoogleCloudPricingCalculator() {
        driver.findElement(By.partialLinkText(searchResultLinkText)).click();
    }
}