package edu.escuelaing.arsw.picasYfamas.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class picasFamasService {
    private int picas;
    private int famas;
    private int vidas;
    private List<Integer> listaNumeros = new ArrayList<>();
    private boolean victoria;

    public picasFamasService() {
        generateRamdomNum();
    }
    
    public int determinaPica(int num, int pos, List<Integer> numero) {
        int devuelve = 0;
        for (int i = 0; i < 4; i++) {
            if (num == numero.get(i) && pos != (i + 1)) {
                devuelve = 1;
                break;
            }
        }
        return devuelve;
    }
    
    public void play(int num) {
        int n1, n2, n3, n4;
        picas = 0;
        famas = 0;
        n1 = (num / 1000);
        n2 = ((num % 1000) / 100);
        n3 = (((num % 1000) % 100) / 10);
        n4 = (((num % 1000) % 100) % 10);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        if (n1 == listaNumeros.get(0) && n2 == listaNumeros.get(1) && n3 == listaNumeros.get(2) && n4 == listaNumeros.get(3)) {
            famas += 4;
            vidas--;
        } else {
            picas = picas + determinaPica(n1, 1, listaNumeros);
            picas = picas + determinaPica(n2, 2, listaNumeros);
            picas = picas + determinaPica(n3, 3, listaNumeros);
            picas = picas + determinaPica(n4, 4, listaNumeros);

            if (n1 == listaNumeros.get(0)) {
                famas ++;
                
            }
            if (n2 == listaNumeros.get(1)) {
                famas ++;
                
            }
            if (n3 == listaNumeros.get(2)) {
                famas ++;
                
            }
            if (n4 == listaNumeros.get(3)) {
                famas ++;
                
            }
            vidas--;
        }
    }
        
    
    public List<Integer> generateRamdomNum() {
        vidas = 6;
        listaNumeros.clear();
        Random ramdom = new Random();
        for (int i = 0; i < 4; i++) {
            int numero = ramdom.nextInt(10);
            listaNumeros.add(numero);
        }
        return listaNumeros;
    }

    public boolean isFinished() {
        Boolean bandera = false;
        if (getVidas() <= 0) {
            bandera = true;
            victoria = false;
        } else if (vidas > 0 && famas == 4) {
            bandera = true;
            victoria = true;
        }
        return bandera;
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
