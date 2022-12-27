package com.mesaj.app.tasks;

import com.mesaj.app.models.Msg;
import com.mesaj.app.pageobjects.IngresoChatManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UserManagerBingoChat {

    @Autowired
    private IngresoChatManagerServices chatManager;

    public void selectOpcionesSala() {
       chatManager.visualizarBackoffice();
       chatManager.seleccionarSala();
       chatManager.seleccionarListRooms();

    }

    public boolean visualizarPantallaSala(){
        chatManager.pantallaListRooms();
        return false;
    }

    public void seleccionarBingoType(){
       chatManager.mostrarListaCasino();
       chatManager.seleccionarCasino();
       chatManager.cerrarlistaCasino();
       chatManager.mostrarListaLenguaje();
       chatManager.maximizarListaLenguaje();
       chatManager.seleccionarlenguaje();
       chatManager.clickTestPlayers();
       chatManager.maximizarListTestPlayers();
       chatManager.seleccionarTestPlayers();
       chatManager.visualizarPlayerId();
       chatManager.visualizarSessionId();
       chatManager.seleccionarBingoType75();
       chatManager.ingresarSalaBingo();
    }

}
