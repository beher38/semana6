
@tag
Feature: Realizar casos integrando nombre de usuario y contraseña
  
  @tag1
  Scenario: Login y conexion a BD
    Given Abrir Chrome
    When ingresa Username "10268914" y Password "12345"
    Then Iniciar sesion
   
