package com.mesaj.app.tasks.forbiddenwords;

import com.mesaj.app.pageobjects.forbiddenwords.EnterRoomPlayer2Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")

public class UserPlayer2RoomList {

    @Autowired
    private EnterRoomPlayer2Services menuSalas;

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
