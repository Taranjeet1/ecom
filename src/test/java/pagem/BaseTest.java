package pagem;

import Pageobjects.Basepage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Asus on 25/07/2015.
 */
public class BaseTest extends Basepage {
    String url=Loadproperties.getProperty("url");
    @Before

public void startbrowser(){
        driver = new FirefoxDriver();
        driver.get(url);
        Utils.waitforpagetoLoad(10);
        Utils.maximizeWindow();

    }

//@After
  //  public void closeBrowser(){
    //driver.quit();
}

