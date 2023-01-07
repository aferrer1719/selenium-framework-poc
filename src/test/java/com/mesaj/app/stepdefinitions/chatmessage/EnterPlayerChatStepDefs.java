package com.mesaj.app.stepdefinitions.chatmessage;

import com.mesaj.app.builders.data.chatmessage.PlayerBuilder;
import com.mesaj.app.tasks.backoffice.NavigateTo;
import com.mesaj.app.tasks.chatmessage.UserChatPlayer;
import com.mesaj.app.tasks.chatmessage.UserPlayerRoomList;
import com.mesaj.app.tasks.backoffice.UserSignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class EnterPlayerChatStepDefs {

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private UserPlayerRoomList selectSalas;

    @Autowired
    private UserChatPlayer userBingoChat;

    @Given("^User is in the bingo room as a player$")
    public void user_Is_In_The_Bingo_Room_As_player() throws InterruptedException {
        selectSalas.selectUserSala();
        Thread.sleep(3000);


        selectSalas.verPantallaSala();
          Thread.sleep(3000);

        selectSalas.seleccionarBingoType();
        Thread.sleep(3000);

        userBingoChat.cambiarVentana();

    }

    @When("^He selects the option that allows him to enter a chat room$")
    public void select_The_Option_That_Allows_You_To_Enter_A_Chat_Room() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        userBingoChat.salaChat();
    }

    @Then("^He enters the chat room with players of his same language$")
    public void enters_The_Chat_Room_With_Players_Of_His_Same_Language() throws InterruptedException {
        userBingoChat.withMensaje(PlayerBuilder
                .anUser()
                .withDefaultInfo()
                .build());        Thread.sleep(3000);
    }

    @And("^sends a message$")
    public void sends_A_Message() throws InterruptedException {
        userBingoChat.enviarMensaje();
        Thread.sleep(3000);
    }
}
