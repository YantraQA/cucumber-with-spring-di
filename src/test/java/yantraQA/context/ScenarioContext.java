package yantraQA.context;


import yantraQA.model.Users;
import io.cucumber.spring.ScenarioScope;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
@ScenarioScope
public class ScenarioContext {
    private Users users = new Users();

}
