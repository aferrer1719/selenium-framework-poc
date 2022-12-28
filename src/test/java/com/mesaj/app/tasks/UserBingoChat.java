package com.mesaj.app.tasks;

import com.mesaj.app.models.Msg;
import com.mesaj.app.models.User;
import com.mesaj.app.pageobjects.BingoChatServices;
import com.mesaj.app.pageobjects.SignUpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Scope("cucumber-glue")
@Component
public class UserBingoChat {

    @Autowired
    private BingoChatServices bingoChat;


      public void cambiarVentana(){

          bingoChat.SwitchWindowToChild();
      }

      public void salaChat() {
        bingoChat.contendorChat();
        bingoChat.botonChat();

    }

    public void withMensaje(Msg msg){
        bingoChat.campoMsg();
        bingoChat.writeMensaje(msg.getMensaje());

    }

    public void enviarMensaje(){
        bingoChat.enviarmensaje();

    }
}
