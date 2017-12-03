package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{

    private BaseUtil base;
    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser\n");

        System.setProperty("geckodriver","C:\\Users\\lkaczmarczyk1\\Desktop\\Trening\\Drivers");
        base.driver = new FirefoxDriver();
    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser\n");
    }


}
