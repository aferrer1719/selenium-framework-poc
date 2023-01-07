package com.mesaj.app.tasks.chatmessage;

import com.mesaj.app.models.Msg;
import com.mesaj.app.pageobjects.chatmessage.EnterBingoChatPlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("cucumber-glue")
@Component
public class UserChatPlayer {

    @Autowired
    private EnterBingoChatPlayerServices bingoChat;


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
