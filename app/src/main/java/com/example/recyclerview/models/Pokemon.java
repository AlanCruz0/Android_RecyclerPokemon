package com.example.recyclerview.models;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nombre;
    private Integer numero;
    private Tipo tipo;

    private List<String> ataque;

    public List<String> getAtaque() {
        return ataque;
    }

    public void setAtaque(List<String> ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
