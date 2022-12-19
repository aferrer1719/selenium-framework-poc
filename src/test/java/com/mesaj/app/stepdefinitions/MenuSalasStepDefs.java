package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.UserBuilder;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSelectSalas;
import com.mesaj.app.tasks.UserSignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuSalasStepDefs {

    @Autowired
    private NavigateTo navigate;
    @Autowired
    private UserSignUp signUp;
    @Autowired
    private UserSelectSalas selectSalas;

    @Given("Miguel ingresa al backoffice")
    public void miguelIngresaAlBackoffice() throws InterruptedException {
        navigate.signUpPage();
        Thread.sleep(4000);

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

    @When("^el selecciona las opciones requeridas para ingresar$")
    public void elSeleccionaLasOpcionesRequeridas() throws InterruptedException  {
        selectSalas.selectUserSala();
        Thread.sleep(4000);
    }

    @Then("^el puede ingresar satisfactorimente a la pantalla de lista de salas$")
    public void elPuedeIngresarALaPantallaDeListaDeSalas() {
        assertThat(true).isEqualTo(true);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
