package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Component
@Scope("cucumber-glue")
public class BingoChatServices {

    @Autowired
    private BingoChatPageObject bingoChatPage;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;



    public void SwitchWindowToChild()
    {
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1 =s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }
    public void contendorChat() {
        this.wait.until(ExpectedConditions.visibilityOf(this.bingoChatPage.getAreaChat()));
        this.bingoChatPage.getAreaChat().isDisplayed();
    }

    public void botonChat(){
        this.wait.until(ExpectedConditions.visibilityOf(this.bingoChatPage.getBotonChat()));
        this.bingoChatPage.getBotonChat().click();
                    }

      public void campoMsg(){
          this.wait.until(ExpectedConditions.visibilityOf(this.bingoChatPage.getCampoMsg()));
          this.bingoChatPage.getCampoMsg().click();
      }

    public void writeMensaje(String mensaje) {
        this.wait.until(ExpectedConditions.visibilityOf(this.bingoChatPage.getCampoMsg()));
        this.bingoChatPage.getCampoMsg().sendKeys(mensaje);
    }

    public void  enviarmensaje(){
        this.wait.until(ExpectedConditions.visibilityOf(this.bingoChatPage.getBotonEnviar()));
        this.bingoChatPage.getBotonEnviar().click();
    }
}
