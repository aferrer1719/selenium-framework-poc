@run
Feature: Jugador ingresa exitosamente a una sala de bingo
Como jugador
quiero ingresar a una sala de bingo
para iniciar mi juego e intercatuar con otros jugadores.

  Background:
  Given Miguel ingresa al backoffice con usuario y contraseña validos

 #Scenario: Autenticación en backoffice fallida
 #When el no ingresa la informacion requerida para autenticarse
# Then el no puede ingresar al backoffice

 #Scenario:Miguel ingresa como jugador a la lista de salas de bingo satisfactoriamente
 # When  Miguel selecciona las opciones requeridas para ingresar a la lista de salas
 # Then  el puede ver la pantalla Rooms List
 # And   seleccionar las opciones para ingresar al tipo de bingo que desea jugar


 #Scenario: Miguel ingresa como jugador a la sala de chat satisfactoriamente
 #  Given Miguel se encuentra en sala de bingo como jugador
 #  When  el selecciona la opcion que le permite ingresar a una sala de chat
 #  Then el ingresa a la sala de chat con jugadores de su mismo idioma
 #  And  envia un mensaje




  Scenario:Raquel ingresa como manager a la lista de salas de bingo satisfactoriamente
    When  Raquel selecciona las opciones para ingresar a la lista de salas
    Then  ella puede ver la pantalla RoomsList
    And   seleccionar opciones para ingresar al bingo que desea jugar


  Scenario: Raquel ingresa como manager a la sala de chat satisfactoriamente
    Given Raquel se encuentra en sala de bingo como manager
    When  ella selecciona la opcion para ingresar a una sala de chat
    Then ella ingresa a la sala de chat y puede ver a los jugadores de su mismo idioma
    And  enviar un mensaje a todos