package com.mesaj.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor


public class Msg {
    private String mensaje = "Hola soy el jugador 1";
    private String mensajeChatManager = "Hola soy el Chat Manager bienvenidos a la sala de chat";
}
