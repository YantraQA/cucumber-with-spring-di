package yantraQA.stepdefs;

import yantraQA.context.*;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class StepDefs2 {

    @Autowired
    ScenarioContext scenarioContext;

    @Then("Something Should happen")
    public void something_should_happen() {
        log.info("Verifying it is the same values and object");
        log.info(scenarioContext.hashCode());
        log.info("new values: " + scenarioContext.getUsers().toString());
    }

}
