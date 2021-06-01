package com.example.login;

import java.io.Serializable;

public class Usuario implements Serializable {
    String correo;
    String apodo;//2
    String nombre;//3
    String apellido; //4
    String password; //5
    String url;


    public Usuario(String correo, String apodo, String nombre, String apellido, String password, String url) {
        this.correo = correo;
        this.apodo = apodo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "correo='" + correo + '\'' +
                ", apodo='" + apodo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Usuario() {
    }

    public Usuario(String correo, String apodo, String nombre, String apellido, String password) {
        this.correo = correo;
        this.apodo = apodo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }

    public Usuario(String apodo, String password) {
        this.apodo = apodo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
