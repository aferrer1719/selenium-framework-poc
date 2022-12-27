package com.mesaj.app.stepdefinitions;

import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserListaSalas;
import com.mesaj.app.tasks.UserSignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuListaSalasStepDefs {

    @Autowired
    private NavigateTo navigate;
    @Autowired
    private UserSignUp signUp;
    @Autowired
    private UserListaSalas selectSalas;

  /*  @Given("Miguel ingresa al backoffice")
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
    }*/

    @When("^Miguel selecciona las opciones requeridas para ingresar a la lista de salas$")
    public void elSeleccionaLasOpcionesRequeridas() throws InterruptedException  {
        selectSalas.selectUserSala();
        Thread.sleep(4000);
    }

    @Then("^el puede ver la pantalla Rooms List$")
    public void elPuedeIngresarALaPantallaDeListaDeSalas() {

        selectSalas.verPantallaSala();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
           }

    @And("^seleccionar las opciones para ingresar al tipo de bingo que desea jugar$")
    public void selecciona_las_opciones_que_le_permiten_ingresar_al_tipo_de_bingo_que_desea_jugar(){
         selectSalas.seleccionarBingoType();
              try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

  }
