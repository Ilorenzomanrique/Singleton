package com.Singleton;

public class Singleton {
    // variable instanciar
    public String nombre;
    private static Singleton instanciar = null;

    //privado para no poder instanciar

    private Singleton() {

    }

    // puedo acceder al constructor porque estoy en la misma clase


    public static Singleton paraInstanciar() {
        if(instanciar == null){
            instanciar = new Singleton();
        }

        return instanciar;
    }
}
