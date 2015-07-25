package pagem;

import Pageobjects.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Asus on 25/07/2015.
 */
public class Utils extends Basepage {

public static void click(By by){
    driver.findElement(by).isDisplayed();
    driver.findElement(by).click();
}

public static void enterText(By by,String text){
    driver.findElement(by).clear();
    driver.findElement(by).sendKeys(text);
}
    public static void selectFrom(By by,String text){
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(text);
        }

public static void maximizeWindow(){
    driver.manage().window().maximize();
}

    public static void waitforpagetoLoad(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public static void waitforElement(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static String getText(By by){
    return driver.findElement(by).getText();

    }

    public static String getValue(By by){
        return driver.findElement(by).getAttribute("value");
    }

    public static boolean istextPresent(String text){
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }

    public static String randomDate(){
        DateFormat dateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format(new Date() );

    }

    public static boolean iselementPresent(By by){
        return driver.findElement(by).isDisplayed();
    }



}















