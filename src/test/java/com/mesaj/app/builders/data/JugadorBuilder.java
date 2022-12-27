package com.mesaj.app.builders.data;

import com.mesaj.app.models.Msg;
import com.mesaj.app.models.User;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JugadorBuilder {

    private Msg msg;

    private JugadorBuilder() {
        msg = Msg.builder().build();
    }

    public static JugadorBuilder anUser() {
        return new JugadorBuilder();
    }

    public JugadorBuilder but() {
        return withDefaultInfo();    }

    public JugadorBuilder withDefaultInfo() {
        this.msg = Msg.builder()
                .mensaje("Hola soy el jugador 1").build();

        return this;
    }

    public Msg build() {

        return this.msg;
    }

}
