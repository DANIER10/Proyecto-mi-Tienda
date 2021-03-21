package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.RegistrousuarioPage;

public class RegistroUsuarioStep {
RegistrousuarioPage registrousuarioPage;


    @Step
    public void abrirPagina(){
    registrousuarioPage.open();
    }

    @Step
    public void registrodecuenta(String Correo){
        registrousuarioPage.registrodeCuenta(Correo);

    }


    @Step
    public void registrodeUsuario(String Nombre, String Apellido, String Contraseña, String Dianacimiento, String Mesnacimiento, String Añonacimiento, String Compañia, String Direccion1, String Direccion2, String Ciudad, String Estado, String Codpostal, Integer Pais, String Infadicional, String Telefono, String Celular){
        registrousuarioPage.registrodeUsuario(Nombre, Apellido, Contraseña, Dianacimiento, Mesnacimiento, Añonacimiento, Compañia, Direccion1, Direccion2, Ciudad, Estado, Codpostal, Pais, Infadicional, Telefono, Celular);

    }

    @Step
    public void validarRegistro(String Usuario){
        String d;
        d= registrousuarioPage.validarRegistro();

        Assert.assertEquals(Usuario,d);

    }

}
