package com.mesaj.app.pageobjects.chatmessage;

import com.mesaj.app.pageobjects.PageBase;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("cucumber-glue")
@Component
@Getter
public class EnterRoomManagerPageObject extends PageBase {
    @Autowired

    public EnterRoomManagerPageObject(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (xpath = "//div[@data-testing-tag='side-bar']")
    private WebElement contenedorList;

    @FindBy(xpath = "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[1]/div[5]/div[1]/label[1]/span[1]")
    private WebElement rooms;

    @FindBy (xpath = "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]/label[1]/span[1]")
    private WebElement listRooms;

    @FindBy (xpath = "//body/div[@id='wrapper-mobiApp']/div[2]/div[2]/div[1]")
    private WebElement verPantallaListRooms;

    @FindBy(xpath = "//div[@data-testing-tag='casinos-drop']")
    private WebElement casinos;

    @FindBy(xpath = "//button[@data-testing-tag='MaximizeActionBt']")
    private WebElement butonMaximizar;

    @FindBy(xpath = "//div[@data-testing-tag='1']")
    private WebElement bingoDropDown;

    @FindBy(xpath = "//button[@data-testing-tag='ArrowUpActionBt']")
    private WebElement botonCasino;

    @FindBy(xpath = "//div[@data-testing-tag='languages-drop']")
    private WebElement lenguajes;

    @FindBy(xpath ="//body/div[@id='wrapper-mobiApp']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement maxBotonlenguaje;

    @FindBy(xpath = "//div[@data-testing-tag='es-ES']")
    private WebElement languageDropDown;

    @FindBy(xpath = "//div[@data-testing-tag='testPlayers-drop']")
    private WebElement testPlayersDropDown;

    @FindBy(xpath = "//body/div[@id='wrapper-mobiApp']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")
    private WebElement maxTestPlayer;

    @FindBy(xpath =  "//div[@data-testing-tag='10260']")
    private WebElement testPlayers;

    @FindBy(xpath = "//div[@data-testing-tag='playerid-input']")
    private WebElement playerId;

    @FindBy(xpath = "//div[@data-testing-tag='playersession-input']")
    private WebElement sessionId;

    @FindBy(xpath = "//div[@data-testing-tag='datalist-roomslist']")
    private WebElement bingoType;

    @FindBy(xpath = "//div[@data-testing-tag='serverId_1']")
    private WebElement ubicarBingoType;

    @FindBy(xpath="//button[@data-testing-tag='PlayActionBt']")
    private WebElement ingresarSala75;

    @FindBy (xpath = "//div[@id='chatAreaBtsBar-mobiLayout']")
    private WebElement areaChat;

    @FindBy (xpath = "//button[@id='chatBt-mobiLayout']")
    private WebElement botonChat;

    @FindBy (xpath = "//input[@id='chat-input-field-mobiLayout']")
    private WebElement campoMsg;

    @FindBy (xpath = "//button[@id='chat-send-bt-mobiLayout']")
    private WebElement botonEnviar;

    }
