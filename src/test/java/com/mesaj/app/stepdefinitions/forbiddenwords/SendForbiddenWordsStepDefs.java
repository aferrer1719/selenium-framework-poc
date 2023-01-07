package com.mesaj.app.stepdefinitions.forbiddenwords;

import com.mesaj.app.builders.data.backoffice.UserBuilder;
import com.mesaj.app.builders.data.chatmessage.PlayerBuilder;
import com.mesaj.app.builders.data.chatmessage.ManagerBuilder;
import com.mesaj.app.builders.data.forbiddenwords.Jugador1Builder;
import com.mesaj.app.builders.data.forbiddenwords.Jugador2Builder;
import com.mesaj.app.tasks.backoffice.NavigateTo;
import com.mesaj.app.tasks.backoffice.UserSignUp;
import com.mesaj.app.tasks.chatmessage.UserChatPlayer;
import com.mesaj.app.tasks.chatmessage.UserChatManager;
import com.mesaj.app.tasks.chatmessage.UserPlayerRoomList;
import com.mesaj.app.tasks.chatmessage.UserManagerRoomList;
import com.mesaj.app.tasks.forbiddenwords.UserPlayer1EnterRoom;
import com.mesaj.app.tasks.forbiddenwords.UserPlayer1RoomList;
import com.mesaj.app.tasks.forbiddenwords.UserPlayer2EnterRoom;
import com.mesaj.app.tasks.forbiddenwords.UserPlayer2RoomList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SendForbiddenWordsStepDefs {

    @Autowired
    private UserSignUp signUp;
    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserPlayer2RoomList selectRoom;

    @Autowired
    private UserPlayer2EnterRoom userPlayer2EnterRoom;
    @Autowired
    private UserPlayer1RoomList userPlayer1RoomList;

    @Autowired
    private UserPlayer1EnterRoom userPlayer1EnterRoom;

    private String windowsJugador2;
    private String subWindowsJugador2;
    private String windowsJugador1;
    private String subWindowsJugador1;
    private List<String> allWindows = new ArrayList<>();

    private void JugadorIngresaALaSalaDeBingo() throws InterruptedException {
        windowsJugador2 = navigate.getActualTab();
        allWindows.add(windowsJugador2);

        selectRoom.selectUserSala();
        Thread.sleep(3000);

        selectRoom.verPantallaSala();
        Thread.sleep(3000);

        selectRoom.seleccionarBingoType();
        Thread.sleep(3000);

        subWindowsJugador2 = navigate.getNewTab(allWindows);
        allWindows.add(subWindowsJugador2);
        navigate.changeTab(subWindowsJugador2);

        //userBingoChat.cambiarVentana();
    }

    private void JugadorseleccionaIngresoAChat() throws InterruptedException {
        Thread.sleep(15000);
       userPlayer2EnterRoom.ChatRoom();
    }

    private void JugadorIngresaASalaDeChatConJugadoresMismoIdioma() throws InterruptedException {
       userPlayer2EnterRoom.withMensaje(Jugador2Builder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(3000);
    }

    private void JugadorEnviaMensaje() throws InterruptedException {
        userPlayer2EnterRoom.sendMessage();
        Thread.sleep(3000);
    }

    private void AbrirTabDelManager() throws InterruptedException {

        navigate.newTab();
        windowsJugador1 = navigate.getNewTab(allWindows);
        allWindows.add(windowsJugador1);
        Thread.sleep(3000);
        navigate.changeTab(windowsJugador1);
        //navigate.signUpPage();
    }

    private void LoginManager() throws InterruptedException {
        navigate.signUpPage();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        signUp.withInfo(UserBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void cambiarATabJugador()
    {
        navigate.changeTab(subWindowsJugador2);
    }

    private void cambiarATabManager()
    {
        navigate.changeTab(subWindowsJugador1);
    }

    private void cambiarATabLoginManager()
    {
        navigate.changeTab(windowsJugador1);
    }
    @Given("^Players join the chat in Spanish$")
    public void playerEnterTheChatRoom() throws InterruptedException {
        JugadorIngresaALaSalaDeBingo();
        JugadorseleccionaIngresoAChat();
        JugadorIngresaASalaDeChatConJugadoresMismoIdioma();
        JugadorEnviaMensaje();

    }


    @When("^One of the players writes Forbidden words from the Spanish kit$")
    public void playersSendForbiddenWords() throws InterruptedException {
        AbrirTabDelManager();
        LoginManager();
        ManagerIngresaSalaDeBing();
        ManagerSeleccionaIngresoAChat();
        ManagerIngresaASalaDeChatConJugadoresMismoIdioma();
        ManagerEnviaMensaje();
        cambiarATabJugador();
        Thread.sleep(5000);
        cambiarATabManager();
    }

    @Then("^The Forbidden words only appear to the player who sends them but not to the other player of the same language$")
    public void theForbiddenWordsForPlayer() throws InterruptedException {
        ManagerEnviaMensaje();
        cambiarATabJugador();
        Thread.sleep(5000);
        cambiarATabManager();

    }

     private void ManagerEnviaMensaje() throws InterruptedException {
        userPlayer1EnterRoom.enviarMensajeChat();
        Thread.sleep(5000);
    }
    private void ManagerIngresaASalaDeChatConJugadoresMismoIdioma() throws InterruptedException {
        userPlayer1EnterRoom.withMensaje(Jugador1Builder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(3000);
    }
    private void ManagerSeleccionaIngresoAChat() throws InterruptedException {
        Thread.sleep(15000);
        userPlayer1EnterRoom.seleccionarChat();
    }
    private void ManagerIngresaSalaDeBing() throws InterruptedException {
        userPlayer1RoomList.selectOpcionesSala();
        Thread.sleep(3000);

        userPlayer1RoomList.visualizarPantallaSala();
        Thread.sleep(3000);

        userPlayer1RoomList.seleccionarBingoType();
        Thread.sleep(3000);


        subWindowsJugador1 = navigate.getNewTab(allWindows);
        allWindows.add(subWindowsJugador1);
        navigate.changeTab(subWindowsJugador1);
        //userChatManager.cambiarTags();
    }
}
