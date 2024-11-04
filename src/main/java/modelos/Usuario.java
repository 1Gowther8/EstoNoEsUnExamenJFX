package modelos;


import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.LocalDate.now;
@Data
public class Usuario {
    private String correo;
    private String plataforma;
    private Integer version;
    private String admin;
    private String hora;

    public Usuario(String correo, String plataforma, Integer version, String admin) {
        this.correo = correo;
        this.plataforma = plataforma;
        this.version = version;
        this.admin = admin;
        this.hora= LocalDateTime.now().toString();


    }

   /* public Usuario(String correo, String plataforma, Integer version, String admin) {
        this.correo = correo;
        this.plataforma = plataforma;
        this.version = version;
        this.admin = admin;

        /*
        this.hora= String.valueOf(now());
        this.fecha= String.valueOf(now());*/
    }

