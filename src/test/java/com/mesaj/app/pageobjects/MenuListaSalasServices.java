package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class MenuListaSalasServices {

    @Autowired
    private MenuListaSalasPageObject menuSalasPageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void contenedorDeListas(){

        this.menuSalasPageObject.getContenedorList();
    }

    public void seleccionarRooms() {

        this.menuSalasPageObject.getRooms().click();
    }

    public void seleccionarListRooms() {
        this.menuSalasPageObject.getListRooms().click();
    }

    public void verPantallaListRooms(){
            this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getVerPantallaListRooms()));
            this.menuSalasPageObject.getVerPantallaListRooms().isDisplayed();
    }
    public void ListaCasinos(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getCasinos()));
        this.menuSalasPageObject.getCasinos().click();
    }

    public void MostrarCasinos(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getBingoDropDown()));
        this.menuSalasPageObject.getBingoDropDown().isDisplayed();
    }

    public void hacerClickCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getBotonCasino()));
        this.menuSalasPageObject.getBotonCasino().click();
    }

    public void clickElementLanguage(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getLenguajes()));
        this.menuSalasPageObject.getLenguajes().click();
    }

    public void maximizarListaLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getMaxBotonlenguaje()));
        this.menuSalasPageObject.getMaxBotonlenguaje().click();
    }

    public void seleccionarLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getLanguageDropDown()));
        this.menuSalasPageObject.getLanguageDropDown().click();
    }

    public void clickTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getTestPlayersDropDown()));
        this.menuSalasPageObject.getTestPlayersDropDown().click();
    }
    public void maximizarListTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getMaxTestPlayer()));
        this.menuSalasPageObject.getMaxTestPlayer().click();
    }
    public void seleccionarTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getTestPlayers()));
        this.menuSalasPageObject.getTestPlayers().click();
    }

    public void bingoType75() {
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getUbicarBingoType()));
        this.menuSalasPageObject.getUbicarBingoType().isDisplayed();
    }
    public void ingresarSalaBingo(){
        this.wait.until(ExpectedConditions.visibilityOf(this.menuSalasPageObject.getIngresarSala75()));
        this.menuSalasPageObject.getIngresarSala75().click();
    }



}
