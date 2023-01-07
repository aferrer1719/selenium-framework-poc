package com.mesaj.app.tasks.chatmessage;

import com.mesaj.app.pageobjects.chatmessage.EnterRoomListPlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")

public class UserPlayerRoomList {

    @Autowired
    private EnterRoomListPlayerServices menuSalas;

    public void selectUserSala() {
        menuSalas.contenedorDeListas();
        menuSalas.seleccionarRooms();
        menuSalas.seleccionarListRooms();
    }

    public boolean verPantallaSala(){
        menuSalas.verPantallaListRooms();
        return false;
    }

    public void seleccionarBingoType(){
        menuSalas.ListaCasinos();
        menuSalas.MostrarCasinos();
        menuSalas.hacerClickCasino();
        menuSalas.clickElementLanguage();
        menuSalas.maximizarListaLenguaje();
        menuSalas.seleccionarLenguaje();
        menuSalas.clickTestPlayers();
        menuSalas.maximizarListTestPlayers();
        menuSalas.seleccionarTestPlayers();
        menuSalas.bingoType75();
        menuSalas.ingresarSalaBingo();
    }
}
