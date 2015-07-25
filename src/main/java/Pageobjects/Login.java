package Pageobjects;

import org.openqa.selenium.By;
import pagem.Utils;

/**
 * Created by Asus on 25/07/2015.
 */


public class Login extends Basepage {

    By usernamefield=By.id("Email");
    By passwordfield=By.id("Password");
    By loginfield=By.xpath("//input[@value='Log in']");

    public void login(String username,String password){
        Utils.enterText(usernamefield,username);
        Utils.enterText(passwordfield,password);
        Utils.click(loginfield);

    }
     public void clicklogin(By by){
         Utils.click(by);
     }

}
