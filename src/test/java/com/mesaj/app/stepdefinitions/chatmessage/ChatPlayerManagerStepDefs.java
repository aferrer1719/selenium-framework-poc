package com.mesaj.app.stepdefinitions.chatmessage;

import com.mesaj.app.builders.data.chatmessage.PlayerBuilder;
import com.mesaj.app.builders.data.chatmessage.ManagerBuilder;
import com.mesaj.app.builders.data.backoffice.UserBuilder;
import com.mesaj.app.tasks.backoffice.NavigateTo;
import com.mesaj.app.tasks.backoffice.UserSignUp;
import com.mesaj.app.tasks.chatmessage.UserChatPlayer;
import com.mesaj.app.tasks.chatmessage.UserChatManager;
import com.mesaj.app.tasks.chatmessage.UserPlayerRoomList;
import com.mesaj.app.tasks.chatmessage.UserManagerRoomList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ChatPlayerManagerStepDefs {

    @Autowired
    private UserSignUp signUp;
    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserPlayerRoomList selectSalas;

    @Autowired
    private UserChatPlayer userBingoChat;
    @Autowired
    private UserManagerRoomList managerBingoChat;


    private String ventanaJugador;
    private String subVentanaJugador;
    private String ventanaManager;
    private String subVentanaManager;
    private List<String> ventanasTodas = new ArrayList<>();
    @Autowired
    private UserChatManager userChatManager;

    private void JugadorIngresaALaSalaDeBingo() throws InterruptedException {
        ventanaJugador = navigate.getActualTab();
        ventanasTodas.add(ventanaJugador);

        selectSalas.selectUserSala();
        Thread.sleep(3000);

        selectSalas.verPantallaSala();
        Thread.sleep(3000);

        selectSalas.seleccionarBingoType();
        Thread.sleep(3000);

        subVentanaJugador = navigate.getNewTab(ventanasTodas);
        ventanasTodas.add(subVentanaJugador);
        navigate.changeTab(subVentanaJugador);

        //userBingoChat.cambiarVentana();
    }

    private void JugadorseleccionaIngresoAChat() throws InterruptedException {
        Thread.sleep(15000);
        userBingoChat.salaChat();
    }

    private void JugadorIngresaASalaDeChatConJugadoresMismoIdioma() throws InterruptedException {
        userBingoChat.withMensaje(PlayerBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(3000);
    }

    private void JugadorEnviaMensaje() throws InterruptedException {
        userBingoChat.enviarMensaje();
        Thread.sleep(3000);
    }

    private void AbrirTabDelManager() throws InterruptedException {

        navigate.newTab();
        ventanaManager = navigate.getNewTab(ventanasTodas);
        ventanasTodas.add(ventanaManager);
        Thread.sleep(3000);
        navigate.changeTab(ventanaManager);
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
        navigate.changeTab(subVentanaJugador);
    }

    private void cambiarATabManager()
    {
        navigate.changeTab(subVentanaManager);
    }

    private void cambiarATabLoginManager()
    {
        navigate.changeTab(ventanaManager);
    }
    @Given("^Player enters the chat room$")
    public void playerEnterTheChatRoom() throws InterruptedException {
        JugadorIngresaALaSalaDeBingo();
        JugadorseleccionaIngresoAChat();
        JugadorIngresaASalaDeChatConJugadoresMismoIdioma();
        JugadorEnviaMensaje();

    }

    @And("^sends a message to the other players$")
    public void playerEntersTheChat() throws InterruptedException {
        JugadorEnviaMensaje();

    }

    @When("^Manager is in the chat room$")
    public void ManagerEnterTheChat() throws InterruptedException {
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

    @Then("^He can see the messages sent by the player$")
    public void checkSentMessages() throws InterruptedException {
        ManagerEnviaMensaje();
        cambiarATabJugador();
        Thread.sleep(5000);
        cambiarATabManager();

    }

     private void ManagerEnviaMensaje() throws InterruptedException {
        userChatManager.enviarMensajeChat();
        Thread.sleep(5000);
    }
    private void ManagerIngresaASalaDeChatConJugadoresMismoIdioma() throws InterruptedException {
        userChatManager.withMensaje(ManagerBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(3000);
    }
    private void ManagerSeleccionaIngresoAChat() throws InterruptedException {
        Thread.sleep(15000);
        userChatManager.seleccionarChat();
    }
    private void ManagerIngresaSalaDeBing() throws InterruptedException {
        managerBingoChat.selectOpcionesSala();
        Thread.sleep(3000);

        managerBingoChat.visualizarPantallaSala();
        Thread.sleep(3000);

        managerBingoChat.seleccionarBingoType();
        Thread.sleep(3000);


        subVentanaManager = navigate.getNewTab(ventanasTodas);
        ventanasTodas.add(subVentanaManager);
        navigate.changeTab(subVentanaManager);
        //userChatManager.cambiarTags();
    }
}
