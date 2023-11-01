package com.example.recyclerview.models;

public class Pikachu extends Pokemon{
    private Chapete chapeteIzquierdo;
    private Chapete chapeteDerecho;

    public Pikachu(Chapete chapeteIzquierdo, Chapete chapeteDerecho) {
        this.chapeteIzquierdo = chapeteIzquierdo;
        this.chapeteDerecho = chapeteDerecho;
    }

    public Chapete getChapeteIzquierdo() {
        return chapeteIzquierdo;
    }

    public void setChapeteIzquierdo(Chapete chapeteIzquierdo) {
        this.chapeteIzquierdo = chapeteIzquierdo;
    }

    public Chapete getChapeteDerecho() {
        return chapeteDerecho;
    }

    public void setChapeteDerecho(Chapete chapeteDerecho) {
        this.chapeteDerecho = chapeteDerecho;
    }
}
