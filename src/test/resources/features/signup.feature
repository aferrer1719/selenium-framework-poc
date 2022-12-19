Feature: Client sign up

  @run
 Scenario: Miguel ingresa satisfactoriamente al backoffice
    Given Miguel quiere ingresar al backoffice
    When el envia la  informacion requerida para ingresar
    Then el puede ingresar correctamente y ver la pantalla principal

 #Scenario: Autenticación en backoffice fallida
 # Given Miguel quiere ingresar al backoffice
   #When el no ingresa la informacion requerida para autenticarse
 #Then el no puede ingresar al backoffice

  Scenario: Miguel ingresa a la lista de salas de bingo satisfactoriamente
    Given Miguel ingresa al backoffice
    When  el selecciona las opciones requeridas para ingresar
    Then  el puede ingresar satisfactorimente a la pantalla de lista de salas

