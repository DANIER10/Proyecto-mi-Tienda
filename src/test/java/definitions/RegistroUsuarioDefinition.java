package definitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import steps.RegistroUsuarioStep;

import java.util.List;

public class RegistroUsuarioDefinition {

    @Steps
    RegistroUsuarioStep registroUsuarioStep;

    @Given("^Estoy en la pagina mi tienda$")
    public void estoyEnLaPaginaMiTienda() throws Exception {
        registroUsuarioStep.abrirPagina();
    }

    @When("^Diligencio El Formulario de Registro$")
    public void diligencioElFormularioDeRegistro(List<String> datos) throws Exception {
        registroUsuarioStep.registrodecuenta(datos.get(0));
        registroUsuarioStep.registrodeUsuario(datos.get(1),datos.get(2),datos.get(3),datos.get(4),datos.get(5),datos.get(6),datos.get(7),datos.get(8),datos.get(9),datos.get(10),datos.get(11), datos.get(12),Integer.parseInt(datos.get(13)),datos.get(14),datos.get(15),datos.get(16));
    }

    @Then("^Verifico El Registro Del Usuario$")
    public void verificoElRegistroDelUsuario(List<String> datos) throws Exception {
        registroUsuarioStep.validarRegistro(datos.get(0));

    }



}
