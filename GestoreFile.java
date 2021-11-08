package com.palestrajava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GestoreFile {
    static final String FILE="C:\\Users\\Eros Capobianco\\IdeaProjects\\RAFcompleto\\src\\com\\palestrajava\\dati";

    public GestoreFile(){

    }

    public byte[] leggiDati( int pos, int size){

        byte[] datiLetti=new byte[size];

        try {
            RandomAccessFile raf=new RandomAccessFile(FILE,"r");
            raf.seek(pos);
            raf.read(datiLetti);
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datiLetti;
    }

    public void scriviDati(String dati, int pos){

        try {
            RandomAccessFile raf=new RandomAccessFile(FILE,"rw");
            raf.seek(pos);
            raf.writeChars(dati);
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scriviPunto(Punto p, int pos){

        try {
            RandomAccessFile raf=new RandomAccessFile(FILE,"rw");
            raf.seek(pos);
            raf.writeChar(p.getNome());
            raf.writeChars(String.valueOf(p.getX()));
            raf.writeChars(String.valueOf(p.getY()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
