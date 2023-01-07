package com.mesaj.app.pageobjects.forbiddenwords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Set;

@Component
@Scope("cucumber-glue")
public class EnterRoomPlayer1Services {

    @Autowired
    private EnterRoomPlayer1PageObject enterPlayerRoom;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void visualizarBackoffice(){
    this.enterPlayerRoom.getContenedorList();
    }

    public void seleccionarSala() {
     this.enterPlayerRoom.getRooms().click();
    }

    public void seleccionarListRooms() {
      this.enterPlayerRoom.getListRooms().click();
    }

    public void pantallaListRooms(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getVerPantallaListRooms()));
        this.enterPlayerRoom.getVerPantallaListRooms().isDisplayed();
    }
    public void mostrarListaCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getCasinos()));
        this.enterPlayerRoom.getCasinos().click();
    }

    public void seleccionarCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getBingoDropDown()));
        this.enterPlayerRoom.getBingoDropDown().isDisplayed();
    }

    public void cerrarlistaCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getBotonCasino()));
        this.enterPlayerRoom.getBotonCasino().click();
    }

    public void mostrarListaLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getLenguajes()));
        this.enterPlayerRoom.getLenguajes().click();
    }

    public void maximizarListaLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getMaxBotonlenguaje()));
        this.enterPlayerRoom.getMaxBotonlenguaje().click();
    }

    public void seleccionarlenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getLanguageDropDown()));
        this.enterPlayerRoom.getLanguageDropDown().click();
    }

    public void clickTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getTestPlayersDropDown()));
        this.enterPlayerRoom.getTestPlayersDropDown().click();
    }
    public void maximizarListTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getMaxTestPlayer()));
        this.enterPlayerRoom.getMaxTestPlayer().click();
    }
    public void seleccionarTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getTestPlayers()));
        this.enterPlayerRoom.getTestPlayers().click();
    }

    public void visualizarPlayerId(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getPlayerId()));
        this.enterPlayerRoom.getPlayerId().click();
    }

    public void visualizarSessionId(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getSessionId()));
        this.enterPlayerRoom.getSessionId().click();
    }
    public void seleccionarBingoType75() {
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getUbicarBingoType()));
        this.enterPlayerRoom.getUbicarBingoType().isDisplayed();
    }
    public void ingresarSalaBingo(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getIngresarSala75()));
        this.enterPlayerRoom.getIngresarSala75().click();
    }

      public void cambiarFocoVentana()
    {
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1 =s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }


    public void contenedorAreaChat(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getAreaChat()));
        this.enterPlayerRoom.getAreaChat().isDisplayed();
    }

    public void seleccionarBotonChat(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getBotonChat()));
        this.enterPlayerRoom.getBotonChat().click();
    }


    public void hacerClickCampoMensaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getCampoMsg()));
        this.enterPlayerRoom.getCampoMsg().click();
    }

    public void writeMensaje(String mensajeJugador1) {
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getCampoMsg()));
        this.enterPlayerRoom.getCampoMsg().sendKeys(mensajeJugador1);
    }

    public void enviarmensaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterPlayerRoom.getBotonEnviar()));
        this.enterPlayerRoom.getBotonEnviar().click();
    }


}
