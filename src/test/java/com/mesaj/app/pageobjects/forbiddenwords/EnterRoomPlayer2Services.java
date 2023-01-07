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
public class EnterRoomPlayer2Services {

    @Autowired
    private EnterRoomPlayer2PageObject enterRoomPlayer2;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void contenedorDeListas(){

        this.enterRoomPlayer2.getContenedorList();
    }

    public void seleccionarRooms() {

        this.enterRoomPlayer2.getRooms().click();
    }

    public void seleccionarListRooms() {
        this.enterRoomPlayer2.getListRooms().click();
    }

    public void verPantallaListRooms(){
            this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getVerPantallaListRooms()));
            this.enterRoomPlayer2.getVerPantallaListRooms().isDisplayed();
    }
    public void ListaCasinos(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getCasinos()));
        this.enterRoomPlayer2.getCasinos().click();
    }

    public void MostrarCasinos(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getBingoDropDown()));
        this.enterRoomPlayer2.getBingoDropDown().isDisplayed();
    }

    public void hacerClickCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getBotonCasino()));
        this.enterRoomPlayer2.getBotonCasino().click();
    }

    public void clickElementLanguage(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getLenguajes()));
        this.enterRoomPlayer2.getLenguajes().click();
    }

    public void maximizarListaLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getMaxBotonlenguaje()));
        this.enterRoomPlayer2.getMaxBotonlenguaje().click();
    }

    public void seleccionarLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getLanguageDropDown()));
        this.enterRoomPlayer2.getLanguageDropDown().click();
    }

    public void clickTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getTestPlayersDropDown()));
        this.enterRoomPlayer2.getTestPlayersDropDown().click();
    }
    public void maximizarListTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getMaxTestPlayer()));
        this.enterRoomPlayer2.getMaxTestPlayer().click();
    }
    public void seleccionarTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getTestPlayers()));
        this.enterRoomPlayer2.getTestPlayers().click();
    }

    public void bingoType75() {
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getUbicarBingoType()));
        this.enterRoomPlayer2.getUbicarBingoType().isDisplayed();
    }
    public void ingresarSalaBingo(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getIngresarSala75()));
        this.enterRoomPlayer2.getIngresarSala75().click();
    }

    public void SwitchWindowToChild()
    {
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1 =s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }
    public void contendorChat() {
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getAreaChat()));
        this.enterRoomPlayer2.getAreaChat().isDisplayed();
    }

    public void botonChat(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getBotonChat()));
        this.enterRoomPlayer2.getBotonChat().click();
    }

    public void campoMsg(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getCampoMsg()));
        this.enterRoomPlayer2.getCampoMsg().click();
    }

    public void writeMensaje(String mensajeJugador2) {
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getCampoMsg()));
        this.enterRoomPlayer2.getCampoMsg().sendKeys(mensajeJugador2);
    }

    public void  enviarmensaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterRoomPlayer2.getBotonEnviar()));
        this.enterRoomPlayer2.getBotonEnviar().click();
    }

}
