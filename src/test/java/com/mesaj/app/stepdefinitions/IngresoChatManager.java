package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.ManagerBuilder;
import com.mesaj.app.tasks.UserChatManager;
import com.mesaj.app.tasks.UserManagerBingoChat;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class IngresoChatManager {

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private UserManagerBingoChat managerBingoChat;

    @Autowired
    private UserChatManager userChatManager;

    @Given("^Raquel se encuentra en sala de bingo como manager$")
    public void raquelSeEncuentraEnSalaDeBingoComoManager() throws InterruptedException {
        managerBingoChat.selectOpcionesSala();
        Thread.sleep(3000);

        managerBingoChat.visualizarPantallaSala();
        Thread.sleep(3000);

        managerBingoChat.seleccionarBingoType();
        Thread.sleep(3000);

        userChatManager.cambiarTags();
    }

    @When("^ella selecciona la opcion para ingresar a una sala de chat$")
    public void ellaSeleccionaLaOpcionQueLePermiteIngresarAUnaSalaDeChat()throws InterruptedException {

               try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        userChatManager.seleccionarChat();

    }

    @Then("^ella ingresa a la sala de chat y puede ver a los jugadores de su mismo idioma$")
    public void ellaIngresaALaSalaDeChatConJugadoresDeSuMismoIdioma()throws InterruptedException {

        userChatManager.withMensaje(ManagerBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(6000);
    }

    @And("enviar un mensaje a todos")
    public void enviarUnMensajeATodos()throws InterruptedException {
        userChatManager.enviarMensajeChat();
                    Thread.sleep(6000);

    }
}
