package com.mesaj.app.stepdefinitions;

import com.mesaj.app.tasks.UserManagerBingoChat;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class IngresoListaSalaManagerDefs {

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private UserManagerBingoChat managerBingoChat;


    @When("^Raquel selecciona las opciones para ingresar a la lista de salas$")
    public void raquelSeleccionaLasOpcionesParaIngresarALaListaDeSalas() {
        managerBingoChat.selectOpcionesSala();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^ella puede ver la pantalla RoomsList$")
    public void ellaPuedeVerLaPantallaRoomsList() {
        managerBingoChat.visualizarPantallaSala();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("^seleccionar opciones para ingresar al bingo que desea jugar$")
    public void seleccionarOpcionesParaIngresarAlBingoQueDeseaJugar() {
        managerBingoChat.seleccionarBingoType();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
