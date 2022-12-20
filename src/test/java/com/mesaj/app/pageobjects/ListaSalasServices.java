package com.mesaj.app.pageobjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class ListaSalasServices {

    @Autowired
    private ListaSalasPageObject listaSalas;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void ListaCasinos(){
        this.listaSalas.getCasinos().click();
    }

    public void MostrarCasinos(){
        this.listaSalas.getBingoDropDown().isDisplayed();
    }

    public void hacerClickCasino(){
        this.listaSalas.getBotonCasino().click();
    }

    public void clickElementLanguage(){
        this.listaSalas.getLenguajes().click();
    }


}
