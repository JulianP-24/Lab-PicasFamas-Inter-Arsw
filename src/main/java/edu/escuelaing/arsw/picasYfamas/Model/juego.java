package edu.escuelaing.arsw.picasYfamas.Model;

import java.util.ArrayList;
import java.util.List;

public class juego {
    private int picas;
    private int famas;
    private int vidas;
    private List<Integer> listaNumeros;
    private boolean victoria;


    public juego() {

    }
    
    public int getPicas() {
        return picas;
    }
    
    public int getFamas() {
        return famas;
    }

    public int getVidas() {
        return vidas;
    }

    public boolean getVictoria() {
        return victoria;
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }
}
