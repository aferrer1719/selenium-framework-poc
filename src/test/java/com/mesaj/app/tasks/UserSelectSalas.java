package com.mesaj.app.tasks;

import com.mesaj.app.pageobjects.MenuSalasServices;
import com.mesaj.app.pageobjects.SignUpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")

public class UserSelectSalas {

    @Autowired
    private MenuSalasServices menuSalas;

    public void selectUserSala(){
        menuSalas.contenedorDeListas();
        menuSalas.seleccionarRooms();
        menuSalas.seleccionarListRooms();
        menuSalas.verPantallaListRooms();
    }
}
