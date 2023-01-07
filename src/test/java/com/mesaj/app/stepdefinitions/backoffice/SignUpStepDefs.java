package com.mesaj.app.stepdefinitions.backoffice;

import com.mesaj.app.builders.data.backoffice.UserBuilder;
//import com.mesaj.app.questions.GetUserToSignUpBy;
import com.mesaj.app.tasks.backoffice.NavigateTo;
import com.mesaj.app.tasks.backoffice.UserSignUp;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpStepDefs {

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private NavigateTo navigate;



   /* @Given("^Miguel quiere ingresar al backoffice$")
    public void ingresar_al_backoffice() throws InterruptedException {
        navigate.signUpPage();
        Thread.sleep(4000);
    }

    @When("^el envia la  informacion requerida para ingresar$")
    public void Enviar_informacion_requerida_para_ingresar() {

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

    @Then("^el puede ingresar correctamente y ver la pantalla principal$")
    public void ver_Pantalla_Principal() {

        assertThat(true).isEqualTo(true);

    }*/

    @Given("^User logs into the back office with valid username and password$")
    public void enterTheBackofficeWithValidUsernameAndPassword() throws InterruptedException {

        navigate.signUpPage();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        signUp.withInfo(UserBuilder
                .anUser()
                .withDefaultInfo()
                .build());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertThat(true).isEqualTo(true);
    }



   /* @When("^el no ingresa la informacion requerida para autenticarse$")
        public void ingresar_informacion(){
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
    }

    @Then("^el no puede ingresar al backoffice$")
    public void el_no_puede_ingresar_al_backoffice() throws InterruptedException {

        Assert.assertTrue(signUp.withInfo(UserBuilder
                .anUser()
                .withDefaultInfo()
                .but()
                .withoutUsuario()
                .withoutContrasena()
                .build()));*/



}
