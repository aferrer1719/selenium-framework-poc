package com.mesaj.app.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class SignUpServices {

    @Autowired
    private SignUpPageObject signUpPageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeUsuario(String usuario) {
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPageObject.getUsuarioTextbox()));
        this.signUpPageObject.getUsuarioTextbox().sendKeys(usuario);
    }

    public void writeContrasena(String contrasena) {
        this.signUpPageObject.getContrasena().sendKeys(contrasena);
    }

     public void clickOnSubmit() {
        this.signUpPageObject.getSubmit().click();
    }

     public void pantallaPrincipal(){
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPageObject.getPantallaPrincipal()));
        this.signUpPageObject.getPantallaPrincipal().isDisplayed();
     }




}
