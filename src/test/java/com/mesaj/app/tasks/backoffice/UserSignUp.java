package com.mesaj.app.tasks.backoffice;

import com.mesaj.app.models.User;
import com.mesaj.app.pageobjects.backoffice.SignUpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UserSignUp {

    @Autowired
    private SignUpServices signUp;

    public boolean withInfo(User user) throws InterruptedException {
        signUp.writeUsuario(user.getUsuario());
        signUp.writeContrasena(user.getContrasena());
        Thread.sleep(2000);
        signUp.clickOnSubmit();
        signUp.pantallaPrincipal();
        return false;
    }



}
