package com.mesaj.app.tasks.chatmessage;

import com.mesaj.app.pageobjects.chatmessage.EnterRoomManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UserManagerRoomList {

    @Autowired
    private EnterRoomManagerServices roomListManager;

    public void selectOpcionesSala() {
       roomListManager.visualizarBackoffice();
       roomListManager.seleccionarSala();
       roomListManager.seleccionarListRooms();

    }

    public boolean visualizarPantallaSala(){
        roomListManager.pantallaListRooms();
        return false;
    }

    public void seleccionarBingoType(){
       roomListManager.mostrarListaCasino();
       roomListManager.seleccionarCasino();
       roomListManager.cerrarlistaCasino();
       roomListManager.mostrarListaLenguaje();
       roomListManager.maximizarListaLenguaje();
       roomListManager.seleccionarlenguaje();
       roomListManager.clickTestPlayers();
       roomListManager.maximizarListTestPlayers();
       roomListManager.seleccionarTestPlayers();
       roomListManager.visualizarPlayerId();
       roomListManager.visualizarSessionId();
       roomListManager.seleccionarBingoType75();
       roomListManager.ingresarSalaBingo();
    }

}
