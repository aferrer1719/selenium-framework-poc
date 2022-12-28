package com.mesaj.app.tasks;

import lombok.Getter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Scope("cucumber-glue")
@Component
public class NavigateTo {

    @Getter
    @Autowired
    private WebDriver webDriver;

    @Value("${url}")
    private String url;

    public void signUpPage(){
        this.webDriver.get(url);
    }

    public String getActualTab()
    {
        return webDriver.getWindowHandle();
    }
    public void newTab(){
        WebElement body = webDriver.findElement(By.cssSelector("body"));
        WebElement body1 = webDriver.findElement(By.tagName("body"));
        body1.sendKeys(Keys.CONTROL+"N");
        body.sendKeys(Keys.CONTROL+"T");
        new Actions(webDriver).keyDown(Keys.CONTROL).sendKeys("n").perform();
        webDriver.switchTo().newWindow(WindowType.TAB);
        ArrayList<String> tabs = new ArrayList<String> (webDriver.getWindowHandles());
        //webDriver.switchTo().window(tabs.get(2));

    }

    public String getNewTab(List<String> tabNames)
    {
        Set<String> actualTabs = webDriver.getWindowHandles();
        Iterator<String> iterator = actualTabs.iterator();
        while (iterator.hasNext()){
            String tab = iterator.next();
            if(!tabNames.contains(tab)){
                return tab;
            }
        }

        return "";
    }

    public void changeTab(String tabName){
        webDriver.switchTo().window(tabName);
    }
}


