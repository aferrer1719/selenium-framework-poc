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
public class SignUpPageObject extends PageBase{

    @Autowired
    public SignUpPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement usuarioTextbox;

    @FindBy(xpath ="//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
    private WebElement contrasena;

    @FindBy(xpath= "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[3]/button[1]")
    private WebElement submit;

    @FindBy (xpath = "//body/div[@id='wrapper-mobiApp']/div[2]/div[2]/div[1]/div[3]")
    private WebElement pantallaPrincipal;

    @FindBy (xpath = "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[1]/div[5]/div[1]/label[1]/span[1]")
    private WebElement Rooms;

    @FindBy (xpath = "//body/div[@id='wrapper-mobiApp']/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]/label[1]/span[1]")
    private WebElement ListRooms;
}
