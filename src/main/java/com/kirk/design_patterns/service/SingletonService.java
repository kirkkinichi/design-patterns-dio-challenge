package com.kirk.design_patterns.service;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    private int contador = 0;
    private int aux = 0;

    public int incrementarContador() {
        return ++contador;
    }

    public int decrementarContador() {
        return --contador;
    }

    public int multiplicarContador(int aux) {
        contador = contador * aux;
        return contador;
    }

    public int dividirContador(int aux) {
        contador = contador / aux;
        return contador;
    }

    public int getContador() {
        return contador;
    }
}
