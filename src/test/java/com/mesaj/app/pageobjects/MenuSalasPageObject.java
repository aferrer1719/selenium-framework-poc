package com.mesaj.app.pageobjects;

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
public class MenuSalasPageObject extends PageBase {
    @Autowired
    public MenuSalasPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = " //div[@data-testing-tag='side-bar']")
    private WebElement contenedorList;
    @FindBy(xpath = "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[1]/div[5]/div[1]/label[1]/span[1]")
    private WebElement rooms;

    @FindBy (xpath = "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]/label[1]/span[1]")
    private WebElement listRooms;

    @FindBy (xpath = "//body/div[@id='wrapper-mobiApp']/div[2]/div[2]/div[1]")
    private WebElement verPantallaListRooms;
}
