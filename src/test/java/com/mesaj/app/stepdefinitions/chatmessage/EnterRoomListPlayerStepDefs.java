package com.mesaj.app.stepdefinitions.chatmessage;

import com.mesaj.app.tasks.backoffice.NavigateTo;
import com.mesaj.app.tasks.chatmessage.UserPlayerRoomList;
import com.mesaj.app.tasks.backoffice.UserSignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class EnterRoomListPlayerStepDefs {

    @Autowired
    private NavigateTo navigate;
    @Autowired
    private UserSignUp signUp;
    @Autowired
    private UserPlayerRoomList selectSalas;

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

    @When("^User selects the required options to enter the room list$")
    public void heSelectsTheRequiredOptions() throws InterruptedException  {
        selectSalas.selectUserSala();
        Thread.sleep(4000);
    }

    @Then("^He can see the Rooms List screen$")
    public void heCanAccessTheRoomListScreen() {

        selectSalas.verPantallaSala();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
           }

    @And("^Select the options to enter the type of bingo you want to play$")
    public void selects_The_options_that_allow_him_to_enter_the_type_of_bingo_he_wants_to_play(){
         selectSalas.seleccionarBingoType();
              try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

  }
