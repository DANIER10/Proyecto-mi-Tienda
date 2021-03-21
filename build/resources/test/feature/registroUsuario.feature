@Realizarregistromitienda
Feature: Realizar registro en mi tienda

  Scenario Outline: Realizar registro de usuario
    Given Estoy en la pagina mi tienda
    When Diligencio El Formulario de Registro
      | <txt_correo>| <txt_nombre> | <txt_apellido> | <txt_contraseña> | <txt_dianacimiento> | <txt_mesnacimiento> | <txt_añonacimiento> | <txt_compañia>  | <txt_direccion> | <txt_direccion2> | <txt_ciudad> | <cbbx_estado> | <txt_codpostal> | <cbbx_pais>    | <txt_infadicional> | <txt_tel> | <txt_cel> | <txt_aliasdirecc> |<lbl_usuariologin> |
    Then Verifico El Registro Del Usuario
      | <lbl_usuariologin> |
    Examples:
      | txt_correo| txt_nombre | txt_apellido | txt_contraseña | txt_dianacimiento | txt_mesnacimiento | txt_añonacimiento | txt_compañia  | txt_direccion | txt_direccion2 | txt_ciudad | cbbx_estado | txt_codpostal | cbbx_pais    | txt_infadicional | txt_tel | txt_cel | txt_aliasdirecc | lbl_usuariologin |
      |danierg101@hexud.com| Juliana| Molina    | 12345          | 12                | 3                | 1990              | Testing Company | cra 40      | cra 41         | Aguila     | 3           | 85320         | 1            | Testing        | 5432344 | 313456789| mi direcc      | Juliana Molina   |