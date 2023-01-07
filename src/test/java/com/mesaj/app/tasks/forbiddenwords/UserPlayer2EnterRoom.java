package com.mesaj.app.tasks.forbiddenwords;

import com.mesaj.app.models.Msg;
import com.mesaj.app.pageobjects.chatmessage.EnterBingoChatPlayerServices;
import com.mesaj.app.pageobjects.forbiddenwords.EnterRoomPlayer2Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("cucumber-glue")
@Component
public class UserPlayer2EnterRoom {

    @Autowired
    private EnterRoomPlayer2Services enterRoomPlayer2;


      public void changeWindow(){

          enterRoomPlayer2.SwitchWindowToChild();
      }



      public void ChatRoom() {
        enterRoomPlayer2.contendorChat();
        enterRoomPlayer2.botonChat();

    }

    public void withMensaje(Msg msg){
        enterRoomPlayer2.campoMsg();
        enterRoomPlayer2.writeMensaje(msg.getMensajeJugador2());

    }

    public void sendMessage(){
        enterRoomPlayer2.enviarmensaje();

    }
}
