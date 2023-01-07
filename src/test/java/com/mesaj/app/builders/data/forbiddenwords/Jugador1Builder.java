package com.mesaj.app.builders.data.forbiddenwords;

import com.mesaj.app.models.Msg;

public class Jugador1Builder {

    private Msg msg;

    private Jugador1Builder() {
        msg = Msg.builder().build();
    }

    public static Jugador1Builder anUser() {
        return new Jugador1Builder();
    }

    public Jugador1Builder but() {
        return withDefaultInfo();    }

    public Jugador1Builder withDefaultInfo() {
        this.msg = Msg.builder()
               .mensajeJugador1("jodete capullo vamos a jugar").build();
                //.mensajeChatManager(msg.getMensajeChatManager()).build();
        return this;
    }

    public Msg build() {

        return this.msg;
    }

}
