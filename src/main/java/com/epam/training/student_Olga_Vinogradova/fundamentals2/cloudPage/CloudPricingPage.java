package com.epam.training.student_Olga_Vinogradova.fundamentals2.cloudPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    private By gpuTypeSelectOption = By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    private By numberOfGPUsDropdown = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGPUSelectOption = By.xpath("//md-option[@value='1']");
    private By localSSDDropdown = By.xpath("//md-select[@placeholder='Local SSD']");
    private By localSSDSelectOption = By.xpath("//md-option[@id='select_option_491'][@value='2']");
    private By datacenterLocationDropdown = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By datacenterLocationSelectOption = By.xpath("//md-option[@value='europe-west3']");
    private By committedUsageDropdown = By.xpath("//md-select[@id='select_139'][@placeholder='Committed usage']");
    private By committedUsageSelectOption = By.xpath("//md-option[@id='select_option_137'][@ng-value='1'][@value='1']");
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

    public WebElement waitToClickTheElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void fillOutNumberOfInstances() {
        WebDriverWait waitForCalculatorTest = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitForCalculatorTest.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[contains(@name,'goog_')]")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'goog_')]")));
        driver.switchTo().frame("myFrame");
        WebElement instancesInput = getNumberOfInstancesInput();
        waitToClickTheElement(instancesInput).sendKeys("4");
    }

    public void fillOutSeries() {
        WebElement seriesDropdown = getSeriesDropdown();
        WebElement seriesSelectOption = getSeriesSelectOption();
        waitToClickTheElement(seriesDropdown).click();
        waitToClickTheElement(seriesSelectOption).click();
    }

    public void fillOutMachine() {
        WebElement machineTypeDropdown = getMachineTypeDropdown();
        WebElement machineTypeSelectOption = getMachineTypeSelectOption();
        waitToClickTheElement(machineTypeDropdown).click();
        waitToClickTheElement(machineTypeSelectOption).click();
    }

    public void fillOutGPU() {
        WebElement addGPUsCheckbox = getAddGPUsCheckbox();
        WebElement gpuTypeDropdown = getGpuTypeDropdown();
        WebElement gpuTypeSelectOption = getGpuTypeSelectOption();
        WebElement numberOfGPUsDropdown = getNumberOfGPUsDropdown();
        WebElement numberOfGPUSelectOption = getNumberOfGPUSelectOption();

        waitToClickTheElement(addGPUsCheckbox).click();
        waitToClickTheElement(gpuTypeDropdown).click();
        waitToClickTheElement(gpuTypeSelectOption).click();
        waitToClickTheElement(numberOfGPUsDropdown).click();
        waitToClickTheElement(numberOfGPUSelectOption).click();
    }

    public void fillSSD() {
        WebElement localSSDDropdown = getLocalSSDDropdown();
        WebElement localSSDSelectOption = getLocalSSDSelectOption();
        waitToClickTheElement(localSSDDropdown).click();
        waitToClickTheElement(localSSDSelectOption).click();
    }

    public void fillLocation() {
        WebElement datacenterLocationDropdown = getDatacenterLocationDropdown();
        WebElement datacenterLocationSelectOption = getDatacenterLocationSelectOption();
        waitToClickTheElement(datacenterLocationDropdown).click();
        waitToClickTheElement(datacenterLocationSelectOption).click();
    }

    public void fillCommittedUsage() {
        WebElement committedUsageDropdown = getCommittedUsageDropdown();
        WebElement committedUsageSelectOption = getCommittedUsageSelectOption();
        waitToClickTheElement(committedUsageDropdown).click();
        waitToClickTheElement(committedUsageSelectOption).click();
    }

    public void clickAddToEstimate() {
        WebElement addToEstimateButton = getAddToEstimateButton();
        waitToClickTheElement(addToEstimateButton).click();
    }
}