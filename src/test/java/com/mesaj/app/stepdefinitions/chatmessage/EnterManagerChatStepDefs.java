package com.mesaj.app.stepdefinitions.chatmessage;

import com.mesaj.app.builders.data.chatmessage.ManagerBuilder;
import com.mesaj.app.tasks.chatmessage.UserChatManager;
import com.mesaj.app.tasks.chatmessage.UserManagerRoomList;
import com.mesaj.app.tasks.backoffice.NavigateTo;
import com.mesaj.app.tasks.backoffice.UserSignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class EnterManagerChatStepDefs {

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private UserManagerRoomList managerBingoChat;

    @Autowired
    private UserChatManager userChatManager;

    @Given("^User is in the bingo room as a manager$")
    public void user_Enter_Bingo_Room_As_a_Manager() throws InterruptedException {
        managerBingoChat.selectOpcionesSala();
        Thread.sleep(3000);

        managerBingoChat.visualizarPantallaSala();
        Thread.sleep(3000);

        managerBingoChat.seleccionarBingoType();
        Thread.sleep(3000);

        userChatManager.cambiarTags();
    }

    @When("^He selects the option to enter a chat room$")
    public void selectTheOptionToEnterAChatRoom() {

               try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        userChatManager.seleccionarChat();

    }

    @Then("^He enters the chat room and can see players who speak the same language as him$")
    public void enter_The_Chat_Room_With_Players_Who_Speak_The_Same_Language_As_You()throws InterruptedException {

        userChatManager.withMensaje(ManagerBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        Thread.sleep(3000);
    }

    @And("^He sends a message to the players$")
    public void sendsMessageToThePlayers()throws InterruptedException {
        userChatManager.enviarMensajeChat();
                    Thread.sleep(5000);

    }
}
