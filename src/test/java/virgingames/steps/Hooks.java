package virgingames.steps;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import virgingames.propertyreader.PropertyReader;
import virgingames.utility.Utility;

public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
          final byte[]  screenshot =  getScreenShot();
          scenario.attach(screenshot , "image/png" , scenario.getName());
        }
        closeBrowser();

    }
}
