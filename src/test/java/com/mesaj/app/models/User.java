package com.mesaj.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String usuario = "bingoFullGlobal";
    private String contrasena = "mob_M_2017";


}
