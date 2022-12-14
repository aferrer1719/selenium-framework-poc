package com.mesaj.app.tasks;

import com.mesaj.app.models.User;
import com.mesaj.app.pageobjects.SignUpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UserSignUp {

    @Autowired
    private SignUpServices signUp;

    public void withInfo(User user) {

        signUp.writeUsuario(user.getUsuario());
        signUp.writeContrasena(user.getContrasena());
        signUp.clickOnSubmit();
        signUp.pantallaPrincipal();

    }

    public void clicInfo(UserSignUp userSignUp){
        signUp.seleccionarRooms();
        signUp.seleccionarListRooms();
    }
}
