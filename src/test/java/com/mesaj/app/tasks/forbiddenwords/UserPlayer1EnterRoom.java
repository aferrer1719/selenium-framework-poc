package com.mesaj.app.tasks.forbiddenwords;

import com.mesaj.app.models.Msg;
import com.mesaj.app.pageobjects.forbiddenwords.EnterRoomPlayer1Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UserPlayer1EnterRoom {

    @Autowired
    private EnterRoomPlayer1Services chatRoomPlayer1;



    public void cambiarTags() {
      chatRoomPlayer1.cambiarFocoVentana();
    }

    public void seleccionarChat() {
        chatRoomPlayer1.contenedorAreaChat();
        chatRoomPlayer1.seleccionarBotonChat();
          }

    public void withMensaje(Msg msg) {
        chatRoomPlayer1.hacerClickCampoMensaje();
        chatRoomPlayer1.writeMensaje(msg.getMensajeJugador1());
    }

    public void enviarMensajeChat(){
        chatRoomPlayer1.enviarmensaje();
    }

}
