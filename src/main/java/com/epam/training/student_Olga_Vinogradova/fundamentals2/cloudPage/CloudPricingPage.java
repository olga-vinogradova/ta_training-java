package com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CloudPricingPage {
    private WebDriver driver;

    public CloudPricingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By numberOfInstancesInput = By.xpath ("//input[@ng-model='listingCtrl.computeServer.quantity']");
    private By seriesDropdown = By.xpath("//md-select[@name='series']/parent::md-input-container");
    private By seriesSelectOption = By.xpath(  "//md-option[@value='n1']/div");
    private By machineTypeDropdown = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    private By machineTypeSelectOption = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    private By addGPUsCheckbox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    private By gpuTypeDropdown = By.xpath( "//md-select[@placeholder='GPU type']");
    private By gpuTypeSelectOption = By.xpath("////md-option[@value='NVIDIA_TESLA_V100']");
    private By numberOfGPUsDropdown = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGPUSelectOption = By.xpath("//md-option[@value='1']");
    private By localSSDDropdown = By.xpath("//md-select[@placeholder='Local SSD']");
    private By localSSDSelectOption = By.xpath("//md-option[@value='2']");
    private By datacenterLocationDropdown = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By datacenterLocationSelectOption = By.xpath("//md-option[@value='europe-west3']");
    private By committedUsageDropdown = By.xpath("//md-select[@placeholder='Committed usage']");
    private By committedUsageSelectOption = By.xpath("//md-option[@value='1']/div[text()='1 Year']");
    private By addToEstimateButton = By.xpath("//button[contains(text(), 'Add to Estimate')]");




    public WebElement getNumberOfInstancesInput() {
        return driver.findElement(numberOfInstancesInput);
    }

    public WebElement getSeriesDropdown() {
        return driver.findElement(seriesDropdown);
    }

    public WebElement getSeriesSelectOption() {
        return driver.findElement(seriesSelectOption);
    }

    public WebElement getMachineTypeDropdown() {
        return driver.findElement(machineTypeDropdown);
    }

    public WebElement getMachineTypeSelectOption() {
        return driver.findElement(machineTypeSelectOption);
    }

    public WebElement getAddGPUsCheckbox() {
        return driver.findElement(addGPUsCheckbox);
    }

    public WebElement getGpuTypeDropdown() {
        return driver.findElement(gpuTypeDropdown);
    }

    public WebElement getGpuTypeSelectOption() {
        return driver.findElement(gpuTypeSelectOption);
    }

    public WebElement getNumberOfGPUsDropdown() {
        return driver.findElement(numberOfGPUsDropdown);
    }

    public WebElement getNumberOfGPUSelectOption() {
        return driver.findElement(numberOfGPUSelectOption);
    }

    public WebElement getLocalSSDDropdown() {
        return driver.findElement(localSSDDropdown);
    }

    public WebElement getLocalSSDSelectOption() {
        return driver.findElement(localSSDSelectOption);
    }

    public WebElement getDatacenterLocationDropdown() {
        return driver.findElement(datacenterLocationDropdown);
    }

    public WebElement getDatacenterLocationSelectOption() {
        return driver.findElement(datacenterLocationSelectOption);
    }

    public WebElement getCommittedUsageDropdown() {
        return driver.findElement(committedUsageDropdown);
    }

    public WebElement getCommittedUsageSelectOption() {
        return driver.findElement(committedUsageSelectOption);
    }

    public WebElement getAddToEstimateButton() {
        return driver.findElement(addToEstimateButton);
    }


    public void fillOutNumberOfInstances() {
        WebDriverWait waitForCalculatorTest = new WebDriverWait(driver, Duration.ofSeconds(50));
        waitForCalculatorTest.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[contains(@name,'goog_')]")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'goog_')]")));
        driver.switchTo().frame("myFrame");
        getNumberOfInstancesInput().sendKeys("4");
    }

    public void fillOutSeries(){
        getSeriesDropdown().click();
        getSeriesSelectOption().click();
    }

    public void fillOutMachine() {
            getMachineTypeDropdown().click();
            getMachineTypeSelectOption().click();
    }

    public void fillOutGPU(){
        getAddGPUsCheckbox().click();
        getGpuTypeDropdown().click();
        getGpuTypeSelectOption().click();
        getNumberOfGPUsDropdown().click();
        getNumberOfGPUSelectOption().click();

    }

    public void fillSSD(){
        getLocalSSDDropdown().click();
        getLocalSSDSelectOption().click();
    }
    public void fillLocation(){
        getDatacenterLocationDropdown().click();
        getDatacenterLocationSelectOption().click();
    }
    public void fillCommittedUsage(){
        getCommittedUsageDropdown().click();
        getCommittedUsageSelectOption().click();
    }

    public void clickAddToEstimate() {
        getAddToEstimateButton().click();
    }
}
