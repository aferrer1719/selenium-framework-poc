package com.mesaj.app.builders.data.chatmessage;

import com.mesaj.app.models.Msg;

public class PlayerBuilder {

    private Msg msg;

    private PlayerBuilder() {
        msg = Msg.builder().build();
    }

    public static PlayerBuilder anUser() {
        return new PlayerBuilder();
    }

    public PlayerBuilder but() {
        return withDefaultInfo();    }

    public PlayerBuilder withDefaultInfo() {
        this.msg = Msg.builder()
                .mensaje("Hola soy el jugador 1").build();

        return this;
    }

    public Msg build() {

        return this.msg;
    }

}
