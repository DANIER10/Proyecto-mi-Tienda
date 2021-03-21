package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("http://automationpractice.com/index.php")
public class RegistrousuarioPage extends PageObject {


    @FindBy(xpath = " //*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement opcregistrar;

    @FindBy(id = "email_create")
    private WebElement txtcorreo;

    @FindBy(id = "SubmitCreate")
    private WebElement btncrearcuenta;

    @FindBy(id = "id_gender1")
    private WebElement rdtitulo;

    @FindBy(id = "customer_firstname")
    private WebElement txtnombre;

    @FindBy(id = "customer_lastname")
    private WebElement txtapellido;

    @FindBy(id = "passwd")
    private WebElement txtcontraseña;

    @FindBy(id = "days")
    private WebElement cbxdianacimiento;

    @FindBy(id = "months")
    private WebElement cbxmesnacimiento;

    @FindBy(id = "years")
    private WebElement cbxañonacimiento;

    @FindBy(id = "company")
    private WebElement txtcompañia;

    @FindBy(id = "address1")
    private WebElement txtdireccion1;

    @FindBy(id = "address2")
    private WebElement txtdireccion2;

    @FindBy(id = "city")
    private WebElement txtciudad;

    @FindBy(id = "id_state")
    private WebElement cbxestado;

    @FindBy(id = "postcode")
    private WebElement txtcodigopostal;

    @FindBy(id = "id_country")
    private WebElement cbxpais;

    @FindBy(id = "other")
    private WebElement txtinfadicional;

    @FindBy(id = "phone")
    private WebElement txttelefono;

    @FindBy(id = "phone_mobile")
    private WebElement txtcelular;

    @FindBy(id = "alias")
    private WebElement txtaliasdirecc;

    @FindBy(id = "submitAccount")
    private WebElement btnregistrarse;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    private WebElement lblusuariologueado;



    public void registrodeCuenta(String Correo){
        opcregistrar.click();
        txtcorreo.sendKeys(Correo);
        btncrearcuenta.click();

    }

    public void registrodeUsuario(String Nombre, String Apellido, String Contraseña, String Dianacimiento, String Mesnacimiento, String Añonacimiento, String Compañia, String Direccion1, String Direccion2, String Ciudad, String Estado, String Codpostal, Integer Pais, String Infadicional, String Telefono, String Celular){

        rdtitulo.click();
        txtnombre.sendKeys(Nombre);
        txtapellido.sendKeys(Apellido);
        txtcontraseña.sendKeys(Contraseña);
        Select dianacimiento = new Select(cbxdianacimiento);
        dianacimiento.selectByValue(Dianacimiento);

        Select mesnacimiento = new Select(cbxmesnacimiento);
        mesnacimiento.selectByValue(Mesnacimiento);

        Select añonacimiento = new Select(cbxañonacimiento);
        añonacimiento.selectByValue(Añonacimiento);

        txtcompañia.sendKeys(Compañia);
        txtdireccion1.sendKeys(Direccion1);
        txtdireccion2.sendKeys(Direccion2);
        txtciudad.sendKeys(Ciudad);

        Select estado = new Select(cbxestado);
        estado.selectByValue(Estado);

        txtcodigopostal.sendKeys(Codpostal);

        Select pais = new Select(cbxpais);
        pais.selectByIndex(Pais);

        txtinfadicional.sendKeys(Infadicional);
        txttelefono.sendKeys(Telefono);
        txtcelular.sendKeys(Celular);
        btnregistrarse.click();


    }

    public String validarRegistro(){

        return lblusuariologueado.getText();
    }

}
