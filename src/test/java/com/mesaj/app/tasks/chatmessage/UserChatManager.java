package com.mesaj.app.tasks.chatmessage;

import com.mesaj.app.models.Msg;
import com.mesaj.app.pageobjects.chatmessage.EnterRoomManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UserChatManager {

    @Autowired
    private EnterRoomManagerServices chatManager;



    public void cambiarTags() {
      chatManager.cambiarFocoVentana();
    }

    public void seleccionarChat() {
        chatManager.contenedorAreaChat();
        chatManager.seleccionarBotonChat();
          }

    public void withMensaje(Msg msg) {
        chatManager.hacerClickCampoMensaje();
        chatManager.writeMensaje(msg.getMensajeChatManager());
    }

    public void enviarMensajeChat(){
        chatManager.enviarmensaje();
    }

}
