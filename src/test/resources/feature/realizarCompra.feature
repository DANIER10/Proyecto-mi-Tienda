@Realizarcompramitienda
Feature: Realizar compra en mi tienda
  Scenario Outline: Realizar compra
    Given Estoy logueado en la pagina mi tienda
    When Realizo una compra
      |<txt_nombre>|<txt_apellido>|<txt_contraseña>|<txt_nacimiento>|<txt_compañia>|<txt_direccion>|<txt_direccion2>|<txt_ciudad>|<cbbx_estado>|<txt_codpostal>|<cbbx_pais>|<txt_infadicional>|<txt_tel>|<txt_cel>|<txt_aliasdirecc>|
    Then Verifico el resultado de la Compra
      |<lbl_usuariologin>|
    Examples: |<txt_nombre>|<txt_apellido>|<txt_contraseña>|<txt_dianacimiento>|<txt_mesnacimiento>|<txt_añonacimiento>|<txt_compañia>|<txt_direccion>|<txt_direccion2>|<txt_ciudad>|<cbbx_estado>|<txt_codpostal>|<cbbx_pais>|<txt_infadicional>|<txt_tel>|<txt_cel>|<txt_aliasdirecc>|
    |Juliana     |Molina        |12345           |12                 |03                 |1990               |Testing Company|cra 40        |cra 41          |Aguila      |Arizona      |85320          |Estados Unidos|Testing        |5432344  |313456789|mi direcc        |