package yantraQA.stepdefs;


import yantraQA.context.*;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

@Log4j2
public class StepDefs1 {

    @Autowired
//    @Inject
    ScenarioContext scenarioContext;


    @When("I want to do something")
    public void i_want_to_do_something() {
        log.info("Setting new values.");
        scenarioContext.getUsers().setName("Anti-Akash");
        scenarioContext.getUsers().setAge("99");
    }



}
