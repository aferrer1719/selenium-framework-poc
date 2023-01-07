@run
Feature: Players and Manager successfully enter a chat room and interact with each other
  As a player and manager,
  we want to enter a chat room
  to start a game and exchange messages with other players.

  Background:
  Given User logs into the back office with valid username and password

  Scenario:User successfully enters as a player into the bingo room list
    When  User selects the required options to enter the room list
    Then  He can see the Rooms List screen
    And   Select the options to enter the type of bingo you want to play

  Scenario: User successfully enters as a player into the chat room
    Given User is in the bingo room as a player
    When  He selects the option that allows him to enter a chat room
    Then He enters the chat room with players of his same language
    And  sends a message

  Scenario:User successfully logs in as a manager to the bingo room list
    When  He selects the options to enter the room list
    Then  He can view the RoomsList screen
    And   Select options to enter the bingo game you want to play


  Scenario: User successfully logs in as a manager to the chat room
    Given User is in the bingo room as a manager
    When  He selects the option to enter a chat room
    Then He enters the chat room and can see players who speak the same language as him
    And  He sends a message to the players


  Scenario: Player and Manager enter the chat room and send messages.
    Given Player enters the chat room
    And sends a message to the other players
    When Manager is in the chat room
   Then He can see the messages sent by the player


 #Scenario: Autenticación en backoffice fallida
 #When el no ingresa la informacion requerida para autenticarse
# Then el no puede ingresar al backoffice




