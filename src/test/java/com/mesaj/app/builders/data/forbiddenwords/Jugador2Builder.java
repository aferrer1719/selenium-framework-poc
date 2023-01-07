package com.mesaj.app.builders.data.forbiddenwords;

import com.mesaj.app.models.Msg;

public class Jugador2Builder {

    private Msg msg;

    private Jugador2Builder() {
        msg = Msg.builder().build();
    }

    public static Jugador2Builder anUser() {
        return new Jugador2Builder();
    }

    public Jugador2Builder but() {
        return withDefaultInfo();    }

    public Jugador2Builder withDefaultInfo() {
        this.msg = Msg.builder()
                .mensajeJugador2("Hola Jugadores espero tengan mucha suerte(a-beaming)").build();

        return this;
    }

    public Msg build() {

        return this.msg;
    }

}
