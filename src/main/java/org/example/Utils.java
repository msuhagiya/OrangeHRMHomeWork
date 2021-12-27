package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.example.BasePage.driver;

public class Utils extends BrowserManager{
    public static void captureScreenshot(String fileName)
    {
        //convert webdriver object to takesScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //call getScreenshotAs method to create image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //move image file to new destination
        File destFile = new File("src/test/Screenshots/"+fileName+currentTimeStamp()+".png");
        //copy file at destination
        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text)

    {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    public static String currentTimeStamp()
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhmmssa");
        return sdf.format(date);
    }

    public static void waitForClickable(By by, int timeInSecond)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeInSecond);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForVisible(By by, int timeForSecond)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeForSecond);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //selectByVisibleText for dropdown menu method created
    public static void doSelectByVisibleText(By by,String text)
    {
       Select select = new Select(driver.findElement(by));
       select.selectByVisibleText(text);
    }
    //selectByIndex for dropdown menu method created
    public static void doSelectByIndex(By by,int index)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    //selectByValue for dropdown menu method created
    public static void doSelectByValue(By by,String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void verifyCurrentURL(String url_name)
    {
        Assert.assertTrue(driver.getCurrentUrl().equals(url_name));
    }

}
