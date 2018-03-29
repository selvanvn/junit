package mastercard.endtoend;

import mastercard.utilities.DriverProvider;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import mastercard.pages.CerseiRegisterPage;
import mastercard.pages.CheckoutPage;
import mastercard.pages.ThreeDSVerificationPage;



/**
 * Created by e052988 on 3/22/18.
 */
public class AddCardSuccessHappyPathTest {


    CerseiRegisterPage cp,cp2,cp3;//= PageFactory.initElements(driver,CerseiRegisterPage.class);
    CheckoutPage c;//=PageFactory.initElements(driver,CheckoutPage.class);
    ThreeDSVerificationPage tp;//=PageFactory.initElements(driver,ThreeDSVerificationPage.class);
    String browser = "chrome";
    WebDriver driver; //=  DriverProvider.initialize(browser);



//    @Rule
//    public Retry retryRule = new Retry(3);


    @Before
    public void setup(){
        System.out.println("SETUP PHASE");
       driver.get("https://cersei.apps.stl.pcfstage00.mastercard.int/register");
        cp = new CerseiRegisterPage(driver);
        c =  new CheckoutPage(driver);
        tp = new ThreeDSVerificationPage(driver);
    }

    public void e2eflow()
    {
        cp.enterCardDetails("5413850000000123","11","20");
        cp.clickContinueButton();
        //c.clickCheckout();
        //tp.clickVerifyButton();
        //Assert.fail();
    }

    @Test
    public void addCardEndToEndFlow1()
    {
    e2eflow();
    }

    @Test

    public void addCardEndToEndFlow2()
    {
       e2eflow();
    }


    @Test
    public void addCardEndToEndFlow3()
    {
        e2eflow();
    }

    @Test
    public void addCardEndToEndFlow4()
    {
        e2eflow();

    }

    @Test
    public void addCardEndToEndFlow5()
    {
        e2eflow();
    }

    @Test
    public void addCardEndToEndFlow6()
    {
        e2eflow();

    }

    @Test
    public void addCardEndToEndFlow7()
    {
     e2eflow();

    }

    @Test
    public void addCardEndToEndFlow8()
    {
        e2eflow();
    }

    @Test
    public void addCardEndToEndFlow9()
    {
    e2eflow();
    }

    @Test
    public void addCardEndToEndFlow10()
    {
        e2eflow();
    }




    @After
    public void tearDown()
    {
        //System.out.println("TEARDOWN");
      driver.quit();

    }

}
