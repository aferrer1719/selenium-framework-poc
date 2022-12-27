package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.JugadorBuilder;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserBingoChat;
import com.mesaj.app.tasks.UserListaSalas;
import com.mesaj.app.tasks.UserSignUp;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class ChatStepDefs {

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private UserListaSalas selectSalas;

    @Autowired
    private UserBingoChat userBingoChat;

    @Given("^Miguel se encuentra en sala de bingo como jugador$")
    public void miguel_Se_Encuentra_En_La_Sala_De_Bingo() throws InterruptedException {
        selectSalas.selectUserSala();
        Thread.sleep(3000);


        selectSalas.verPantallaSala();
          Thread.sleep(3000);

        selectSalas.seleccionarBingoType();
        Thread.sleep(3000);

        userBingoChat.cambiarVentana();

    }

    @When("^el selecciona la opcion que le permite ingresar a una sala de chat$")
    public void el_Selecciona_La_Opcion_Que_Le_Permite_Ingresar_A_Una_Sala_De_Chat() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        userBingoChat.salaChat();
    }

    @Then("^el ingresa a la sala de chat con jugadores de su mismo idioma$")
    public void el_Debe_Ingresar_A_La_Sala_De_Chat_Con_Jugadores_De_Su_Mismo_Idioma() throws InterruptedException {
        userBingoChat.withMensaje(JugadorBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(3000);
    }

    @And("^envia un mensaje$")
    public void enviar_Un_Mensaje() throws InterruptedException {
        userBingoChat.enviarMensaje();
        Thread.sleep(3000);
    }
}
