package Com.HMRCProj2;

import Com.HMRCProj.UtilBrowserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by User on 04/03/2017.
 */
public class LoginPage extends UtilBrowserPage {
     WebDriver driver = null;

       public LoginPage(WebDriver driver){
           this.driver = driver;


       }
            @FindBy(how= How.CSS,using ="a[href*='register']")private WebElement SignInReg;

  }
