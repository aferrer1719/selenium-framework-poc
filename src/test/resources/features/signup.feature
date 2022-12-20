@run
Feature: Jugador ingresa exitosamente a una sala de bingo
Como jugador
quiero ingresar a una sala de bingo
para iniciar mi juego e intercatuar con otros jugadores.

  Background:
  Given Miguel ingresa al backoffice con usuario y contraseña validos

 #Scenario: Autenticación en backoffice fallida
 # Given Miguel quiere ingresar al backoffice
   #When el no ingresa la informacion requerida para autenticarse
 #Then el no puede ingresar al backoffice

  Scenario:ingresar a la lista de salas de bingo satisfactoriamente
    When  el selecciona las opciones requeridas para ingresar a la lista de salas
    Then  el puede ver la pantalla de lista de salas

  Scenario: Ingresar a la pantalla de bingo como jugador
    When  el selecciona de la lista las opciones que le permiten ingresar al tipo de bingo seleccionado
    Then  el debe ver la pantalla de juego



 # Scenario: jugador ingresa a la sala de chat satisfactoriamente
 #Given Miguel ha ingresado a una sala de bingo
  #  When  el selecciona la opcion que le permite ingresar a una sala de chat
  #  Then  el debe ingresar a la sala de chat con jugadores de su mismo idioma
   # And   enviar un mensaje

