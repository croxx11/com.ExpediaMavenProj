package Com.HMRCProj;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 04/03/2017.
 */
public class UtilBrowserPage {

    public class BrowserKeyPage {

         WebDriver driver;

        @BeforeClass
        public WebDriver Browser()  {
            //System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\ZLATAN\\geckodriver.exe");
            //driver = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\ZLATAN\\ChromeDriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://www.gov.uk/government/organisations/hm-revenue-customs");
            driver.manage().window().maximize();
            String HMRC = driver.getTitle();
           // Assert.assertTrue(HMRC.contains(Customs - GOV.UK));
            System.out.println("The page title is" + driver.getTitle());
            return driver;
        }

        //@AfterClass
        // public void TearDown(){
        //driver.quit();

    }

}
