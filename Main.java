package com.palestrajava;

public class Main {

    public static void main(String[] args) {

        Punto puntoUno=new Punto('a',1,2);
        Punto puntoDue=new Punto();
        Punto puntoTre=new Punto('a',1,2);
        Punto puntoQuattro=new Punto('a',1,2);
        Punto puntoCinque=new Punto('a',1,2);
        GestoreFile gf=new GestoreFile();

        gf.scriviPunto(puntoUno,0);

        puntoDue.assegnaValori();
        gf.scriviPunto(puntoDue,10);
        gf.scriviPunto(puntoTre,20);
        gf.scriviPunto(puntoQuattro,30);
        gf.scriviPunto(puntoCinque,40);
        System.out.println("Il primo punto inserito: ");
        System.out.println(new String(gf.leggiDati(0,9)));
        System.out.println("Il secondo punto inserito: ");
        System.out.println(new String(gf.leggiDati(10,9)));

        gf.scriviDati("Ciaoooooo",20);
        System.out.println(new String(gf.leggiDati(20,20)));
    }
}
