package yantraQA.stepdefs;

import org.springframework.test.context.ContextConfiguration;
import yantraQA.config.*;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
//@ContextConfiguration(classes = TestConfig.class)
@SpringBootTest(classes = TestConfig.class)
public class CucumberSpringConfiguration { }