package yantraQA.stepdefs;


import yantraQA.context.*;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class StepDefs {

    @Autowired
    ScenarioContext scenarioContext;

    @Given("I have something")
    public void i_have_something() {
        log.info("Scenario COntext object hash: " + scenarioContext.hashCode());
        log.info("Old values of users: " + scenarioContext.getUsers().toString());

//        Character a;
//        a.
//        a.length()


    }


}
