package com.mesaj.app.tasks.forbiddenwords;

import com.mesaj.app.pageobjects.chatmessage.EnterRoomManagerServices;
import com.mesaj.app.pageobjects.forbiddenwords.EnterRoomPlayer1Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UserPlayer1RoomList {

    @Autowired
    private EnterRoomPlayer1Services roomListPlayer1;

    public void selectOpcionesSala() {
       roomListPlayer1.visualizarBackoffice();
       roomListPlayer1.seleccionarSala();
       roomListPlayer1.seleccionarListRooms();

    }

    public boolean visualizarPantallaSala(){
        roomListPlayer1.pantallaListRooms();
        return false;
    }

    public void seleccionarBingoType(){
       roomListPlayer1.mostrarListaCasino();
       roomListPlayer1.seleccionarCasino();
       roomListPlayer1.cerrarlistaCasino();
       roomListPlayer1.mostrarListaLenguaje();
       roomListPlayer1.maximizarListaLenguaje();
       roomListPlayer1.seleccionarlenguaje();
       roomListPlayer1.clickTestPlayers();
       roomListPlayer1.maximizarListTestPlayers();
       roomListPlayer1.seleccionarTestPlayers();
       roomListPlayer1.visualizarPlayerId();
       roomListPlayer1.visualizarSessionId();
       roomListPlayer1.seleccionarBingoType75();
       roomListPlayer1.ingresarSalaBingo();
    }

}
