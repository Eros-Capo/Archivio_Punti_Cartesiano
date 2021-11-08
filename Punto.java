package com.palestrajava;

import java.util.Scanner;

public class Punto {

    private char nome;
    private int x;
    private int y;

    public Punto(){

    }

    public Punto(char nome, int x, int y){
        this.nome=nome;
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return nome+"x: "+x+"y: "+ y;
    }

    public char getNome(){
        return nome;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void assegnaValori(){
        Scanner s=new Scanner(System.in);

        System.out.println("Inserire la lettera assegnata al punto...");
        nome=s.next().charAt(0);

        System.out.println("Inserire il valore della x...");
        x=s.nextInt();

        System.out.println("Inserire il valore della y...");
        y=s.nextInt();

    }

}
