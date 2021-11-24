package com.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.paraInstanciar();
        obj1.nombre = "Pepe";
        Singleton obj2 = Singleton.paraInstanciar();

        System.out.println(obj2.nombre);
    }
}
