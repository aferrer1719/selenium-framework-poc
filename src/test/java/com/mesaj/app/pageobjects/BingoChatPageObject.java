package com.mesaj.app.pageobjects;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Scope("cucumber-glue")
@Component
@Getter
public class BingoChatPageObject extends PageBase {

    @Autowired
    public BingoChatPageObject (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@id='chatAreaBtsBar-mobiLayout']")
    private WebElement areaChat;

    @FindBy (xpath = "//button[@id='chatBt-mobiLayout']")
    private WebElement botonChat;

    @FindBy (xpath = "//input[@id='chat-input-field-mobiLayout']")
    private WebElement campoMsg;

    @FindBy (xpath = "//button[@id='chat-send-bt-mobiLayout']")
    private WebElement botonEnviar;

}

