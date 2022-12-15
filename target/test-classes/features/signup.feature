Feature: Client sign up

  @run
  #Scenario: client sign up successfully
   # Given Pepito quiere ingresar al backoffice
   # When he sends required information to get the account
   # Then he should be told that the account was created

  #Scenario: client sign up failed
  #  Given Pepito quiere ingresar al backoffice
  #  When el envia la  informacion requerida para ingresar
  #  Then he should be told that the account was not created

  Scenario: client ingresa satisfactoriamente al backoffice
    Given Miguel quiere ingresar al backoffice
    When el envia la  informacion requerida para ingresar
    Then el puede ingresar correctamente y ver la pantalla principal

 Scenario: client sign up failed 2
  Given Miguel quiere ingresar al backoffice
   When el no ingresa la informacion requerida para autenticarse
  Then el no puede ingresar al backoffice

