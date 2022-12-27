package com.mesaj.app.builders.data;

import com.mesaj.app.models.Msg;

public class ManagerBuilder {

    private Msg msg;

    private ManagerBuilder() {
        msg = Msg.builder().build();
    }

    public static ManagerBuilder anUser() {
        return new ManagerBuilder();
    }

    public ManagerBuilder but() {
        return withDefaultInfo();    }

    public ManagerBuilder withDefaultInfo() {
        this.msg = Msg.builder()
                .mensajeChatManager("Hola soy el Chat Manager bienvenidos a la sala de chat").build();

        return this;
    }

    public Msg build() {

        return this.msg;
    }

}
