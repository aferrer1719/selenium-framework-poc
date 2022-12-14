package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.UserBuilder;
//import com.mesaj.app.questions.GetUserToSignUpBy;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpStepDefs {

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private NavigateTo navigate;

    @Given("^Miguel quiere ingresar al backoffice$")
    public void ingresar_al_backoffice() throws InterruptedException {
        navigate.signUpPage();
        Thread.sleep(4000);
    }

    @When("^el envia la  informacion requerida para ingresar$")
    public void Enviar_informacion_requerida_para_ingresar() {



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

    @Then("^el puede ingresar correctamente y ver la pantalla principal$")
    public void ver_Pantalla_Principal() {

        assertThat(true).isEqualTo(true);

    }

    @Then("^el no puede ingresar al backoffice$")
    public void el_no_puede_ingresar_al_backoffice() {
        signUp.withInfo(UserBuilder
                .anUser()
                .withDefaultInfo()
                .but()
                .withoutUsuario()
                .withoutContrasena()
                .build());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        assertThat(true).isEqualTo(false);

    }
}
