package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.JugadorBuilder;
import com.mesaj.app.builders.data.ManagerBuilder;
import com.mesaj.app.builders.data.UserBuilder;
import com.mesaj.app.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ChatUsuarioManager {

    @Autowired
    private UserSignUp signUp;
    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserListaSalas selectSalas;

    @Autowired
    private UserBingoChat userBingoChat;
    @Autowired
    private UserManagerBingoChat managerBingoChat;


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
        userBingoChat.withMensaje(JugadorBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(3000);
    }

    private void JugadorEnviaMensaje() throws InterruptedException {
        userBingoChat.enviarMensaje();
        Thread.sleep(3000);
    }

    private void AbrirTabDelManager() {

        navigate.newTab();
        ventanaManager = navigate.getNewTab(ventanasTodas);
        ventanasTodas.add(ventanaManager);
        //navigate.signUpPage();
    }

    private void LoginManager(){
        navigate.signUpPage();
        try {
            Thread.sleep(4000);
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

    @Given("^Usuario se encuentra en sala de bingo como jugador$")
    public void JugadorIngresaAlChat() throws InterruptedException {
        JugadorIngresaALaSalaDeBingo();
        JugadorseleccionaIngresoAChat();
        JugadorIngresaASalaDeChatConJugadoresMismoIdioma();
        JugadorEnviaMensaje();

    }

    @When("^Manager se encuentra en sala de bingo como manager$")
    public void ManagerIngresaAlChat() throws InterruptedException {
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
