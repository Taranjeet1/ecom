package pagem;

import Pageobjects.Basepage;
import Pageobjects.Homepage;
import Pageobjects.Login;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Asus on 25/07/2015.
 */
public class SmokeTest extends BaseTest {

    Login login=new Login();
    String username=Loadproperties.getProperty("username");
    String password=Loadproperties.getProperty("password");
    String errormsg=Loadproperties.getProperty("errormsg");
    By loginbuttton=By.linkText("Log in");
    By errormsgfield=By.xpath("//div[2]/div/span");





@Test

    public void loginPage(){
    login.clicklogin(loginbuttton);
    login.login(username,password);
    Assert.assertEquals(errormsg, Utils.getText(errormsgfield));
            // Assert.assertTrue(Utils.istextPresent(errormsg));
}




}
