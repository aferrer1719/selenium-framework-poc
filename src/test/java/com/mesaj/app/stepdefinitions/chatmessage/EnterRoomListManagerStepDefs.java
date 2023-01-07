package com.mesaj.app.stepdefinitions.chatmessage;

import com.mesaj.app.tasks.chatmessage.UserManagerRoomList;
import com.mesaj.app.tasks.backoffice.NavigateTo;
import com.mesaj.app.tasks.backoffice.UserSignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class EnterRoomListManagerStepDefs {

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private UserManagerRoomList managerBingoChat;


    @When("^He selects the options to enter the room list$")
    public void selectsTheOptionsToEnterTheRoomList() {
        managerBingoChat.selectOpcionesSala();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^He can view the RoomsList screen$")
    public void HeCanViewTheRoomsListScreen() {
        managerBingoChat.visualizarPantallaSala();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("^Select options to enter the bingo game you want to play$")
    public void Select_options_to_enter_the_bingo_game_you_want_to_play() {
        managerBingoChat.seleccionarBingoType();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
