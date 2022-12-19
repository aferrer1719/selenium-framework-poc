package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class MenuSalasServices {

    @Autowired
    private MenuSalasPageObject menuSalasPageObject;

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
}
