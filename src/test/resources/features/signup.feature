Feature: Client sign up

  @run
 Scenario: Miguel ingresa satisfactoriamente al backoffice
    Given Miguel quiere ingresar al backoffice
    When el envia la  informacion requerida para ingresar
    Then el puede ingresar correctamente y ver la pantalla principal

 Scenario: client sign up failed 2
  Given Miguel quiere ingresar al backoffice
   When el no ingresa la informacion requerida para autenticarse
  Then el no puede ingresar al backoffice

