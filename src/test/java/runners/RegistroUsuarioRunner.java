package runners;


import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/registroUsuario.feature",
        //tags = "@Realizarregistromitienda",
        glue = "definitions",
        snippets = SnippetType.CAMELCASE )


public class RegistroUsuarioRunner {

}

