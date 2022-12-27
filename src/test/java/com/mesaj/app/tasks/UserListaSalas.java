package com.mesaj.app.tasks;

import com.mesaj.app.pageobjects.MenuListaSalasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")

public class UserListaSalas {

    @Autowired
    private MenuListaSalasServices menuSalas;

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
