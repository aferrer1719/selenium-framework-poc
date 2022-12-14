package com.mesaj.app.builders.data;

import com.mesaj.app.models.User;

public class UserBuilder {

    private User user;

    private UserBuilder() {
        user = User.builder().build();
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder but() {
        return withDefaultInfo();
    }

    public UserBuilder withDefaultInfo() {
        this.user = User.builder()
                .usuario("bingoFullGlobal")
                .contrasena("mob_M_2017").build();

        return this;
    }

    public UserBuilder withoutUsuario() {
        user.setUsuario("");
        return this;
    }

    public UserBuilder withoutContrasena() {
        user.setContrasena("");
        return this;
    }

    public User build() {

        return this.user;
    }



}

