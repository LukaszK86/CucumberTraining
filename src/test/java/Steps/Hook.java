package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser\n");
    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser\n");
    }


}
