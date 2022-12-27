package com.mesaj.app.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
@Scope("cucumber-glue")
public class IngresoChatManagerServices {

    @Autowired
    private IngresoChatManagePageObject ingresoChatManager;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void visualizarBackoffice(){
    this.ingresoChatManager.getContenedorList();
    }

    public void seleccionarSala() {
     this.ingresoChatManager.getRooms().click();
    }

    public void seleccionarListRooms() {
      this.ingresoChatManager.getListRooms().click();
    }

    public void pantallaListRooms(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getVerPantallaListRooms()));
        this.ingresoChatManager.getVerPantallaListRooms().isDisplayed();
    }
    public void mostrarListaCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getCasinos()));
        this.ingresoChatManager.getCasinos().click();
    }

    public void seleccionarCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getBingoDropDown()));
        this.ingresoChatManager.getBingoDropDown().isDisplayed();
    }

    public void cerrarlistaCasino(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getBotonCasino()));
        this.ingresoChatManager.getBotonCasino().click();
    }

    public void mostrarListaLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getLenguajes()));
        this.ingresoChatManager.getLenguajes().click();
    }

    public void maximizarListaLenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getMaxBotonlenguaje()));
        this.ingresoChatManager.getMaxBotonlenguaje().click();
    }

    public void seleccionarlenguaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getLanguageDropDown()));
        this.ingresoChatManager.getLanguageDropDown().click();
    }

    public void clickTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getTestPlayersDropDown()));
        this.ingresoChatManager.getTestPlayersDropDown().click();
    }
    public void maximizarListTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getMaxTestPlayer()));
        this.ingresoChatManager.getMaxTestPlayer().click();
    }
    public void seleccionarTestPlayers(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getTestPlayers()));
        this.ingresoChatManager.getTestPlayers().click();
    }

    public void visualizarPlayerId(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getPlayerId()));
        this.ingresoChatManager.getPlayerId().click();
    }

    public void visualizarSessionId(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getSessionId()));
        this.ingresoChatManager.getSessionId().click();
    }
    public void seleccionarBingoType75() {
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getUbicarBingoType()));
        this.ingresoChatManager.getUbicarBingoType().isDisplayed();
    }
    public void ingresarSalaBingo(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getIngresarSala75()));
        this.ingresoChatManager.getIngresarSala75().click();
    }

      public void cambiarFocoVentana()
    {
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1 =s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }

    public void botonChat(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getAreaChat()));
        this.ingresoChatManager.getAreaChat().click();
    }

    public void seleccionarBotonChat(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getBotonChat()));
        this.ingresoChatManager.getBotonChat().click();
    }


    public void hacerClickCampoMensaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getCampoMsg()));
        this.ingresoChatManager.getCampoMsg().click();
    }

    public void writeMensaje(String mensajeChatManager) {
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getCampoMsg()));
        this.ingresoChatManager.getCampoMsg().sendKeys(mensajeChatManager);
    }

    public void  enviarmensaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.ingresoChatManager.getBotonEnviar()));
        this.ingresoChatManager.getBotonEnviar().click();
    }


}
